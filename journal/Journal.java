package journal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Journal {
    private Database database;
    private Scanner scanner = new Scanner(System.in);
    
    public static DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("M/d/y HH:mm");
    public static DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("M/d/y");
    
    public Journal() {
        database = new Database();
    }
    
    
    private LocalDateTime readDateTime() {
        System.out.println("Enter date and time as mm/dd/yyyy hh:mm");
        LocalDateTime dateTime;
        
        // it prints an error message and calls the method again
        // Calling the same method we're into is called recursions.
        try {
            dateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormater);
        } catch (DateTimeParseException e) {
            System.out.println("Error. Please try again.");
            return readDateTime();
        }
        return dateTime;
    }
    
    private LocalDate readDate() {
        System.out.println("Enter date as mm/dd/yyyy");
        LocalDate date;
        try {
            date = LocalDate.parse(scanner.nextLine(), dateFormater);
        } catch (DateTimeParseException e) {
            System.out.println("Error. Please try again.");
            return readDate();
        }
        return date;
    }
    
    public void printEntries(LocalDate day) {
        ArrayList<Entry> entries = database.findEntries(day.atStartOfDay(), false);
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }
    
    public void addEntry() {
        LocalDateTime dateTime = readDateTime();
        System.out.println("Enter the entry text:");
        String text = scanner.nextLine();
        database.addEntry(dateTime, text);
    }
    
    public void searchEntries() {
        // Entering the date
        LocalDateTime dateTime = readDate().atStartOfDay();
        // Searching for entries
        ArrayList<Entry> entries = database.findEntries(dateTime, false);
        // Printing entries
        if (entries.size() > 0) {
            System.out.println("Entries found: ");
            for (Entry entry : entries) {
                System.out.println(entry);
            }
        } else {
            // Nothing found
            System.out.println("No entries were found.");
        }
        scanner.nextLine(); // wait for enter
    }
    
    public void deleteEntries() {
        System.out.println("Entries with the same exact date and time will be deleted");
        LocalDateTime dateTime = readDateTime();
        database.deleteEntries(dateTime);
    }
    
    public void printHomeScreen() {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to you journal!");
        System.out.println("Today is: " + LocalDateTime.now().format(dateTimeFormater));
        System.out.println();
        // printing the home screen
        System.out.println("Today:\n--------");
        printEntries(LocalDate.now());
        System.out.println();
        System.out.println("Tomorrow:\n---------");
        printEntries(LocalDate.now().plusDays(1));
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // journal intance
        Journal journal = new Journal();
        String choice = "0";
        // main loop
        while(!choice.equals("4")) {
            journal.printHomeScreen();
            System.out.println();
            System.out.println("Choose an action:");
            System.out.println("1 - Add an entry");
            System.out.println("2 - Search an entry");
            System.out.println("3 - Dlete entries");
            System.out.println("4 - End");
            choice = scanner.nextLine();
            System.out.println();
            // reaction to the choice
            switch (choice) {
                case "1":
                    journal.addEntry();
                    break;
                case "2":
                    journal.searchEntries();
                    break;
                case "3":
                    journal.deleteEntries();
                    break;
                case "4":
                    System.out.println("Press any key to quit the program...");
                    break;
                default:
                    System.out.println("Error. Press any key to choose another action.");
                    break;
            }
        }
    }
}
