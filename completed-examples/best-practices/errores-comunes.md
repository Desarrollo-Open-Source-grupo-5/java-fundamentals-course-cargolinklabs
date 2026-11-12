# Errores comunes

| Síntoma | Revisión |
| --- | --- |
| `class ... is public, should be declared in a file named ...` | El archivo debe tener exactamente el nombre de la clase pública. |
| `cannot find symbol` | Revisa si el identificador está declarado, las mayúsculas y que se compilaron las clases necesarias. |
| La división pierde los decimales. | Convierte un operando a `double` antes de dividir. |
| `InputMismatchException` | Comprueba el tipo de dato y el separador decimal. Los ejemplos interactivos usan punto decimal. |
| `ArrayIndexOutOfBoundsException` | Limita el recorrido a los índices válidos, desde 0 hasta `length - 1`. |
| El bucle nunca termina. | Verifica que una variable de la condición cambie en cada vuelta. |
