
import java.util.Scanner;
import java.util.Locale;

public class CalculadoraInteractiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("=== CALCULADORA INTERACTIVA ===");

        System.out.print("Ingresa el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("\n=== RESULTADOS ===");

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));

        if (numero2 != 0) {
            System.out.println("Division: " + (numero1 / numero2));
        } else {
            System.out.println("No se puede dividir por cero");
        }

        sc.close();
    }
}
