import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese resistencia 1: ");
        float r1 = scanner.nextFloat();
        System.out.print("Ingrese resistencia 2: ");
        float r2 = scanner.nextFloat();
        System.out.print("Ingrese resistencia 3: ");
        float r3 = scanner.nextFloat();

        float resTotal = 1/((1/r1) + (1/r2) + (1/r3));

        System.out.println("La resistencia total es de: " + resTotal);
    }
}