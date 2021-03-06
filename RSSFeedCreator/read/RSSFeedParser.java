package read;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

import rss.model.FeedMessage;
import rss.model.Feed;

public class RSSFeedParser {
    static final String TITLE = "title";
    static final String DESCRIPTION ="description";
    static final String CHANNEL ="channel";
    static final String LINK = "link";
    static final String LANGUAGE = "language";
    static final String COPYRIGHT = "copyright";
    static final String ITEM ="item";
    static final String PUB_DATE = "pubDate";
    static final String AUTHOR = "author";
    static final String GUID = "guid";
    
    final URL url;
    
    public RSSFeedParser(String feedUrl) {
        try {
            this.url = new URL(feedUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Feed readFeed() {
        Feed feed = null;
        try {
            boolean isFeedHeader = true;
            // Set header values initial to the empty string
            String description = "";
            String link = "";
            String title = "";
            String language = "";
            String copyright = "";
            String author = "";
            String pubDate = "";
            String guid = "";
            
            // First Create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // Setup a  new reader
            InputStream in = read();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            // Read the XML document
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    String localPart = event.asStartElement().getName().getLocalPart();
                    switch (localPart) {
                        case ITEM:
                            if (isFeedHeader) {
                                isFeedHeader = false;
                                feed = new Feed(title, link, description, language, copyright, pubDate);
                            }
                            event = eventReader.nextEvent();
                            break;
                        case TITLE:
                            title = getCharacterData(event, eventReader);
                            break;
                        case DESCRIPTION:
                            description = getCharacterData(event, eventReader);
                            break;
                        case LINK:
                            link = getCharacterData(event, eventReader);
                            break;
                        case GUID:
                            guid = getCharacterData(event, eventReader);
                            break;
                        case LANGUAGE:
                            language = getCharacterData(event, eventReader);
                            break;
                        case AUTHOR:
                            author = getCharacterData(event, eventReader);
                            break;
                        case PUB_DATE:
                            pubDate = getCharacterData(event, eventReader);
                            break;
                        case COPYRIGHT:
                            copyright = getCharacterData(event, eventReader);
                            break;
                    }
                } else if (event.isEndElement()) {
                    if (event.asEndElement().getName().getLocalPart() == (ITEM)) {
                        FeedMessage message = new FeedMessage();
                        message.setAuthor(author);
                        message.setDescription(description);
                        message.setGuid(guid);
                        message.setLink(link);
                        message.setTitle(title);
                        feed.getMessages().add(message);
                        event = eventReader.nextEvent();
                        continue;
                    }
                }
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
        return feed;
    }
    
    private InputStream read() {
        try {
            return url.openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
 * Reads the data from the {@link XMLEvent} and returns it. CData
 * will be handled special.
 * @param event {@link XMLEvent}
 * @param eventReader Reader for Reading {@link XMLEvent}
 * @return Character data from element
 * @throws XMLStreamException
 * source-code: https://www.programcreek.com/java-api-examples/?class=javax.xml.stream.XMLEventReader&method=nextEvent"
 */
    private String getCharacterData(XMLEvent event, final XMLEventReader eventReader) throws XMLStreamException {
	String result = "";
	event = eventReader.nextEvent();
	if (event instanceof Characters) {
		result = event.asCharacters().getData();
	}
	return result;
    }
}
