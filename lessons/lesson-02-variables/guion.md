# Guion de grabación · Lección 02

Guion del equipo. Si se vuelve a grabar la lección, utiliza OnlineGDB para la demostración.

**Responsable**: Integrante 1 · **Editor**: Replit
**Al terminar, el estudiante podrá**: crear variables de cinco tipos, mostrarlas en pantalla y hacer operaciones básicas.

### [00:00-00:35] Apertura y repaso
**En pantalla:** Replit con el Hola Mundo del video anterior ejecutándose.

**Narración:**
> ¡Hola de nuevo! En el video anterior escribiste tu primer programa y mostraste un mensaje en pantalla. Hoy vamos a hacer que tus programas recuerden información, como tu nombre, tu edad o tu altura. Imagina que quieres hacer un programa que te salude y diga cuántos años tienes. ¿Dónde guarda el programa esos datos? En algo que se llama variable. Vamos a descubrir qué es.

### [00:35-01:50] ¿Qué es una variable?
**En pantalla:** Dibujo de tres cajas con etiquetas: "edad" con el número 15, "nombre" con la palabra Ana, "altura" con 1.65.

**Narración:**
> Una variable es una caja con una etiqueta, donde guardamos un dato. Mira estas cajas. Una tiene la etiqueta «edad» y adentro el número quince. Otra tiene la etiqueta «nombre» y adentro la palabra Ana. Otra tiene la etiqueta «altura» y adentro uno punto sesenta y cinco. Lo interesante es que el contenido de la caja puede cambiar. Si hoy tengo quince años, y el año que viene cumplo dieciséis, simplemente cambio lo que hay dentro de la caja «edad». Pero hay una regla importante: en Java, cada caja solo puede guardar un tipo de cosa. Una caja para números enteros no puede guardar texto. A esa clase de contenido se le llama tipo de dato, y vamos a ver los cinco más usados.

**Anotación:** "Variable = caja con etiqueta que guarda un dato".

### [01:50-03:00] Los cinco tipos de datos
**En pantalla:** Tabla animada que aparece fila por fila:
int → 15 · double → 1.65 · String → "Ana" · boolean → true · char → 'A'

**Narración:**
> Los cinco tipos básicos son estos. El primero es int, que guarda números enteros, sin decimales, como la edad: quince, veinte, menos tres. El segundo es double, que guarda números con decimales, como la altura: uno punto sesenta y cinco. Atención: en programación el decimal se escribe con punto, no con coma. El tercero es String, con la S en mayúscula, que guarda texto, y el texto siempre va entre comillas dobles: «Ana». El cuarto es boolean, que solo puede valer true o false, es decir, verdadero o falso. Sirve para responder preguntas de sí o no, como «¿es estudiante?». Y el quinto es char, que guarda una sola letra entre comillas simples, por ejemplo la inicial A. Fíjate en la diferencia: comillas dobles para texto, comillas simples para una sola letra.

**Anotación:** "int · double · String · boolean · char".

### [03:00-04:30] Creamos variables en el editor
**En pantalla:** Escribir `Variables.java` (lección 2 del archivo de código), línea por línea. Después pulsar Run.

**Narración:**
> Vamos a crearlas en el editor. Para crear una variable escribimos primero el tipo, luego el nombre que queremos darle, un signo igual y el valor. Por ejemplo: int edad igual quince, punto y coma. Se lee: «guarda el número quince en una caja de enteros llamada edad». Hacemos lo mismo con el nombre: String nombre igual Ana entre comillas. Con la altura: double altura igual uno punto sesenta y cinco. Con boolean esEstudiante igual true. Y con char inicial igual A entre comillas simples. Fíjate en los nombres: empiezan con minúscula y, cuando tienen dos palabras, la segunda empieza con mayúscula, como esEstudiante. Es una costumbre que usan todos los programadores de Java. Ahora los mostramos con println. Para unir un texto con una variable usamos el signo más. Si escribo «Nombre: » más nombre, Java pega las dos cosas. Ejecuto, y mira la consola: aparecen todos los datos.

**Anotación:** "tipo nombre = valor;" · "El + une textos".

### [04:30-05:30] Operaciones básicas
**En pantalla:** Escribir `OperacionesBasicas.java`. Resaltar el resultado de la división y del módulo en la consola.

**Narración:**
> Las variables numéricas se pueden usar para hacer cuentas. Creamos a igual diez y b igual cinco. Sumamos con más, restamos con menos, multiplicamos con asterisco y dividimos con barra inclinada. Hay un operador más, que quizás no conocías: el porcentaje, que se llama módulo y nos da el residuo de una división. Por ejemplo, diez entre tres da tres, y sobra uno. Ese uno es el módulo. Ejecuto y verifico: suma quince, resta cinco, multiplicación cincuenta, división dos, módulo cero, porque diez entre cinco no deja residuo. Un detalle que debes recordar: cuando divides dos números enteros, Java también te devuelve un entero. Por ejemplo, siete entre dos da tres, no tres punto cinco.

**Anotación:** "% = residuo de la división" · "Entero ÷ entero = entero".

### [05:30-06:00] Cierre y práctica
**En pantalla:** Texto: "Crea tus propias variables: tu nombre, tu edad y tu comida favorita".

**Narración:**
> Es tu turno. Pausa el video y crea tres variables con datos tuyos: tu nombre, tu edad y tu comida favorita, y muéstralas con println. Si algo no funciona, revisa que cada línea termine con punto y coma y que el texto esté entre comillas. En el próximo video aprenderás a comparar valores con operadores. ¡Hasta pronto!
