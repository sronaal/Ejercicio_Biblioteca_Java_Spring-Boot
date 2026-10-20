# Biblioteca

Taller práctico de Java con Spring Boot: sistema básico para una biblioteca municipal.

Implementa en etapas progresivas los conceptos de variables, condicionales, ciclos, métodos,
clases, encapsulación, objetos y exposición de datos mediante una API REST.

## Requisitos

- Java 21
- Maven Wrapper incluido (`./mvnw`), no hace falta Maven instalado

## Estructura

```
src/main/java/com/ejemplo/biblioteca/
├── BibliotecaApplication.java   # Punto de entrada de Spring Boot
├── Practica.java                # Etapas 1 y 3: Java puro
├── Libro.java                   # Etapa 2: clase con encapsulación
└── BibliotecaController.java    # Etapa 4: API REST
```

## Etapas 1 a 3 — Java puro

Ejecutar el `main` de `Practica`, **no** la aplicación Spring Boot:

```bash
./mvnw -q compile
java -cp target/classes com.ejemplo.biblioteca.Practica
```

Salida esperada:

```
Título: Cien años de soledad
Año: 1967
Disponible: true
Clásico
Contemporáneo
Ejemplar 1
Ejemplar 2
Ejemplar 3
Ejemplar 4
Ejemplar 5
Multa por 3 días: 1500
Multa por 10 días: 5000
Multa por 0 días: 0
Cien años de soledad de Gabriel García Márquez (1967)
El principito de Antoine de Saint-Exupéry (1943)
La sombra del viento de Carlos Ruiz Zafón (2001)
¿Es antiguo? true
¿Es antiguo? true
¿Es antiguo? false
```

## Etapa 4 — API REST

Levantar la aplicación:

```bash
./mvnw spring-boot:run
```

Queda disponible en `http://localhost:8080`.

| Método | Ruta | Descripción | Respuesta |
| --- | --- | --- | --- |
| GET | `/libro` | Un libro como objeto | JSON con `titulo`, `autor` y `anio` |
| GET | `/libros` | Lista de tres libros | Arreglo JSON de 3 libros |
| GET | `/libro/resumen` | Resumen de un libro | `Cien años de soledad de Gabriel García Márquez (1967)` |
| GET | `/prestamo/{dias}` | Estado de un préstamo de 14 días | `Préstamo vigente` o `Préstamo vencido. Multa: $...` |
| GET | `/contar/{n}` | Reto opcional: números del 1 al n | `1 2 3 4 5 ` |

### Regla del préstamo

El préstamo dura 14 días. Solo se cobra multa cuando `dias > 14`, a $500 por cada día de retraso:

| Petición | Respuesta |
| --- | --- |
| `/prestamo/10` | `Préstamo vigente` |
| `/prestamo/14` | `Préstamo vigente` |
| `/prestamo/20` | `Préstamo vencido. Multa: $3000` |
| `/prestamo/abc` | `400 Bad Request` (no convertible a `int`) |

## Pruebas

```bash
./mvnw test
```

## Notas de implementación

- Los atributos de `Libro` son `private` y se leen con getters. Esto protege el estado y permite
  que Jackson construya el JSON.
- `esAntiguo()` no aparece en el JSON porque Jackson solo detecta getters (`getX()`), no métodos
  comunes. Para incluirlo habría que renombrarlo a `getAntiguo()`, algo que la guía no pide.
- El atributo opcional `disponible` del reto extra no se agregó para no alterar el JSON base que
  verifican las etapas 4 y 5.

## Documentación del taller

- `especificaciones.md` — enunciado completo de la actividad
- `RESPUESTAS.md` — hoja de respuestas con resultados y preguntas de comprensión
