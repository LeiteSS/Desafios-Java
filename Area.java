import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), pi = 3.14159;
        double rectangled = (a*c)/2;
        double circle = pi *(c*c);
        double trapezium = ((a+b)*c)/2;
        double square = b*b;
        double rectangle = a*b;

        System.out.println("TRIANGULO: " +String.format("%.3f", rectangled));
        System.out.println("CIRCULO: " +String.format("%.3f", circle));
        System.out.println("TRAPEZIO: " +String.format("%.3f", trapezium));
        System.out.println("QUADRADO: " +String.format("%.3f", square));
        System.out.println("RETANGULO: " +String.format("%.3f", rectangle));
    }
}