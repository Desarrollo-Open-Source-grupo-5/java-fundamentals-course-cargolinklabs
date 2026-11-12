# Guion · Lección 9: Encapsulación, getters y setters (6 min)

**Editor:** OnlineGDB, con `Main.java` y `CuentaBancaria.java` ya escritos. El código se explica por partes, seleccionándolo con el mouse.

| Tiempo | En pantalla |
|---|---|
| 00:00 – 00:45 | Portada → dibujo del cajero |
| 00:45 – 01:50 | Dibujo de la caja fuerte con ventanilla |
| 01:50 – 03:10 | `CuentaBancaria.java`: atributos, constructor, getters y setter |
| 03:10 – 04:30 | `depositar` y `retirar` |
| 04:30 – 05:30 | `Main.java`: Run y la trampa en vivo |
| 05:30 – 06:00 | Práctica |

## [00:00 – 00:45] Apertura
> ¡Hola! Imagina que tienes dinero en el banco. Quieres que nadie, absolutamente nadie, pueda entrar y cambiar el número de tu saldo a mano. Solo debería cambiar cuando tú depositas o retiras dinero, siguiendo ciertas reglas. En programación pasa lo mismo: hay datos que no deberían poder modificarse desde cualquier parte del programa. Para protegerlos usamos una idea que se llama encapsulación.

## [00:45 – 01:50] ¿Qué es encapsular?
> Encapsular significa guardar los datos de un objeto dentro de una caja cerrada y dejar una pequeña ventanilla controlada para interactuar con ellos. El saldo está dentro de la caja fuerte y nadie lo toca directamente. Si quieres cambiarlo, tienes que usar la ventanilla, es decir, los métodos depositar o retirar, y esos métodos revisan que la operación tenga sentido. En Java, para cerrar la caja usamos la palabra private: un atributo private solo puede usarse dentro de su propia clase. Para la ventanilla usamos métodos públicos. Los que sirven para leer un dato se llaman getters, de get, «obtener». Los que sirven para cambiarlo se llaman setters, de set, «establecer».

**Anotación:** `private = cerrado · public = abierto · getter = leer · setter = cambiar`

## [01:50 – 03:10] La clase CuentaBancaria
> Aquí tenemos la clase CuentaBancaria. Sus tres atributos, titular, saldo y numeroCuenta, llevan la palabra private delante: esa es la caja cerrada. Debajo está el constructor, que, como viste en el video anterior, se ejecuta al crear la cuenta con new. Aquí recibe el titular y el saldo inicial y los guarda con this. El número de cuenta lo genera la propia clase con generarNumeroCuenta, que también es private: nadie desde afuera puede usarlo. Ahora, los getters. Como los atributos son privados, desde fuera de la clase nadie puede leerlos directamente. Los getters son la ventanilla que nos permite obtener esos datos encapsulados, pero solo para mirarlos, no para cambiarlos. Por ejemplo, getSaldo nos devuelve el saldo. Y aquí está el único setter, setTitular, que recibe un nombre nuevo y lo guarda. No hay setter para el saldo ni para el número de cuenta, y es a propósito: esos datos no deben cambiarse libremente.

**Anotación:** `getNombre() devuelve · setNombre(valor) cambia`

## [03:10 – 04:30] Validar datos: depositar y retirar
> La gran ventaja de encapsular es que podemos poner reglas. El método depositar recibe una cantidad. Si la cantidad es mayor que cero, la suma al saldo; si no, muestra un error. Así nadie puede depositar un monto negativo. El método retirar primero comprueba que la cantidad sea positiva y, dentro, que sea menor o igual que el saldo. Si no alcanza, muestra «Saldo insuficiente». Estos ifs, uno dentro de otro, se llaman anidados. Gracias a ellos, el saldo nunca queda en un estado imposible.

## [04:30 – 05:30] Probamos la cuenta
> En Main creamos una cuenta con el titular Juan Pérez y mil de saldo. Pulso Run. Depositamos quinientos: el saldo sube a mil quinientos. Retiramos doscientos: queda mil trescientos. Intentamos retirar dos mil: «Saldo insuficiente». Depositamos menos cien: error, la cantidad debe ser positiva. Fíjate en esta línea: para mostrar el saldo desde Main usamos getSaldo. No tocamos el atributo, se lo pedimos a la clase por su ventanilla. Ahora voy a intentar hacer trampa: quito estas dos barras para activar cuenta punto saldo igual novecientos noventa y nueve mil. Pulso Run, y Java muestra un error: saldo tiene acceso privado en CuentaBancaria. No me deja saltarme la ventanilla. ¡Eso es encapsulación funcionando!

**Anotación:** `El error "has private access" protege tus datos`

## [05:30 – 06:00] Cierre y práctica
> Para practicar, agrega a tu clase un atributo privado edad, con su getter y un setter que no acepte números negativos. El enlace al código está en la descripción. En el último video juntaremos todo lo que aprendiste en un proyecto completo. ¡Nos vemos!
