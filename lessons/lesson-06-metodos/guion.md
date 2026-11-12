# Guion de grabación · Lección 06

Guion del equipo. Si se vuelve a grabar la lección, utiliza OnlineGDB para la demostración.

**Responsable**: Integrante 3 · **Editor**: Replit
**Al terminar, el estudiante podrá**: crear y llamar métodos con parámetros y con valor de retorno.

### [00:00-00:40] Apertura
**En pantalla:** Imagen de una licuadora: entran frutas, sale un jugo.

**Narración:**
> ¡Hola otra vez! Piensa en una licuadora. Tú no necesitas saber cómo funciona por dentro: pones las frutas, presionas el botón y sale el jugo. Y puedes usarla las veces que quieras. En programación existe algo parecido, y se llama método. Un método es un bloque de código con nombre, que puedes usar muchas veces sin volver a escribirlo. Hoy aprenderás a crear los tuyos.

### [00:40-01:30] ¿Por qué usar métodos?
**En pantalla:** Código con el mismo saludo copiado tres veces, y al lado una sola llamada `saludar()` repetida.

**Narración:**
> Imagina que en tu programa quieres saludar en cinco lugares distintos. Podrías copiar el mismo código cinco veces, pero si un día quieres cambiar el saludo, tendrías que corregirlo en cinco sitios, y es fácil olvidarse de alguno. En cambio, si guardas el saludo dentro de un método, lo escribes una sola vez y lo llamas cada vez que lo necesites. Si quieres cambiarlo, lo cambias en un solo lugar. Además, el programa queda más ordenado y fácil de leer. Los programadores tienen una regla: un método, una tarea.

**Anotación:** "Un método = una tarea".

### [01:30-02:40] Tu primer método, con y sin parámetros
**En pantalla:** Escribir `Metodos.java`: los métodos `saludar` y `saludarPersona`. Marcar con colores: public static, tipo de retorno, nombre, parámetros.

**Narración:**
> Vamos a crear uno. Escribimos public static void saludar, paréntesis vacíos, y entre llaves un println que diga «¡Hola!». La palabra void significa «vacío»: este método hace algo, pero no devuelve ningún resultado. Para usarlo, dentro de main escribimos su nombre seguido de paréntesis: saludar. A eso se le llama llamar al método. Puedo llamarlo dos veces y se ejecuta dos veces. Ahora hagámoslo más útil. Un método puede recibir datos de entrada, que se llaman parámetros y se escriben entre los paréntesis. Creamos saludarPersona con un parámetro String nombre, y dentro mostramos «Hola» más el nombre. Lo llamamos con saludarPersona entre paréntesis y la palabra María entre comillas, y luego con Carlos. El mismo método, dos resultados distintos.

**Anotación:** "Parámetro = dato que el método recibe".

### [02:40-03:50] Métodos que devuelven un valor
**En pantalla:** Escribir `sumar` y `calcularArea`. Ejecutar. Diagrama: entradas a la izquierda, caja del método, salida a la derecha.

**Narración:**
> Hay métodos que, en lugar de mostrar algo, devuelven un resultado, igual que la licuadora te devuelve el jugo. En lugar de void escribimos el tipo del dato que devolverá. Por ejemplo, public static int sumar, con dos parámetros: int a e int b. Dentro escribimos return a más b. La palabra return significa «devuelve». Para usarlo, guardamos el resultado en una variable: int resultado igual sumar entre paréntesis cinco coma tres. Mostramos el resultado y aparece ocho. Hagamos otro: calcularArea de un triángulo, que recibe base y altura, ambos double, y devuelve base por altura dividido entre dos. Con base diez y altura cinco, el área es veinticinco.

**Anotación:** "void = no devuelve · int / double = devuelve un número · return".

### [03:50-05:20] Ejemplo: calculadora con métodos
**En pantalla:** Escribir `CalculadoraMetodos.java` con sumar, restar, multiplicar y dividir. Ejecutar. Probar dividir entre cero.

**Narración:**
> Ahora uniremos todo en una calculadora. Creamos cuatro métodos: sumar, restar, multiplicar y dividir. Cada uno recibe dos números decimales y devuelve el resultado. Fíjate en dividir: antes de dividir, usamos un if para comprobar que el segundo número no sea cero, porque en matemáticas no se puede dividir entre cero. Si es cero, mostramos un mensaje de error y devolvemos cero. Es un buen ejemplo de cómo se combinan las cosas que ya aprendiste: variables, decisiones y métodos. En main solo creamos dos números, diez y cinco, y llamamos a cada método. Ejecuto, y aparecen la suma, la resta, la multiplicación y la división. Mira lo limpio que quedó main: se lee casi como una lista de tareas. Para probar el error, cambio el segundo número a cero y ejecuto: aparece el mensaje.

### [05:20-06:00] Cierre y práctica
**En pantalla:** Texto: "Crea un método `esPar` que reciba un número".

**Narración:**
> Reto para ti: crea un método que reciba un número entero y muestre si es par o impar. Pista: usa el módulo que aprendiste, porque un número par tiene residuo cero al dividirlo entre dos. En el siguiente video haremos que el usuario escriba sus propios datos con el teclado. ¡Nos vemos!
