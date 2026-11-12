public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO ===");

        // Crear cuenta
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);

        // Mostrar información inicial
        cuenta.mostrarInformacion();

        // Realizar operaciones
        System.out.println("\n=== OPERACIONES ===");
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000);   // Error: saldo insuficiente
        cuenta.depositar(-100); // Error: cantidad negativa

        // Leer el saldo con el getter (sí está permitido)
        System.out.println("\nSaldo consultado con getSaldo(): $" + cuenta.getSaldo());

        // Mostrar información final
        cuenta.mostrarInformacion();

        // Intento de trampa: quita las dos barras de la línea de abajo y pulsa Run.
        // Java mostrará: "error: saldo has private access in CuentaBancaria"
        // cuenta.saldo = 999999;
    }
}
