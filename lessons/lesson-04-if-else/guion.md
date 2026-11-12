# Guion de grabación · Lección 04

Guion del equipo. Si se vuelve a grabar la lección, utiliza OnlineGDB para la demostración.

**Responsable**: Integrante 2 · **Editor**: Replit
**Al terminar, el estudiante podrá**: escribir condiciones con if, else y else if, y crear un juego de adivinanza sencillo.

### [00:00-00:40] Apertura
**En pantalla:** Diagrama de un semáforo: rojo → detente, verde → avanza.

**Narración:**
> ¡Hola! Piensa en un semáforo. Si está en rojo, te detienes. Si está en verde, cruzas. En tu vida diaria tomas decisiones todo el tiempo según lo que pasa: si llueve, llevas paraguas; si no llueve, no. Los programas también toman decisiones, y para hacerlo usan una estructura que se llama if, que en español significa «si». Hoy vas a aprender a decirle a tu programa: «si pasa esto, haz aquello; y si no, haz otra cosa».

### [00:40-02:00] El if y el else
**En pantalla:** Escribir el primer ejemplo de `Condicionales.java` (verificación de edad). Mostrar un diagrama de flujo con dos caminos. Ejecutar con edad igual dieciséis y luego cambiar a veinte.

**Narración:**
> La estructura más sencilla es esta. Escribimos if, y entre paréntesis la condición, que es una pregunta cuya respuesta es verdadero o falso. Ya aprendiste a escribirlas en el video anterior. Por ejemplo: edad mayor o igual que dieciocho. Luego abrimos llaves, y dentro ponemos lo que debe pasar si la condición es verdadera: mostrar «Eres mayor de edad». Después viene la palabra else, que significa «si no», con sus propias llaves, y dentro ponemos lo que pasa en el otro caso: mostrar «Eres menor de edad». Mira el diagrama: el programa llega a la pregunta y toma uno de los dos caminos, nunca los dos. Con edad igual dieciséis, ejecuto y aparece «Eres menor de edad». Ahora cambio la edad a veinte, ejecuto de nuevo, y el programa elige el otro camino. Fíjate que no cambié las instrucciones, solo el dato: el programa decide solo.

**Anotación:** "if (condición) { ... } else { ... }".

### [02:00-03:40] Varias opciones con else if
**En pantalla:** Escribir el sistema de calificaciones. Ejecutar con nota 85 y luego probar 95, 60 y 30.

**Narración:**
> A veces hay más de dos caminos. Por ejemplo, un sistema de calificaciones. Creamos int nota igual ochenta y cinco. Primero preguntamos: ¿nota mayor o igual que noventa? Si es así, mostramos «Excelente». Si no, pasamos a otra pregunta con else if, que significa «si no, pero si»: ¿nota mayor o igual que setenta? Entonces «Bien hecho». Luego otro else if: ¿nota mayor o igual que cincuenta? «Aprobado». Y finalmente, un else, para todo lo que quedó fuera: «Necesitas estudiar más». Algo muy importante: Java revisa las preguntas de arriba hacia abajo y se detiene en la primera que sea verdadera. Por eso el orden importa. Con ochenta y cinco, la primera pregunta es falsa, la segunda es verdadera, y muestra «Bien hecho». Probemos otros valores: noventa y cinco, sesenta, treinta. Cada uno cae en su camino.

**Anotación:** "Java revisa de arriba hacia abajo y se detiene en la primera verdadera".

### [03:40-05:20] Juego de adivinanza
**En pantalla:** Escribir `AdivinaNumero.java`. Ejecutar con intento 5, luego 9, luego 7.

**Narración:**
> Ahora vamos a crear la base de un juego de adivinanzas. El programa tiene un número secreto guardado en una variable: siete. Y tenemos una variable intento, que es el número que prueba el jugador. Empezamos con cinco. La primera pregunta es: ¿intento igual al número secreto? Recuerda usar dos signos igual. Si es así, mostramos «Correcto». Si no, preguntamos: ¿intento menor que el número secreto? Entonces damos una pista: «Tu número es menor, intenta uno más grande». Y si no se cumple ninguna de las dos, solo queda que sea mayor: «Intenta uno más pequeño». Ejecutamos con cinco: nos dice que intentemos uno más grande. Cambio el intento a nueve: nos dice que intentemos uno más pequeño. Y con siete, ¡correcto! Más adelante, cuando aprendamos a leer datos del teclado, haremos que el jugador escriba su propio número.

**Anotación:** "== compara · = guarda".

### [05:20-06:00] Cierre y práctica
**En pantalla:** Texto: "Cambia el número secreto y prueba los tres casos".

**Narración:**
> Para practicar, cambia el número secreto por el que tú quieras y prueba los tres casos: uno menor, uno mayor y uno igual. Recuerda: las condiciones van entre paréntesis y cada bloque entre llaves. En el próximo video vamos a aprender a repetir tareas sin escribirlas muchas veces, con los bucles. ¡Hasta la próxima!
