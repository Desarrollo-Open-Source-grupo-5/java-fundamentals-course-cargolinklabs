# Guion de grabación · Lección 05

Guion del equipo. Si se vuelve a grabar la lección, utiliza OnlineGDB para la demostración.

**Responsable**: Integrante 3 · **Editor**: Replit
**Al terminar, el estudiante podrá**: usar while y for, y elegir cuál conviene en cada caso.

### [00:00-00:50] Apertura
**En pantalla:** Texto: "Escribe «Hola» 100 veces". Mostrar un programa con 100 líneas println copiadas (acelerado) y luego tachar.

**Narración:**
> ¡Hola! Imagina que tu profesor te castiga y te pide escribir cien veces «No volveré a hablar en clase». Podrías escribirlo cien veces a mano, o podrías decirle a la computadora que lo haga por ti. Con lo que sabes hasta ahora, tendrías que escribir cien líneas println, una por una. ¡Qué aburrido, y qué fácil equivocarse! Para evitarlo existen los bucles. Un bucle es una estructura que repite un bloque de instrucciones varias veces, sin que tú tengas que copiarlo. Hoy aprenderás los dos bucles más importantes de Java: while y for.

### [00:50-02:20] El bucle while
**En pantalla:** Escribir el primer ejemplo de `BucleWhile.java` (contador). Dibujar un círculo de flechas: «¿cumple la condición? sí → ejecuta y vuelve a preguntar; no → sale». Ejecutar.

**Narración:**
> Empecemos con while, que en español significa «mientras». Funciona así: mientras se cumpla una condición, repite este bloque. Creamos una variable int contador igual a uno. Luego escribimos while, y entre paréntesis la condición: contador menor o igual que cinco. Dentro de las llaves mostramos «Cuenta» y el valor del contador. Y ahora viene la línea más importante: contador más más. Esos dos símbolos más significan «súmale uno a la variable». Sin esa línea, el contador nunca crecería y el bucle no terminaría jamás. Mira el dibujo: el programa pregunta si uno es menor o igual que cinco; sí lo es, muestra uno y sube el contador a dos. Pregunta otra vez, sí; muestra dos, sube a tres. Así sigue hasta que el contador vale seis. Entonces la pregunta da falso, y el programa sale del bucle. Ejecuto: aparecen los números del uno al cinco.

**Anotación:** "while (condición) { ... } · contador++ suma 1".

### [02:20-04:00] El bucle for
**En pantalla:** Escribir `BucleFor.java`: números del 1 al 5, suma 1-10 y cuenta regresiva. Marcar con colores las tres partes del for: inicio, condición, cambio.

**Narración:**
> El bucle for hace lo mismo, pero ordena las tres partes importantes en una sola línea. Mira: for, paréntesis, int i igual uno, punto y coma; i menor o igual que cinco, punto y coma; i más más. Son tres partes. La primera es el inicio: aquí nace la variable i, que vale uno. La segunda es la condición: el bucle sigue mientras i sea menor o igual que cinco. Y la tercera es el cambio: después de cada vuelta, i aumenta en uno. Dentro de las llaves va lo que se repite. Ejecuto y obtenemos los números del uno al cinco, igual que antes, pero con menos líneas. Ahora algo útil: sumar los números del uno al diez. Creamos una variable suma igual a cero y, en cada vuelta, le agregamos i con suma más igual i. Al final, la suma es cincuenta y cinco. Y también podemos contar hacia atrás: empezamos i en diez, la condición es i mayor o igual que uno, y en vez de sumar, restamos con i menos menos. Ejecuto y aparece la cuenta regresiva, y al final: ¡Despegue!

**Anotación:** "for (inicio; condición; cambio)" · "suma += i  →  suma = suma + i".

### [04:00-05:20] Ejemplo: la tabla de multiplicar
**En pantalla:** Escribir `TablaMultiplicar.java`. Ejecutar. Cambiar `numero` a 7 y volver a ejecutar.

**Narración:**
> Vamos a crear algo que seguro te sirve en el colegio: la tabla de multiplicar. Creamos una variable numero igual a cinco. Después, un for con i desde uno hasta diez. En cada vuelta calculamos el resultado, que es numero por i, y lo mostramos con un formato bonito: numero, la letra equis, i, el signo igual y el resultado. Ejecuto, y en la consola aparece toda la tabla del cinco, de cinco por uno hasta cinco por diez. Y ahora el truco: cambio la variable numero a siete, ejecuto otra vez, y tengo la tabla del siete sin escribir nada más. Con un solo cambio, el programa te da cualquier tabla de multiplicar.

### [05:20-06:20] ¿while o for? Cuidado con el bucle infinito
**En pantalla:** Tabla de comparación en dos columnas. Luego mostrar, sin ejecutar al principio, un while sin `contador++`. Ejecutarlo un instante y pulsar el botón de detener (Stop) para frenarlo.

**Narración:**
> ¿Y cuál uso, while o for? Usa for cuando sabes cuántas veces quieres repetir, como diez veces o de uno a cien. Usa while cuando no sabes cuántas veces, y quieres repetir hasta que algo cambie. Ahora, una advertencia muy importante. ¿Qué pasa si olvidamos escribir contador más más? La condición nunca se vuelve falsa, y el programa repite para siempre. A eso se le llama bucle infinito. La consola se llena de líneas sin parar. No es peligroso para tu computadora, pero sí molesto. Si te pasa, no entres en pánico: pulsa el botón Stop del editor y el programa se detiene. Después, revisa que algo dentro del bucle haga que la condición termine por fin siendo falsa.

**Anotación:** "for = sé cuántas veces · while = repito hasta que algo cambie" · "Bucle infinito: botón Stop".

### [06:20-07:00] Cierre y práctica
**En pantalla:** Texto: "Haz la tabla del 9 y una cuenta regresiva desde 20".

**Narración:**
> Para practicar, haz dos cosas. Primero, la tabla de multiplicar del nueve. Segundo, una cuenta regresiva que empiece en veinte y termine en uno. Si te sale un bucle infinito, ya sabes qué hacer. En el siguiente video aprenderás a organizar tu código en métodos. ¡Hasta pronto!
