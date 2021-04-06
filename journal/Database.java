package journal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Database {
    private ArrayList<Entry> entries;
    
    public Database() {
        entries = new ArrayList<>();
    }
    
    public void addEntry(LocalDateTime dateTime, String text) {
        entries.add(new Entry(dateTime, text));
    }
    
    public ArrayList<Entry> findEntries(LocalDateTime dateTime, boolean byTime) {
        ArrayList<Entry> found = new ArrayList<>();
        for (Entry entry : entries) { // filtered by time and date
            if ((byTime && (entry.getDateTime().equals(dateTime))) || (!byTime) && (entry.getDateTime().toLocalDate().equals(dateTime.toLocalDate()))) {
                    found.add(entry);
            }
        }
        return found;
    }
    
    public void deleteEntries(LocalDateTime dateTime) {
        ArrayList<Entry> found = new ArrayList<>();
        for (Entry entry : entries) {
            entries.remove(entry);
        }
    }
}
