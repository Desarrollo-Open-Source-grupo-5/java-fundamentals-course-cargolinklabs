// Práctica - Lección 9: Encapsulación, getters y setters
//
// Reto: completa la clase Persona.
//   1. El atributo edad debe ser privado.
//   2. Crea el getter getEdad() que devuelva la edad.
//   3. Crea el setter setEdad(int nuevaEdad) que NO acepte números negativos:
//      si la edad es negativa, muestra "Error: la edad no puede ser negativa".
//
// Cuando termines, pulsa Run. La salida esperada es:
//   Nombre: Lucía
//   Edad: 14
//   Error: la edad no puede ser negativa
//   Edad después del intento: 14

class Persona {
    private String nombre;
    private int edad;   // TODO 1: ya es privado; no lo cambies a public

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    // TODO 2: escribe aquí el getter getEdad()
    public int getEdad() {
        return 0; // reemplaza el 0 por el atributo edad
    }

    // TODO 3: escribe aquí el setter con validación
    public void setEdad(int nuevaEdad) {
        // si nuevaEdad es mayor o igual que 0, guárdala en edad
        // si no, muestra el mensaje de error
    }
}

public class PracticaEncapsulacion {
    public static void main(String[] args) {
        Persona persona = new Persona("Lucía", 14);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        persona.setEdad(-5); // debe mostrar un error y no cambiar la edad
        System.out.println("Edad después del intento: " + persona.getEdad());
    }
}
