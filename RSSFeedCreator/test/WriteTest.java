package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import rss.model.FeedMessage;
import rss.model.Feed;
import write.RSSFeedWriter;

public class WriteTest {
    
    public static void main(String[] args) {
        // create the rss feed
        String copyright = "Testes Testando";
        String title = "Testando";
        String description = "Testando...1,2...testando...som, som, som...testando...Ta funcionando?...som...testando";
        String language = "pt-br";
        String link = "www.canitrun.com";
        
        Calendar cal = new GregorianCalendar();
        Date creationDate = cal.getTime();
        SimpleDateFormat date_format = new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
        String pubdate = date_format.format(creationDate);
        
        Feed rssFeeder = new Feed(title, link, description, language, copyright, pubdate);
        
        // now add one example entry
        FeedMessage feed = new FeedMessage();
        feed.setTitle("RSS Feed - Radio Jamaica");
        feed.setDescription("Da Jamaica até sua casa");
        feed.setAuthor("Niko Mai Breda");
        feed.setGuid("rss.rss.rss.rss");
        feed.setLink("rss.rss.rss.rss");
        
        rssFeeder.getMessages().add(feed);
        
        // Now write the file
        RSSFeedWriter feedWriter = new RSSFeedWriter(rssFeeder, "documento.rss");
        try {
            feedWriter.write();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
