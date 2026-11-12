
import java.util.Scanner;
import java.util.Locale;

public class EntradaDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("=== REGISTRO DE DATOS ===");

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu estatura en metros: ");
        double estatura = sc.nextDouble();

        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + estatura + " metros");

        sc.close();
    }
}
