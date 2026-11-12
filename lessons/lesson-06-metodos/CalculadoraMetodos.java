public class CalculadoraMetodos {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        System.out.println("=== CALCULADORA ===");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println();
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero");
        } else {
            System.out.println("División: " + dividir(num1, num2));
        }
    }
}
