import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double radius = scan.nextDouble();
        double pi = 3.14159;
        double volume = (4/3.0)*pi*(radius*radius*radius);
        System.out.println("VOLUME = " +String.format("%.3f", volume));
 
    }
}