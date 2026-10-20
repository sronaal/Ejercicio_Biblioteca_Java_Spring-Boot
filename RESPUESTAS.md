# Hoja de respuestas — Taller práctico: la biblioteca

## Etapa 1 — Java pura

Resultados de `calcularMulta`:

| Llamada | Resultado |
| --- | --- |
| `calcularMulta(3)` | 1500 |
| `calcularMulta(10)` | 5000 |
| `calcularMulta(0)` | 0 |

Salida del `main` de `Practica`: título, año y disponibilidad; `Clásico` (1967) y `Contemporáneo` (2015);
`Ejemplar 1` a `Ejemplar 5`; y las tres multas.

## Etapa 2 — Clase Libro

- Atributos `private`: `titulo`, `autor`, `anio`.
- Constructor con los tres parámetros, asignados con `this`.
- Getters: `getTitulo()`, `getAutor()`, `getAnio()`.
- `esAntiguo()` devuelve `true` si `anio < 2000`.
- `resumen()` devuelve `titulo + " de " + autor + " (" + anio + ")"`.

**¿Para qué sirve `this` en el constructor?**
Distingue el atributo del objeto del parámetro que tiene el mismo nombre. `this.titulo` es el atributo
del objeto; `titulo` es el parámetro recibido.

## Etapa 3 — Crear y usar objetos

| Libro | `resumen()` | `esAntiguo()` |
| --- | --- | --- |
| Cien años de soledad — Gabriel García Márquez (1967) | `Cien años de soledad de Gabriel García Márquez (1967)` | `true` |
| El principito — Antoine de Saint-Exupéry (1943) | `El principito de Antoine de Saint-Exupéry (1943)` | `true` |
| La sombra del viento — Carlos Ruiz Zafón (2001) | `La sombra del viento de Carlos Ruiz Zafón (2001)` | `false` |

**Tarea 4 — acceso directo a `titulo`:**
El IDE marca `titulo has private access in Libro`. Ocurre porque el atributo es `private`: solo se
puede acceder desde dentro de la propia clase. Es el principio de encapsulación. La línea se deja
comentada para que el proyecto compile.

## Etapa 4 — Endpoints

| Endpoint | Respuesta |
| --- | --- |
| `GET /libro` | `{"titulo":"Cien años de soledad","autor":"Gabriel García Márquez","anio":1967}` |
| `GET /libros` | Arreglo JSON con 3 libros (`titulo`, `autor`, `anio`) |
| `GET /libro/resumen` | `Cien años de soledad de Gabriel García Márquez (1967)` |
| `GET /prestamo/{dias}` | `Préstamo vigente` o `Préstamo vencido. Multa: $...` |

Nota: `esAntiguo()` no aparece en el JSON porque Jackson solo detecta getters (`getX()`), no métodos
comunes. Para incluirlo habría que renombrarlo a `getAntiguo()`, lo cual no se pide en la versión base.

## Etapa 5 — Pruebas y registro

| Petición | Código HTTP | Respuesta recibida |
| --- | --- | --- |
| `/libro` | 200 | `{"titulo":"Cien años de soledad","autor":"Gabriel García Márquez","anio":1967}` |
| `/libros` | 200 | Arreglo JSON con 3 libros |
| `/libro/resumen` | 200 | `Cien años de soledad de Gabriel García Márquez (1967)` |
| `/prestamo/10` | 200 | `Préstamo vigente` |
| `/prestamo/14` | 200 | `Préstamo vigente` |
| `/prestamo/20` | 200 | `Préstamo vencido. Multa: $3000` |
| `/prestamo/abc` | 400 | `Bad Request`: Spring no puede convertir `"abc"` a `int` |

**¿Qué código obtuviste con `/prestamo/abc` y por qué?**
400 Bad Request. Spring no puede convertir el texto `"abc"` a un valor entero para el parámetro
`dias`. Es un error del cliente (4xx), no del servidor.

## Etapa 6 — Preguntas de comprensión

1. **b)** La clase es el molde y el objeto es una unidad creada a partir de ese molde.
2. **b)** Crea un objeto y ejecuta el constructor.
3. **c)** `double`.
4. **c)** `texto1.equals(texto2)`.
5. El método debe empezar con `get`, no recibir parámetros y devolver un valor: Jackson solo detecta
   getters. Por eso `esAntiguo()` no aparece pero `getTitulo()` sí.
6. Para proteger los datos: nadie puede modificarlos directamente desde fuera, solo mediante los
   métodos que la clase permite. Los getters dan acceso de lectura controlado y Jackson los usa para
   construir el JSON.

## Reto opcional

- `GET /contar/{n}`: devuelve los números del 1 al `n` separados por espacio usando un ciclo `for`.
  Ejemplo: `GET /contar/5` → `1 2 3 4 5 `.
- Reto extra (`disponible` en `Libro`): no se aplicó para no alterar el JSON base de `/libro` ni de
  `/libros` que exige la guía. Se puede agregar después si el docente lo pide.

## Autoevaluación

- [x] Entiendo la diferencia entre una clase y un objeto.
- [x] Puedo escribir una clase con atributos, constructor, getters y métodos.
- [x] Uso if/else y for sin copiar el código.
- [x] Probé todos los endpoints y completé la tabla de resultados.
- [ ] Subí el proyecto a GitHub. _(pendiente: crear el repositorio remoto)_
