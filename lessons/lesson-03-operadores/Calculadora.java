public class Calculadora {
    public static void main(String[] args) {
        double precio = 100.0;
        double descuento = 0.20;  // 20%

        double precioFinal = precio - (precio * descuento);
        double ahorro = precio - precioFinal;

        System.out.println("=== CALCULADORA DE DESCUENTOS ===");
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("Ahorro: $" + ahorro);
        System.out.println("Precio final: $" + precioFinal);
    }
}
