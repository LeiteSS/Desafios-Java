package Simple Sum;
import java.io.IOException;
import java.util.Scanner;

public class simpleSum {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        
        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);

        int SOMA = a+b;

        System.out.println("SOMA = " + SOMA);
    }
}