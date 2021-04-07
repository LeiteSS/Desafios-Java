import java.io.IOException;
import java.util.Scanner; 

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int product_cod1 = scanner.nextInt(), product_unit1 = scanner.nextInt();
        double product_price1 = scanner.nextDouble();

        int product_cod2 = scanner.nextInt(), product_unit2 = scanner.nextInt();
        double product_price2 = scanner.nextDouble();

        double total = (product_price1*product_unit1) + (product_price2*product_unit2);
        System.out.println("VALOR A PAGAR: R$ " +String.format("%.2f", total));
    }
 
}