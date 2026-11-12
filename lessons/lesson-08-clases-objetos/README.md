# Lección 08 · Clases, objetos y constructores

**Duración:** 6 min 10 s
**Editor:** OnlineGDB
**Video:** [Ver en YouTube](https://youtu.be/Fh1-v7lX85s)

## Objetivo

Introducir los fundamentos de la programación orientada a objetos en Java mediante la creación de clases, atributos, constructores y objetos que representen elementos del mundo real.

## Conceptos clave

| Concepto    | Descripción                                                                |
| ----------- | -------------------------------------------------------------------------- |
| Clase       | Plantilla que define las características y el comportamiento de un objeto. |
| Objeto      | Instancia de una clase con sus propios datos.                              |
| Atributo    | Variable que representa una característica del objeto.                     |
| Constructor | Permite inicializar un objeto cuando se crea.                              |
| `new`       | Crea una nueva instancia de una clase.                                     |
| `this`      | Hace referencia al objeto actual.                                          |
| `package`   | Organiza las clases dentro de paquetes.                                    |
| `import`    | Permite utilizar clases de otros paquetes.                                 |

## Ejemplo práctico

En esta lección representamos un perro mediante una clase Java.

Cada perro tiene características propias:

- Nombre.
- Edad.
- Raza.

Para ello, utilizamos una clase denominada `Perro`, que contiene los atributos y un constructor para inicializarlos.

### Archivos disponibles

| Archivo                                                                   | Descripción                                                       |
| ------------------------------------------------------------------------- | ----------------------------------------------------------------- |
| [Perro.java](../../starter-files/lesson-08-clases-objetos/Perro.java)     | Define los atributos y el constructor de la clase Perro.          |
| [Main_L8.java](../../starter-files/lesson-08-clases-objetos/Main_L8.java) | Contiene el punto de entrada del programa y crea un objeto Perro. |

## Estructura del ejemplo

La clase `Perro` representa un modelo de objeto con tres atributos:

```java
String nombre;
int edad;
String raza;
```

Su constructor recibe los valores iniciales:

```java
public Perro(String nombre, int edad, String raza) {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
}
```

Desde el programa principal se crea una instancia utilizando `new`:

```java
Perro luna = new Perro("Luna", 5, "caniche");
```

La variable `luna` representa un objeto de la clase `Perro`.

## Ejecutar el ejemplo

1. Abre [OnlineGDB — Java Compiler](https://www.onlinegdb.com/online_java_compiler).
2. Revisa los archivos `Main_L8.java` y `Perro.java`.
3. Conserva una estructura de paquetes coherente con las declaraciones `package` e `import`.
4. Comprueba que los nombres de las clases públicas coincidan con sus respectivos archivos.
5. Compila y ejecuta el programa.

**Nota:** El proyecto utiliza el paquete `Dog`. Para ejecutarlo correctamente en un entorno local, debe respetarse la organización de los paquetes Java. En OnlineGDB puede ser necesario adaptar la estructura de archivos al editor.

## Actividad práctica

### Ejercicio: Crear diferentes mascotas

A partir de la clase `Perro`, realiza las siguientes actividades:

1. Crea un objeto llamado `luna` con nombre, edad y raza.
2. Crea un segundo objeto llamado `max` con valores diferentes.
3. Añade un método que muestre la información de cada perro.
4. Invoca el método para ambos objetos.
5. Modifica la edad de uno de los perros y comprueba el cambio.

### Resultado esperado

Al completar la actividad, la salida podría ser:

```text
Nombre: Luna
Edad: 5 años
Raza: Caniche

Nombre: Max
Edad: 3 años
Raza: Labrador
```

Este resultado es ilustrativo. El estudiante debe implementar el método de presentación y las instrucciones necesarias para mostrarlo.

## Recomendaciones

- Utiliza nombres descriptivos para las clases y atributos.
- Recuerda que Java diferencia mayúsculas y minúsculas.
- El constructor debe tener el mismo nombre que la clase.
- Utiliza `this` para distinguir atributos de parámetros cuando comparten el mismo nombre.
- Respeta la estructura de paquetes y las instrucciones `import`.
- Cada objeto puede contener valores distintos aunque pertenezca a la misma clase.

## Recursos

- [Ver video de la lección 08](https://youtu.be/Fh1-v7lX85s)
- [Abrir compilador Java OnlineGDB](https://www.onlinegdb.com/online_java_compiler)
- [Archivos iniciales de práctica](../../starter-files/lesson-08-clases-objetos/)
- [Guion de la lección](GuiónLección8.txt)
- [Plan del curso](../../docs/plan-de-curso.md)

## Resultado de aprendizaje

Al finalizar la lección, el estudiante podrá identificar los elementos básicos de la programación orientada a objetos y crear clases con atributos y constructores para representar objetos del mundo real.
