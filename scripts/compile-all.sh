#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$root"
shopt -s nullglob

if ! command -v javac >/dev/null; then
    printf 'Instala un JDK 17 o superior y agrega javac a PATH.\n' >&2
    exit 1
fi

compiled=0
for folder in lessons/lesson-* starter-files/lesson-*; do
    sources=("$folder"/*.java)
    if (( ${#sources[@]} == 0 )); then
        continue
    fi

    output="build/${folder}"
    mkdir -p "$output"
    javac --release 17 -encoding UTF-8 -d "$output" "${sources[@]}"
    printf 'Compilado: %s\n' "$folder"
    ((compiled += 1))
done
printf 'Carpetas compiladas: %s\n' "$compiled"
