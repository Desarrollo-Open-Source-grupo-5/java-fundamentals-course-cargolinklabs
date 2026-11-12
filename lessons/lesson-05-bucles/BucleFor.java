public class BucleFor {
    public static void main(String[] args) {
        // Ejemplo 1: Números del 1 al 5
        System.out.println("=== NÚMEROS DEL 1 AL 5 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // Ejemplo 2: Suma de números
        System.out.println("\n=== SUMA DE NÚMEROS 1-10 ===");
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);

        // Ejemplo 3: Cuenta regresiva
        System.out.println("\n=== CUENTA REGRESIVA ===");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("¡Despegue!");
    }
}
