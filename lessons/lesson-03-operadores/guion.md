# Guion de grabación · Lección 03

Guion del equipo. Si se vuelve a grabar la lección, utiliza OnlineGDB para la demostración.

**Responsable**: Integrante 2 · **Editor**: JDoodle
**Al terminar, el estudiante podrá**: usar operadores de comparación y lógicos, y calcular un descuento con variables.

### [00:00-00:50] Apertura
**En pantalla:** Capturas de una tienda en línea con un cartel de descuento.

**Narración:**
> ¡Hola! Seguramente alguna vez viste en una tienda un cartel que dice «veinte por ciento de descuento». ¿Cómo hace el sistema para calcular el precio final? Y cuando entras a un sitio que dice «solo para mayores de dieciocho años», ¿cómo decide si puedes pasar o no? Para todo eso se usan operadores. Un operador es un símbolo que le dice a Java qué operación hacer con los datos. Ya usaste algunos, como el más y el menos. Hoy vas a conocer los que sirven para comparar y para tomar decisiones.

### [00:50-01:40] Un nuevo editor: JDoodle
**En pantalla:** Abrir el enlace de JDoodle. Señalar el área de código y el botón Execute y el recuadro de resultados.

**Narración:**
> Para este video usaremos otro editor en línea, JDoodle. Es parecido a Replit, pero más sencillo: tiene una sola ventana de código, un botón para ejecutar, y debajo, el resultado. Es perfecto para probar ideas rápido. Si ya sabes usar Replit, no tendrás problema: escribes el código en la ventana, pulsas el botón de ejecutar, y el resultado aparece abajo. El enlace con el código preparado está en la descripción. Y ten en cuenta que todo lo que aprendemos funciona igual en cualquier editor de Java, solo cambia el lugar donde lo escribes.

**Anotación:** "JDoodle: escribe → Execute → mira el resultado".

### [01:40-03:10] Operadores de comparación
**En pantalla:** Escribir la primera parte de `Operadores.java` (comparación). Ejecutar y mostrar que cada línea muestra true o false.

**Narración:**
> Empecemos con los operadores de comparación. Sirven para comparar dos valores, y el resultado siempre es verdadero o falso. Creamos una variable int edad igual dieciséis. Ahora preguntamos: ¿edad mayor que dieciocho? Se escribe edad, signo mayor que, dieciocho. Como dieciséis no es mayor que dieciocho, el resultado es false. ¿Edad menor que dieciocho? Con el signo menor que: true. También existen mayor o igual, que se escribe con el signo mayor y un igual pegado, y menor o igual. Ahora cuidado con una trampa clásica: para preguntar si dos valores son iguales se usan dos signos igual seguidos. Un solo igual sirve para guardar un valor en una variable, como en edad igual dieciséis. Dos iguales sirven para preguntar. Y para preguntar si son distintos, usamos signo de exclamación seguido de igual. Ejecuto, y verifica cada línea con lo que esperabas.

**Anotación:** "= guarda un valor · == compara".

### [03:10-04:40] Operadores lógicos
**En pantalla:** Escribir la parte lógica. Dibujar tres tarjetas: AND (&&) "las dos", OR (||) "al menos una", NOT (!) "lo contrario". Ejecutar.

**Narración:**
> Ahora los operadores lógicos, que permiten combinar varias preguntas. Son tres. El primero es Y, que se escribe con dos símbolos ampersand seguidos. Solo da verdadero si las dos condiciones son verdaderas. Por ejemplo, para conducir un auto se necesita ser mayor de edad y también tener licencia. Si falta alguna de las dos, no se puede. El segundo es O, que se escribe con dos barras verticales. Da verdadero si al menos una condición es verdadera. Por ejemplo, para entrar a una promoción basta con ser estudiante o ser menor de veinte años. Y el tercero es NO, el signo de exclamación, que invierte el resultado: lo verdadero pasa a falso y lo falso a verdadero. En nuestro ejemplo, tieneLicencia es false, así que la pregunta «puede conducir» da false. Para saber si es adolescente, preguntamos edad mayor o igual que trece Y edad menor o igual que diecinueve. Con dieciséis, el resultado es true.

**Anotación:** "&& = las dos · || = al menos una · ! = lo contrario".

### [04:40-05:40] Ejemplo práctico: calculadora de descuentos
**En pantalla:** Escribir `Calculadora.java`. Ejecutar y comparar con el cálculo mental.

**Narración:**
> Vamos a unir todo en un ejemplo real: una calculadora de descuentos. Creamos precio igual cien, descuento igual cero punto veinte, que es el veinte por ciento. Para calcular el precio final restamos al precio lo que se descuenta: precio menos, entre paréntesis, precio por descuento. Los paréntesis son importantes, porque Java hace primero lo que está dentro de ellos, igual que en matemáticas. Guardamos eso en precioFinal. El ahorro es el precio original menos el precio final. Mostramos todo con println y ejecutamos: precio original cien, descuento veinte por ciento, ahorro veinte, precio final ochenta. Cambia el precio a doscientos y verás cómo todo se recalcula solo. Esa es la ventaja de programar: haces la cuenta una vez y sirve para cualquier precio.

**Anotación:** "Los paréntesis se resuelven primero".

### [05:40-06:00] Cierre y práctica
**En pantalla:** Texto: "Cambia el descuento a 50% y predice el resultado antes de ejecutar".

**Narración:**
> Prueba con descuento de cero punto cinco. En el próximo video tomaremos decisiones. ¡Nos vemos!
