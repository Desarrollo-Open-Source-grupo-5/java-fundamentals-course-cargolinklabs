# Referencia rápida de Java

## Tipos y expresiones

| Tipo | Ejemplo | Uso |
| --- | --- | --- |
| `int` | `int edad = 16;` | Enteros. |
| `double` | `double altura = 1.65;` | Números decimales. |
| `boolean` | `boolean activo = true;` | Verdadero o falso. |
| `char` | `char inicial = 'A';` | Un carácter. |
| `String` | `String nombre = "Ana";` | Texto. |

- `7 / 2` da `3`. Usa `7.0 / 2` para obtener `3.5`.
- `7 % 2` da `1`.
- `=` asigna. `==` compara valores primitivos. Usa `equals` para comparar el contenido de dos cadenas.
- `&&` requiere ambas condiciones, `||` al menos una y `!` niega una condición.

## Decisiones, repeticiones y métodos

```java
if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

int intentos = 3;
while (intentos > 0) {
    intentos--;
}
```

Dentro de la clase, fuera de `main`, puedes declarar un método como `static int sumar(int a, int b) { return a + b; }`.

## Entrada y objetos

- `Scanner` está en `java.util`. Usa `nextLine()` para una línea completa, `nextInt()` para un entero y `nextDouble()` para un decimal.
- Si llamas `nextLine()` después de un método que lee un token numérico, la primera lectura puede recoger el salto de línea que quedó pendiente.
- `new Perro("Luna", 5, "Pastor Alemán")` crea un objeto. El constructor inicializa sus atributos.
- `private` restringe el acceso directo. Los métodos públicos permiten consultar o modificar el estado con reglas.
- `double[] notas = new double[10];` reserva diez posiciones, con índices de 0 a 9.
