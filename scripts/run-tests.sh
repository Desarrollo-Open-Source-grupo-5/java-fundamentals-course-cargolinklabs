#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$root"
bash scripts/compile-all.sh

if ! command -v java >/dev/null; then
    printf 'Agrega java a PATH.\n' >&2
    exit 1
fi

passed=0
skipped=0
check() {
    local lesson="$1" main="$2" input="$3" output expected
    shift 3
    local folder="lessons/$lesson"

    if [[ ! -f "$folder/$main.java" ]]; then
        printf 'Pendiente: %s/%s\n' "$lesson" "$main"
        ((skipped += 1))
        return
    fi

    output="$(printf '%s' "$input" | java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp "build/$folder" "$main")"
    for expected in "$@"; do
        if [[ "$output" != *"$expected"* ]]; then
            printf 'Fallo en %s/%s. Se esperaba: %s\n%s\n' "$lesson" "$main" "$expected" "$output" >&2
            return 1
        fi
    done
    ((passed += 1))
    printf 'Verificado: %s/%s\n' "$lesson" "$main"
}

check lesson-01-intro HolaMundo '' '¡Hola, mundo!'
check lesson-02-variables Variables '' 'Nombre: Ana' 'Edad: 15 años'
check lesson-02-variables OperacionesBasicas '' 'Suma: 15' 'División: 2'
check lesson-03-operadores Operadores '' 'Es adolescente (edad >= 13 Y edad <= 19): true'
check lesson-03-operadores Calculadora '' 'Precio final: $80.0'
check lesson-04-if-else Condicionales '' 'Eres menor de edad' 'Bien hecho. B'
check lesson-04-if-else AdivinaNumero '' 'Tu número es menor'
check lesson-05-bucles BucleWhile '' 'Cuenta: 5' 'La suma es: 55'
check lesson-05-bucles BucleFor '' 'La suma es: 55' '¡Despegue!'
check lesson-05-bucles TablaMultiplicar '' '5 x 10 = 50'
check lesson-06-metodos Metodos '' '5 + 3 = 8' 'Área del triángulo: 25.0'
check lesson-06-metodos CalculadoraMetodos '' 'División: 2.0'
check lesson-07-scanner EntradaDatos $'Ana María\n16\n1.65\n' 'Nombre: Ana María' 'Altura: 1.65 metros'
check lesson-07-scanner CalculadoraInteractiva $'10\n0\n' 'No se puede dividir por cero'
check lesson-08-clases-objetos Main '' 'Soy Luna' 'Max ahora tiene 4 años'
check lesson-09-encapsulacion Main '' 'Saldo insuficiente' 'cantidad debe ser positiva' 'Saldo: $1300.0'
check lesson-10-proyecto-final SistemaEstudiantes $'Ana\n16\n1\n21\n1\n12\n1\n16\n3\n4\n5\n' \
    'La nota debe estar entre 0 y 20' 'Promedio: 14.00' 'Estado: APROBADO' 'Hasta luego'

printf 'Verificaciones aprobadas: %s. Pendientes de integrar: %s.\n' "$passed" "$skipped"
