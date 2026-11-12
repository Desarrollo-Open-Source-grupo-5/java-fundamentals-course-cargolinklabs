public class CuentaBancaria {
    // Atributos privados: solo se pueden usar dentro de esta clase
    private String titular;
    private double saldo;
    private String numeroCuenta;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroCuenta = generarNumeroCuenta();
    }

    // Método privado auxiliar: nadie desde afuera puede usarlo
    private String generarNumeroCuenta() {
        return "CTA-" + (int) (Math.random() * 10000);
    }

    // Getters: la ventanilla para LEER los datos
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // Setter: la ventanilla para CAMBIAR el titular
    // (el saldo y el número de cuenta no tienen setter a propósito)
    public void setTitular(String nuevoTitular) {
        this.titular = nuevoTitular;
    }

    // Métodos con validación
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: La cantidad debe ser positiva");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso de $" + cantidad);
                System.out.println("Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Error: Saldo insuficiente");
            }
        } else {
            System.out.println("Error: La cantidad debe ser positiva");
        }
    }

    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DE LA CUENTA ===");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
