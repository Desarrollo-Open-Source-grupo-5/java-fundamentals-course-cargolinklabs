# Ejecutar Java en tu equipo

El curso puede seguirse en el navegador. Para compilar localmente, instala un JDK 17 o superior desde [Eclipse Adoptium](https://adoptium.net/) o sigue la [guía de Dev.java](https://dev.java/learn/getting-started/). En Windows, si el instalador ofrece agregar el JDK a `PATH`, activa esa opción y abre una terminal nueva.

1. Comprueba que puedes ejecutar `java -version` y `javac -version`.
2. Desde la raíz del repositorio ejecuta el primer ejemplo.

```bash
cd lessons/lesson-01-intro
javac --release 17 -encoding UTF-8 HolaMundo.java
java HolaMundo
```

3. Vuelve a la raíz y usa Git Bash, Bash en Linux o Bash en macOS para ejecutar las verificaciones.

```bash
bash scripts/compile-all.sh
bash scripts/run-tests.sh
```

Para un ejemplo de varios archivos, compila todas las clases de esa lección en la misma carpeta y ejecuta la clase que contiene `main`.
