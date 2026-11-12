# Lección 9: Encapsulación, getters y setters

**Duración:** 8 min · **Editor:** OnlineGDB · **Video:** [▶ Ver en YouTube](https://www.youtube.com/watch?v=YdSRAi8mRyg)

## Objetivo
Al terminar, podrás proteger los atributos de una clase con `private` y controlarlos con getters, setters y validaciones.

## Conceptos clave
| Concepto | Qué significa |
|---|---|
| Encapsulación | Guardar los datos de un objeto en una "caja cerrada" y dejar una ventanilla controlada para usarlos. |
| `private` | El atributo solo se puede usar dentro de su propia clase. |
| Getter | Método público que **lee** un dato privado, por ejemplo `getSaldo()`. |
| Setter | Método público que **cambia** un dato privado, por ejemplo `setTitular(...)`. |
| Validación | Un `if` dentro del método que impide cambios sin sentido (montos negativos, saldo insuficiente). |

## Archivos
| Archivo | Contenido |
|---|---|
| [`CuentaBancaria.java`](CuentaBancaria.java) | Clase con atributos privados, getters, `setTitular`, `depositar` y `retirar`. |
| [`Main.java`](Main.java) | Crea una cuenta, hace operaciones válidas e inválidas y muestra el saldo. |

## Practica sin instalar nada
▶ **[Abrir en OnlineGDB](https://onlinegdb.com/5qz6c_n6I)** 👈 ¡No necesitas registrarte! Pulsa **Run**.

Salida esperada (el número de cuenta cambia en cada ejecución):
```text
=== OPERACIONES ===
Depósito exitoso de $500.0
Nuevo saldo: $1500.0
Retiro exitoso de $200.0
Nuevo saldo: $1300.0
Error: Saldo insuficiente
Error: La cantidad debe ser positiva
```

**Prueba la protección:** en `Main.java`, quita las dos barras de `// cuenta.saldo = 999999;` y pulsa Run. Java mostrará `error: saldo has private access in CuentaBancaria`.

## Ejercicio
Completa [`starter-files/lesson-09-encapsulacion/PracticaEncapsulacion.java`](../../starter-files/lesson-09-encapsulacion/PracticaEncapsulacion.java): agrega el getter de `edad` y un setter que no acepte números negativos.

## Guion del video
[guion.md](guion.md)
