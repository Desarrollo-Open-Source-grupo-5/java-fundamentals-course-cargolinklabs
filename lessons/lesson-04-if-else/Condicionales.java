public class Condicionales {
    public static void main(String[] args) {
        // Ejemplo 1: Mayor de edad
        int edad = 16;

        System.out.println("=== VERIFICACIÓN DE EDAD ===");
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Ejemplo 2: Calificaciones
        int nota = 85;

        System.out.println("\n=== SISTEMA DE CALIFICACIONES ===");
        System.out.println("Nota: " + nota);

        if (nota >= 90) {
            System.out.println("¡Excelente! A");
        } else if (nota >= 70) {
            System.out.println("Bien hecho. B");
        } else if (nota >= 50) {
            System.out.println("Aprobado. C");
        } else {
            System.out.println("Necesitas estudiar más. F");
        }
    }
}
