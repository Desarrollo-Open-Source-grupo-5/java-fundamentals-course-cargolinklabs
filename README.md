# Fundamentos de Java para Principiantes

## Resumen del curso

Aprende a programar en Java desde cero. Empieza con un saludo en la consola y termina construyendo un registro de notas que usa clases y objetos. Puedes seguir el curso y practicar desde tu navegador, sin descargar herramientas.

- **Duración de los videos** — 2 h 1 min 33 s en 10 lecciones.
- **Público objetivo** — Estudiantes de secundaria de 12 a 17 años sin experiencia en programación.
- **Prerrequisitos** — Ninguno.
- **Herramientas** — Un navegador web y [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).
- **Código fuente** — [Repositorio público de CargolinkLabs](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs).

[Ir a las lecciones](#secuencia-de-lecciones) · [Ver las prácticas](#actividades-prácticas) · [Resolver el cuestionario](#cuestionario-de-evaluación)

## Cómo empezar

1. Abre el video de la lección y revisa su código o plantilla.
2. Si la lección tiene un proyecto precargado, ábrelo y pulsa **Run**. Si tiene un enlace al editor Java, copia el contenido de la plantilla al editor. El archivo debe tener el mismo nombre que su clase pública. Si el editor exige `Main.java`, llama `Main` a la clase principal y conserva las demás clases en sus propios archivos.
3. Ejecuta el programa, cambia un dato y vuelve a ejecutarlo para comprobar qué pasa. Si pide datos con `Scanner`, escríbelos en la consola.

La ruta se divide en **fundamentos** (1–3), **control de flujo** (4–6) y **entrada de datos y programación orientada a objetos** (7–10).

## Secuencia de lecciones

### Lección 1 · Introducción a Java y a la programación (16:59)

- **Descripción** — Escribe tu primer programa y muestra un saludo en la consola.
- **Video** — [Ver la lección en YouTube](https://youtu.be/f9UBns556O8).
- **Qué aprenderás** — Java comienza la ejecución en `main`. Usa `System.out.println` para mostrar una línea.
- **Práctica** — Personaliza Hola Mundo con tu saludo y tu ciudad. [Código y guía](lessons/lesson-01-intro/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 2 · Variables y tipos de datos (36:56)

- **Descripción** — Guarda y muestra datos de una ficha usando los tipos adecuados.
- **Video** — [Ver la lección en YouTube](https://youtu.be/1UwLN9UL6Ys).
- **Qué aprenderás** — Usa `int` para enteros, `double` para decimales, `boolean` para verdadero o falso, `char` para un carácter y `String` para texto.
- **Práctica** — Completa una ficha y calcula cuántos equipos de cuatro se forman con 17 personas. [Código y guía](lessons/lesson-02-variables/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 3 · Operadores y expresiones (6:14)

- **Descripción** — Combina operaciones aritméticas, comparaciones y condiciones para calcular un descuento.
- **Video** — [Ver la lección en YouTube](https://youtu.be/r5D_MPz-eQ0).
- **Qué aprenderás** — `=` asigna, `==` compara valores primitivos y `&&` exige que se cumplan ambas condiciones.
- **Práctica** — Calcula el ahorro y el precio final de una compra de S/ 100 con 20 % de descuento. [Código y guía](lessons/lesson-03-operadores/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 4 · Condicionales con if, else y switch (6:37)

- **Descripción** — Haz que un programa tome decisiones según un valor de entrada.
- **Video** — [Ver la lección en YouTube](https://youtu.be/fHbGM7QOj6w).
- **Qué aprenderás** — `if` evalúa una condición, `else` ofrece una alternativa y `switch` permite elegir entre casos.
- **Práctica** — Prueba un intento menor, igual y mayor que el número secreto. [Código y guía](lessons/lesson-04-if-else/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 5 · Bucles for y while (9:47)

- **Descripción** — Repite instrucciones para contar, acumular resultados o mostrar una tabla.
- **Video** — [Ver la lección en YouTube](https://youtu.be/KNgEEadHqNo).
- **Qué aprenderás** — `for` es útil para recorrer un rango y `while` repite mientras su condición sea verdadera.
- **Práctica** — Imprime la tabla del 7 del 1 al 10 con `for` y después con `while`. [Código y guía](lessons/lesson-05-bucles/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 6 · Métodos y parámetros (9:33)

- **Descripción** — Divide un cálculo en métodos que puedas llamar con distintos datos.
- **Video** — [Ver la lección en YouTube](https://youtu.be/ZCcfhX2RsE0).
- **Qué aprenderás** — Un método recibe datos mediante parámetros y puede devolver un resultado con `return`.
- **Práctica** — Implementa un método para calcular el área de un triángulo y pruébalo con dos entradas. [Código y guía](lessons/lesson-06-metodos/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 7 · Entrada y salida con Scanner (6:42)

- **Descripción** — Lee datos que escribe el usuario y muestra un resumen en consola.
- **Video** — [Ver la lección en YouTube](https://youtu.be/95yDCkvMk1A).
- **Qué aprenderás** — `nextLine()` lee una línea completa. `nextInt()` y `nextDouble()` leen números.
- **Práctica** — Lee un nombre, una edad y una estatura y muestra los tres datos. [Código y guía](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-07-08/lessons/lesson-07-scanner/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 8 · Clases, objetos y constructores (6:10)

- **Descripción** — Representa una mascota con atributos, un constructor y un método.
- **Video** — [Ver la lección en YouTube](https://youtu.be/Fh1-v7lX85s).
- **Qué aprenderás** — La clase define los datos y el comportamiento. `new` crea una instancia con su propio estado.
- **Práctica** — Crea dos mascotas con datos distintos y muestra su presentación. [Código y guía](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-07-08/lessons/lesson-08-clases-objetos/) · [Abrir editor Java](https://www.onlinegdb.com/online_java_compiler).

### Lección 9 · Encapsulación, getters y setters (8:15)

- **Descripción** — Protege el saldo de una cuenta y valida las operaciones que lo modifican.
- **Video** — [Ver la lección en YouTube](https://youtu.be/YdSRAi8mRyg).
- **Qué aprenderás** — `private` limita el acceso directo a los atributos. Los métodos públicos controlan las consultas y los cambios.
- **Práctica** — Prueba un depósito, un retiro válido y otro mayor al saldo disponible. [Código y guía](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-09-10/lessons/lesson-09-encapsulacion/) · [Abrir proyecto precargado](https://onlinegdb.com/5qz6c_n6I).

### Lección 10 · Proyecto práctico y buenas prácticas (14:20)

- **Descripción** — Construye un registro de notas para calcular el promedio y consultar el estado de un estudiante.
- **Video** — [Ver la lección en YouTube](https://youtu.be/a4WN0YVYjRE).
- **Qué aprenderás** — Un arreglo guarda las notas. El menú combina `Scanner`, `while`, `switch` y métodos de la clase `Estudiante`.
- **Práctica** — Registra 12 y 16, comprueba que el promedio sea 14 y prueba una nota inválida. [Código y guía](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-09-10/lessons/lesson-10-proyecto-final/) · [Abrir proyecto precargado](https://onlinegdb.com/Stt7aQaTs).

## Recursos adicionales

- [Guía de instalación local opcional](resources/guia-instalacion-local.md).
- [Referencia rápida de Java](resources/cheatsheet.md) y [ejercicios adicionales](resources/ejercicios-extra.md).
- [Ejemplos terminados](completed-examples/mini-projects/) y [errores comunes](completed-examples/best-practices/errores-comunes.md).
- [Scripts de compilación y prueba](scripts/) y [plan del curso](docs/plan-de-curso.md).

### Actividades prácticas

| Lección | Actividad | Empezar a programar |
| ---: | --- | --- |
| 1 | Personaliza Hola Mundo con tu saludo y tu ciudad. | [Plantilla](starter-files/lesson-01-intro/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 2 | Completa una ficha y calcula cuántos equipos de cuatro se forman con 17 personas. | [Plantilla](starter-files/lesson-02-variables/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 3 | Calcula el ahorro y el precio final de una compra de S/ 100 con 20 % de descuento. | [Plantilla](starter-files/lesson-03-operadores/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 4 | Prueba un intento menor, igual y mayor que el número secreto. | [Plantilla](starter-files/lesson-04-if-else/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 5 | Imprime la tabla del 7 del 1 al 10 con `for` y después con `while`. | [Plantilla](starter-files/lesson-05-bucles/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 6 | Implementa un método para calcular el área de un triángulo y pruébalo con dos entradas. | [Plantilla](starter-files/lesson-06-metodos/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 7 | Lee un nombre, una edad y una estatura y muestra los tres datos. | [Plantilla](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-07-08/starter-files/lesson-07-scanner/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 8 | Crea dos mascotas con datos distintos y muestra su presentación. | [Plantilla](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-07-08/starter-files/lesson-08-clases-objetos/) · [Editor Java](https://www.onlinegdb.com/online_java_compiler) |
| 9 | Prueba un depósito, un retiro válido y otro mayor al saldo disponible. | [Plantilla](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-09-10/starter-files/lesson-09-encapsulacion/) · [Proyecto precargado](https://onlinegdb.com/5qz6c_n6I) |
| 10 | Registra 12 y 16, comprueba que el promedio sea 14 y prueba una nota inválida. | [Plantilla](https://github.com/Desarrollo-Open-Source-grupo-5/java-fundamentals-course-cargolinklabs/tree/lecciones-09-10/starter-files/lesson-10-proyecto-final/) · [Proyecto precargado](https://onlinegdb.com/Stt7aQaTs) |

### Cuestionario de evaluación

1. ¿Qué método se ejecuta al iniciar un programa Java?
2. ¿Qué tipos usarías para guardar un nombre y una altura con decimales?
3. ¿Qué diferencia hay entre `=` y `==` al trabajar con números?
4. Si `int nota = 10`, ¿qué rama ejecuta un `if (nota >= 11)` con `else`?
5. ¿Cuántas veces se ejecuta el cuerpo de `for (int i = 1; i <= 5; i++)`?
6. ¿Qué hace `return` dentro de un método?
7. ¿Qué método de `Scanner` permite leer un nombre con espacios?
8. ¿Qué papel tiene el constructor al crear un objeto?
9. ¿Por qué conviene declarar `saldo` como `private` y modificarlo mediante métodos?
10. Si un estudiante registra 12 y 16, ¿qué promedio obtiene?

<details>
<summary>Ver respuestas</summary>

1. `main`.
2. `String` y `double`, respectivamente.
3. `=` asigna y `==` comprueba la igualdad.
4. La rama `else`.
5. Cinco veces.
6. Termina el método y devuelve un resultado cuando corresponde.
7. `nextLine()`.
8. Inicializa el estado del objeto nuevo.
9. Para validar cada operación antes de cambiar el saldo.
10. 14.

</details>

## Elaboración

- **Universidad Peruana de Ciencias Aplicadas** · Ingeniería de Software
- **Curso** 1ASI0729 Desarrollo de Aplicaciones Open Source · **NRC** 7729
- **Período** 202620 · **Entrega** Semana 12
- **Equipo** CargolinkLabs

El equipo distribuyó las diez lecciones en cinco aportes de dos lecciones. La coordinación organizó la secuencia, los ejemplos y las actividades. El [registro de participación](docs/participacion.md) muestra cómo se organizan los aportes en GitHub.

El código se distribuye con [licencia MIT](LICENSE).
