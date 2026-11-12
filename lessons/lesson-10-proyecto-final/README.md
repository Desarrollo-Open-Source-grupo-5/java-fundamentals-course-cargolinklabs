# Lección 10: Proyecto final, buenas prácticas y próximos pasos

**Duración:** 14 min · **Editor:** OnlineGDB · **Video:** [▶ Ver en YouTube](https://www.youtube.com/watch?v=a4WN0YVYjRE)

## Objetivo
Al terminar, podrás leer y ejecutar un programa que une clases, encapsulación, arrays, bucles, `switch` y `Scanner`, reconocer errores comunes y saber cómo seguir aprendiendo.

## Conceptos clave
| Concepto | Qué significa |
|---|---|
| Array | Fila de casilleros numerados **desde 0** que guarda varios datos del mismo tipo: `double[] notas = new double[10];` |
| Recorrer un array | Usar un `for` desde `0` hasta `cantidadNotas - 1` para sumar las notas. |
| `while (continuar)` | Repite el menú hasta que el usuario elige salir. |
| `switch` / `case` / `break` | Elige qué hacer según la opción escrita por el usuario. |
| `default` | Responde cuando la opción no existe. |

## Archivos
| Archivo | Contenido |
|---|---|
| [`Estudiante.java`](Estudiante.java) | Atributos privados, array de notas, `agregarNota`, `calcularPromedio`, `obtenerEstado` y `mostrarInformacion`. |
| [`SistemaEstudiantes.java`](SistemaEstudiantes.java) | Programa principal: registro con `Scanner` y menú con `while` y `switch`. |

## Practica sin instalar nada
▶ **[Abrir en OnlineGDB](https://onlinegdb.com/Stt7aQaTs)** 👈 ¡No necesitas registrarte! Pulsa **Run** y escribe en la consola.

> En OnlineGDB el programa principal se llama `Main.java`, porque el editor ejecuta esa clase. El código es el mismo que `SistemaEstudiantes.java`.

Prueba sugerida: registra a un estudiante de 15 años, agrega las notas 14, 16 y 12, intenta agregar 25 y consulta las opciones 2, 3 y 4.

```text
Error: La nota debe estar entre 0 y 20
Promedio: 14.00
Estado: APROBADO
```

## Buenas prácticas y errores comunes
| ✓ Buenas prácticas | ✗ Errores comunes |
|---|---|
| Nombres claros (`cantidadNotas`, no `cn`) | Olvidar el punto y coma `;` |
| Ordenar el código con sangría | Confundir `main` con `Main` o `String` con `string` |
| Comentar el porqué, no lo obvio | Que la clase y el archivo tengan nombres distintos |
| Un método, una tarea | Usar `=` cuando querías comparar con `==` |
| Proteger atributos con `private` y validar | Olvidar que el array empieza en 0 |
| | Bucle infinito por no actualizar el contador |

## Ejercicio
Completa [`starter-files/lesson-10-proyecto-final/PracticaProyectoFinal.java`](../../starter-files/lesson-10-proyecto-final/PracticaProyectoFinal.java): implementa `calcularPromedio()` y `obtenerEstado()`, y como extra, `notaMasAlta()`.

## Próximos pasos
Herencia y polimorfismo · Listas (`ArrayList`) · Manejo de excepciones · Interfaces gráficas y aplicaciones.

## Guion del video
[guion.md](guion.md)
