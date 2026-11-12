public class Operadores {
    public static void main(String[] args) {
        // Operadores de comparación
        int edad = 16;

        System.out.println("=== OPERADORES DE COMPARACIÓN ===");
        System.out.println("edad = " + edad);
        System.out.println("edad > 18: " + (edad > 18));
        System.out.println("edad < 18: " + (edad < 18));
        System.out.println("edad >= 16: " + (edad >= 16));
        System.out.println("edad == 16: " + (edad == 16));
        System.out.println("edad != 16: " + (edad != 16));

        // Operadores lógicos
        System.out.println("\n=== OPERADORES LÓGICOS ===");
        boolean tieneLicencia = false;
        boolean estaAcompaniado = true;
        boolean esAdulto = edad >= 18;

        System.out.println("Puede conducir (edad >= 18 Y tiene licencia): " +
                          (esAdulto && tieneLicencia));
        System.out.println("Es adolescente (edad >= 13 Y edad <= 19): " +
                          (edad >= 13 && edad <= 19));
        System.out.println("Puede ingresar (es adulto O está acompañado): " +
                          (esAdulto || estaAcompaniado));
        System.out.println("NO tiene licencia: " + (!tieneLicencia));
    }
}
