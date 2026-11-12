import java.util.Scanner;

// Sistema de Gestión de Estudiantes
// En OnlineGDB esta misma clase se llama Main (el editor ejecuta Main.java)
public class SistemaEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("  SISTEMA DE GESTIÓN");
        System.out.println("  DE ESTUDIANTES");
        System.out.println("================================");

        // Registro del estudiante
        System.out.print("\nIngrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        // Crear objeto estudiante
        Estudiante estudiante = new Estudiante(nombre, edad);

        System.out.println("\n¡Estudiante registrado exitosamente!");

        // Menú interactivo
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n================================");
            System.out.println("         MENÚ PRINCIPAL");
            System.out.println("================================");
            System.out.println("1. Agregar nota");
            System.out.println("2. Ver información del estudiante");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Ver estado (Aprobado/Desaprobado)");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nota (0-20): ");
                    double nota = sc.nextDouble();
                    estudiante.agregarNota(nota);
                    break;

                case 2:
                    estudiante.mostrarInformacion();
                    break;

                case 3:
                    if (estudiante.getCantidadNotas() > 0) {
                        System.out.printf("Promedio: %.2f%n", estudiante.calcularPromedio());
                    } else {
                        System.out.println("No hay notas registradas");
                    }
                    break;

                case 4:
                    if (estudiante.getCantidadNotas() > 0) {
                        System.out.println("Estado: " + estudiante.obtenerEstado());
                    } else {
                        System.out.println("No hay notas registradas");
                    }
                    break;

                case 5:
                    System.out.println("\n¡Gracias por usar el sistema!");
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}
