import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        
        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);

        int x = a+b;

        System.out.println("X = " + x);
    }
 
}