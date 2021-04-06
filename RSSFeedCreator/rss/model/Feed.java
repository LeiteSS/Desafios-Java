package rss.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores an RSS feed
 */
public class Feed {
    final String title;
    final String description;
    final String link;
    final String language;
    final String copyright;
    final String pubDate;
    
    final List<FeedMessage> entries = new ArrayList<FeedMessage>();
    
    public Feed (String title, String description, String link, String language, String copyright, String pubDate) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.language = language;
        this.copyright = copyright;
        this.pubDate = pubDate;
    }
    
    public  List<FeedMessage> getMessages() {
        return entries;
    }
    
    public String getTitle() {
        return title;
    }
     
    public String getDescription() {
        return description;
    }
    
    public String getLink() {
        return link;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getCopyright() {
        return copyright;
    }
    
    public String getPubDate() {
        return pubDate;
    }
    
    @Override
    public String toString() {
        return "FeedMessage [title =" + title + ", "
                + "description=" + description + ", "
                + "link=" + link + ", language=" + language + ", "
                + "copyright=" + copyright + ", pubDate=" + pubDate + "]";
    }
    
}
