public class Metodos {
    // Método sin parámetros ni retorno
    public static void saludar() {
        System.out.println("¡Hola!");
    }

    // Método con parámetros
    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Método que devuelve un valor
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método con múltiples parámetros
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        System.out.println("=== MÉTODOS BÁSICOS ===");

        // Llamando métodos
        saludar();
        saludar();  // Se puede llamar múltiples veces

        saludarPersona("María");
        saludarPersona("Carlos");

        int resultado = sumar(5, 3);
        System.out.println("5 + 3 = " + resultado);

        double area = calcularArea(10, 5);
        System.out.println("Área del triángulo: " + area);
    }
}
