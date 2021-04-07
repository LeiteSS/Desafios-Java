package Area of a Circle;
import java.util.Scanner;
import java.io.IOException;

public class areaOfACircle {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        String numR = scanner.nextLine();
        
        double r = Double.parseDouble(numR);
        double pi = 3.14159;

        double a = pi*(r*r);

        System.out.println("A=" + String.format("%.4f", a));
    }
}