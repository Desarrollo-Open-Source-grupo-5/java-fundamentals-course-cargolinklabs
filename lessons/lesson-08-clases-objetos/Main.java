
class Perro {

    String nombre;
    int edad;
    String raza;

    // Constructor
    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    // Muestra la informacion del perro
    public void presentarse() {
        System.out.println("Soy " + nombre);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Mi raza es " + raza);
    }

    // Incrementa la edad en un año
    public void cumplirAnos() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CLASES Y OBJETOS ===");

        // Creamos dos objetos de la clase Perro
        Perro luna = new Perro("Luna", 5, "Caniche");
        Perro max = new Perro("Max", 3, "Labrador");

        System.out.println("\nPrimer perro:");
        luna.presentarse();

        System.out.println("\nSegundo perro:");
        max.presentarse();

        System.out.println("\n=== ACTUALIZAR EDAD ===");
        max.cumplirAnos();
    }
}
