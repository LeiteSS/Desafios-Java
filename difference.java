import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String sA = scanner.nextLine();
        String sB = scanner.nextLine();
        String sC = scanner.nextLine();
        String sD = scanner.nextLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int d = Integer.parseInt(sD);

        int res = (a * b) - (c * d);
        System.out.println("DIFERENCA = " + res);
    }
 
}