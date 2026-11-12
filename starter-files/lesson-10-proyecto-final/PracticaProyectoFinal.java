// Práctica - Lección 10: Proyecto final
//
// Reto: completa los métodos de la clase Estudiante.
//   1. calcularPromedio(): recorre con un for SOLO los casilleros que tienen notas
//      (desde 0 hasta cantidadNotas - 1), suma las notas y divide entre cantidadNotas.
//      Si no hay notas, devuelve 0.
//   2. obtenerEstado(): devuelve "APROBADO" si el promedio es mayor o igual a 11,
//      y "DESAPROBADO" en caso contrario.
//   3. Extra: crea el método notaMasAlta() que devuelva la nota más alta.
//
// Cuando termines, pulsa Run. La salida esperada es:
//   Promedio: 14.00
//   Estado: APROBADO

class Estudiante {
    private String nombre;
    private double[] notas = new double[10];   // 10 casilleros: del 0 al 9
    private int cantidadNotas = 0;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 20 && cantidadNotas < notas.length) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
        } else {
            System.out.println("Nota no válida o sin espacio: " + nota);
        }
    }

    // TODO 1
    public double calcularPromedio() {
        return 0; // reemplaza esta línea
    }

    // TODO 2
    public String obtenerEstado() {
        return "PENDIENTE"; // reemplaza esta línea
    }
}

public class PracticaProyectoFinal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Diego");
        estudiante.agregarNota(14);
        estudiante.agregarNota(16);
        estudiante.agregarNota(12);

        System.out.printf("Promedio: %.2f%n", estudiante.calcularPromedio());
        System.out.println("Estado: " + estudiante.obtenerEstado());
    }
}
