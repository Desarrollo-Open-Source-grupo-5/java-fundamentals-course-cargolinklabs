public class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;
    private double[] notas;
    private int cantidadNotas;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new double[10];  // 10 casilleros: del 0 al 9
        this.cantidadNotas = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantidadNotas() {
        return cantidadNotas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    // Agrega una nota si está entre 0 y 20 y todavía hay espacio
    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 20) {
            if (cantidadNotas < notas.length) {
                notas[cantidadNotas] = nota;
                cantidadNotas++;
                System.out.println("Nota agregada correctamente");
            } else {
                System.out.println("Error: Ya se alcanzó el límite de notas");
            }
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 20");
        }
    }

    // Recorre solo los casilleros que tienen notas
    public double calcularPromedio() {
        if (cantidadNotas == 0) {
            return 0;
        }

        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }

        return suma / cantidadNotas;
    }

    public String obtenerEstado() {
        double promedio = calcularPromedio();
        if (promedio >= 11) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }

    public void mostrarInformacion() {
        System.out.println("\n================================");
        System.out.println("   INFORMACIÓN DEL ESTUDIANTE");
        System.out.println("================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Cantidad de notas: " + cantidadNotas);

        if (cantidadNotas > 0) {
            System.out.print("Notas: ");
            for (int i = 0; i < cantidadNotas; i++) {
                System.out.print(notas[i]);
                if (i < cantidadNotas - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.printf("Promedio: %.2f%n", calcularPromedio());
            System.out.println("Estado: " + obtenerEstado());
        } else {
            System.out.println("No hay notas registradas");
        }
    }
}
