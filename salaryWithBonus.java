import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String employer_name = scanner.nextLine();
        String sSal = scanner.nextLine();
        String sSold = scanner.nextLine();
        
        float salary = Float.parseFloat(sSal);
        float total_sold = Float.parseFloat(sSold);

        double total = salary + (total_sold * 0.15);
  
        System.out.println("TOTAL = R$ " +String.format("%.2f", total));
    }
}