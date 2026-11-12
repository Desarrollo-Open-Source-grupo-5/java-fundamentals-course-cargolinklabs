public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("=== TABLA DEL " + numero + " ===");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
