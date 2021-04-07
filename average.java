import java.io.IOException;
import java.util.Scanner;

public class average {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);

        double med = (((numA*3.5)+(numB*7.5))/(3.5+7.5));
  
        System.out.println("MEDIA = " +String.format("%.5f", med));
    }
}