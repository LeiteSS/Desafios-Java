package Simple Product;
import java.io.IOException;
import java.util.Scanner;

public class simpleProduct {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        int PROD = numA*numB;
        System.out.println("PROD = " +PROD);
    }
}