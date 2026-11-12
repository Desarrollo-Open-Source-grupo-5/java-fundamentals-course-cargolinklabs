public class AdivinaNumero {
    public static void main(String[] args) {
        int numeroSecreto = 7;
        int intento = 5;

        System.out.println("=== JUEGO DE ADIVINANZAS ===");
        System.out.println("Intento: " + intento);

        if (intento == numeroSecreto) {
            System.out.println("¡Correcto! Adivinaste el número");
        } else if (intento < numeroSecreto) {
            System.out.println("Tu número es menor. Intenta uno más grande");
        } else {
            System.out.println("Tu número es mayor. Intenta uno más pequeño");
        }
    }
}
