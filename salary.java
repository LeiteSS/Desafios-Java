import java.io.IOException;
import java.util.Scanner;

public class salary {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String number = scanner.nextLine();
        String hours = scanner.nextLine();
        String per_hour = scanner.nextLine();
        
        int employer_number = Integer.parseInt(number);
        int worked_hours = Integer.parseInt(hours);
        float amount_received_per_hour = Float.parseFloat(per_hour);

        float salary_total = worked_hours*amount_received_per_hour;

        System.out.println("NUMBER = " + employer_number);
        System.out.println("SALARY = U$ " +String.format("%.2f", salary_total));
    }
}