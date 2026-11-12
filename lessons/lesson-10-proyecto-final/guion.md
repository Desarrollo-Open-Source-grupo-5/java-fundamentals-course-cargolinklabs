# Guion · Lección 10: Proyecto final, buenas prácticas y próximos pasos (8 min)

**Editor:** OnlineGDB, con `Main.java` (menú) y `Estudiante.java` ya escritos. El código se explica por partes, seleccionándolo con el mouse.

| Tiempo | En pantalla |
|---|---|
| 00:00 – 00:50 | Portada → OnlineGDB: Run y menú del programa terminado |
| 00:50 – 01:50 | Dibujo de los casilleros del array (0 a 9) |
| 01:50 – 03:50 | `Estudiante.java` |
| 03:50 – 05:20 | Programa principal: `Scanner`, `while` y `switch` |
| 05:20 – 06:00 | Prueba en vivo |
| 06:00 – 07:15 | Buenas prácticas y errores comunes |
| 07:15 – 08:00 | Próximos pasos y despedida |

## [00:00 – 00:50] Apertura
> ¡Llegamos al último video! Vas a ver cómo se juntan todas las piezas que aprendiste en un Sistema de Gestión de Estudiantes: un programa con un menú donde puedes registrar a un estudiante, agregarle notas, ver su información, calcular su promedio y saber si está aprobado o desaprobado. Pulso Run: me pide un nombre y una edad, y aparece un menú con cinco opciones. Para lograrlo usamos clases y objetos, encapsulación, bucles, métodos, decisiones y Scanner. Y además, una cosa nueva: los arrays.

## [00:50 – 01:50] Un concepto nuevo: los arrays
> Un array es una fila de casilleros numerados donde guardas varios datos del mismo tipo bajo un único nombre. En lugar de crear diez variables, creamos una sola: double corchetes notas igual new double, y entre corchetes, diez. Eso crea diez casilleros para números decimales. Para usar uno, escribimos el nombre del array y el número del casillero entre corchetes. Y aquí viene el dato que más confunde: los casilleros se numeran desde cero. El primero es el cero y el último, el nueve. También usamos una variable, cantidadNotas, para saber cuántas notas llevamos.

**Anotación:** `Los arrays empiezan en 0`

## [01:50 – 03:50] La clase Estudiante
> La clase Estudiante aplica la encapsulación: nombre, edad, el array de notas y cantidadNotas son privados. El constructor solo pide nombre y edad, porque esos datos cambian de un estudiante a otro. El contador de notas no se pide: todo estudiante nuevo empieza con cero notas, así que la propia clase lo pone en cero. En setEdad hay una regla: la edad debe ser mayor que cero y menor que cien. El método agregarNota revisa que la nota esté entre cero y veinte y que todavía haya espacio, es decir, que cantidadNotas sea menor que notas punto length. Si todo está bien, guarda la nota en el casillero que indica cantidadNotas y aumenta el contador. calcularPromedio usa un for que recorre solo los casilleros con datos, suma cada nota y divide entre la cantidad. Con catorce, dieciséis y doce, el promedio es catorce. Y obtenerEstado devuelve APROBADO si el promedio es mayor o igual a once; si no, DESAPROBADO.

**Anotación:** `private + getters/setters con validación · recorrer un array con for`

## [03:50 – 05:20] El programa principal: menú con while y switch
> En el programa principal se crea un Scanner, se piden el nombre y la edad, y con eso se crea el objeto Estudiante. La variable booleana continuar empieza en true, y todo el menú está dentro de un while: mientras continuar sea true, se muestran las opciones y se pide un número. Para reaccionar a la opción usamos switch, que es como muchos if else if encadenados, pero más ordenado. Case uno: agregar una nota. Case dos: mostrar la información. Case tres: el promedio. Case cuatro: el estado. Cada case termina con break, que significa «sal de aquí». El case cinco pone continuar en false, así el while termina. Y si el usuario escribe un número que no existe, el default responde «Opción inválida».

**Anotación:** `switch + case + break = menú ordenado`

## [05:20 – 06:00] Probamos el sistema
> Registro a un estudiante de ejemplo, de quince años. Agrego las notas catorce, dieciséis y doce. Ahora pruebo con veinticinco: el programa responde que la nota debe estar entre cero y veinte. La opción dos muestra toda la información, con promedio catorce y estado aprobado. La tres muestra el promedio, la cuatro el estado y la cinco cierra el programa.

## [06:00 – 07:15] Buenas prácticas y errores comunes
> Repasemos buenas prácticas. Usa nombres claros, como cantidadNotas y no cn. Ordena tu código con sangría. Escribe comentarios que expliquen el porqué, no lo evidente. Un método, una tarea. Protege tus atributos con private y valida los datos. Y los errores más comunes: olvidar el punto y coma; confundir mayúsculas y minúsculas, porque Java distingue main de Main; que la clase y el archivo tengan nombres distintos; usar un signo igual cuando querías dos para comparar; olvidar que los arrays empiezan en cero; y el bucle infinito por no actualizar el contador. Cuando algo falle, lee el mensaje de error: casi siempre dice en qué línea está el problema.

**Anotación:** `Lee el mensaje de error: te dice la línea`

## [07:15 – 08:00] Próximos pasos y despedida
> ¡Lo lograste! En una hora pasaste de no saber nada a escribir un programa con clases, objetos, arrays y un menú. ¿Qué sigue? Puedes aprender herencia y polimorfismo, las listas, que son como arrays que crecen solos, y a crear interfaces gráficas y aplicaciones. En la descripción tienes el código y el repositorio del curso. Programar se aprende practicando un poquito cada día. ¡Mucho éxito!
