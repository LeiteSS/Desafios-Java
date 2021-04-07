import java.io.IOException;
import java.util.Scanner;

public class average {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        
        float numA = Float.parseFloat(a);
        float numB = Float.parseFloat(b);
        float numC = Float.parseFloat(c);

        double med = (((numA*2)+(numB*3)+(numC*5))/(2+3+5));
  
        System.out.println("MEDIA = " +String.format("%.1f", med));
    }
}