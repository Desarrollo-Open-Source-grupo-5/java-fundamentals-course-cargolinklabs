public class BucleWhile {
    public static void main(String[] args) {
        // Ejemplo 1: Contador simple
        System.out.println("=== CONTADOR CON WHILE ===");
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Cuenta: " + contador);
            contador++;
        }

        // Ejemplo 2: Suma de números
        System.out.println("\n=== SUMA DE NÚMEROS 1-10 ===");
        int suma = 0;
        int numero = 1;

        while (numero <= 10) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma es: " + suma);
    }
}
