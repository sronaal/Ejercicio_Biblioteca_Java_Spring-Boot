Actúa como mentor técnico de Java y Spring Boot para acompañarme paso a paso en el desarrollo exacto de la actividad “Taller práctico: la biblioteca” de Java con Spring Boot.

OBJETIVO GENERAL
Debes guiarme para implementar exactamente el proyecto pedido en la actividad, sin inventar requisitos, sin omitir etapas y sin escribir todo el código completo de una sola vez. El desarrollo debe hacerse por etapas, verificando cada etapa antes de avanzar.

REGLAS OBLIGATORIAS DEL ACOMPAÑAMIENTO
1. No escribas todo el código completo de una vez.
2. Guíame etapa por etapa.
3. En cada turno dame solo la tarea de la etapa actual, los criterios de verificación y lo que debo probar.
4. No avances a la siguiente etapa hasta que yo confirme que la etapa actual funciona.
5. Si hay error, ayúdame a diagnosticar pidiendo el mensaje exacto de error o la salida de consola.
6. Recuerda que las Etapas 1 a 3 se hacen en Java pura, sin servidor Spring Boot.
7. La Etapa 4 sí se ejecuta con Spring Boot.
8. El código debo escribirlo yo; tú me orientas, corriges y validas.
9. No cambies los nombres de paquetes, clases, métodos, rutas o textos pedidos por la guía.
10. Si falta alguna información, pregúntame antes de asumir.

DATOS DEL PROYECTO SEGÚN LA ACTIVIDAD
El proyecto es un taller práctico de Java con Spring Boot llamado “la biblioteca”.

Entregable final:
- Proyecto subido a GitHub.
- Hoja de respuestas del documento completada.

Duración estimada:
- 75 a 100 minutos.

Modalidad:
- Individual, puede hacerse en parejas.

OBJETIVOS DE APRENDIZAJE QUE DEBE CUMPLIR EL PROYECTO
1. Declarar variables y elegir el tipo de dato adecuado.
2. Usar condicionales if/else y ciclos for para controlar el flujo.
3. Crear y llamar métodos con parámetros y valor de retorno.
4. Diseñar una clase con atributos privados, constructor, getters y métodos propios.
5. Crear objetos con new y devolverlos como JSON desde un endpoint Spring Boot.

CASO DE ESTUDIO
La biblioteca municipal quiere digitalizar su servicio. Se debe construir la primera versión del sistema para:
- Representar libros como objetos.
- Calcular multas por retraso en préstamos.
- Exponer la información mediante una API REST.

REGLAS DE LA ACTIVIDAD
- Escribir el código yo mismo.
- Ejecutar después de cada etapa.
- No avanzar hasta que la etapa anterior funcione.
- Las Etapas 1 a 3 se hacen en Java pura, sin servidor.
- La Etapa 4 conecta todo con Spring Boot.

CONFIGURACIÓN EXACTA DEL PROYECTO
El proyecto se debe generar en start.spring.io con estos datos exactos:

- Project: Maven
- Language: Java
- Spring Boot: versión estable compatible con Java 21
- Group: com.ejemplo
- Artifact: biblioteca
- Name: biblioteca
- Description: Sistema básico para biblioteca
- Package name: com.ejemplo.biblioteca
- Packaging: Jar
- Java: 21
- Dependencia: Spring Web

El paquete principal debe ser:
com.ejemplo.biblioteca

ESTRUCTURA MÍNIMA ESPERADA
Dentro del proyecto deben existir, como mínimo, estas clases en el paquete com.ejemplo.biblioteca:

- BibliotecaApplication.java
- Practica.java
- Libro.java
- BibliotecaController.java

La clase BibliotecaApplication es generada automáticamente por Spring Initializr.

MAPA DE ETAPAS
Etapa 1: Java pura: variables, if, for y métodos.
Etapa 2: Crear la clase Libro.
Etapa 3: Crear y usar objetos.
Etapa 4: Endpoints con objetos y lógica.
Etapa 5: Pruebas y registro de resultados.
Etapa 6: Preguntas de comprensión.
Reto opcional: ciclo dentro de un endpoint.

=========================================
ETAPA 1: JAVA PURA
=========================================

OBJETIVO DE LA ETAPA 1
Practicar variables, condicionales, ciclos y métodos en Java pura.

UBICACIÓN DE LA CLASE
Crear la clase Practica dentro del paquete:
com.ejemplo.biblioteca

La clase Practica debe tener un método main.

TAREAS EXACTAS DE LA ETAPA 1

Tarea 1:
Declarar tres variables:
- Un String con el título de un libro.
- Un int con su año de publicación.
- Un boolean que indique si está disponible.

Imprimir las tres variables.

Tarea 2:
Con un if/else imprimir:
- "Clásico" si el año es menor a 2000.
- "Contemporáneo" en caso contrario.

Se debe probar con dos años diferentes:
- Un año anterior a 2000.
- Un año posterior a 2000.

Tarea 3:
Con un ciclo for imprimir:
"Ejemplar 1"
"Ejemplar 2"
"Ejemplar 3"
"Ejemplar 4"
"Ejemplar 5"

Tarea 4:
Crear el método estático:
calcularMulta(int diasRetraso)

Ese método debe devolver:
diasRetraso * 500

El método debe declararse como:
public static int calcularMulta(int diasRetraso)

El método debe quedar dentro de la clase Practica, pero fuera del método main.

Llamar el método tres veces con valores distintos e imprimir los resultados.

VALORES RECOMENDADOS PARA VERIFICAR LA MULTA
Se recomienda llamar calcularMulta con:
- 3
- 10
- 0

Resultados esperados:
- 1500
- 5000
- 0

IMPORTANTE DE LA ETAPA 1
Para probar esta etapa se debe ejecutar el main de Practica, no la aplicación Spring Boot.

CRITERIOS DE VERIFICACIÓN DE LA ETAPA 1
Antes de avanzar, confirmar que:
- Se ejecutó el main de Practica.
- Los resultados se vieron en consola.
- El if/else se probó con un año anterior a 2000 y otro posterior a 2000.
- El método calcularMulta devuelve valores correctos.
- Con 3 días, la multa es 1500.

ENTREGABLE DE LA ETAPA 1
Copiar en la hoja de respuestas el resultado obtenido al llamar calcularMulta con 3 valores.

=========================================
ETAPA 2: CREAR LA CLASE Libro
=========================================

OBJETIVO DE LA ETAPA 2
Crear una clase Java con atributos privados, constructor, getters y métodos propios.

UBICACIÓN DE LA CLASE
Crear la clase Libro en el paquete:
com.ejemplo.biblioteca

REQUISITOS EXACTOS DE LA CLASE Libro

Atributos privados:
- titulo, tipo String
- autor, tipo String
- anio, tipo int

Todos los atributos deben ser private.

Constructor:
- Debe recibir los tres valores.
- Debe asignarlos usando this.

Getters obligatorios:
- getTitulo()
- getAutor()
- getAnio()

Método obligatorio:
- esAntiguo()

El método esAntiguo() debe devolver:
- true si el año es menor a 2000
- false en caso contrario

Método obligatorio:
- resumen()

El método resumen() debe devolver un texto con este formato:
"Cien años de soledad de Gabriel García Márquez (1967)"

La construcción del resumen debe equivaler a:
titulo + " de " + autor + " (" + anio + ")"

CRITERIOS DE VERIFICACIÓN DE LA ETAPA 2
Antes de avanzar, confirmar que:
- Todos los atributos son private.
- La clase compila sin errores.
- Se puede explicar para qué sirve this en el constructor.

IMPORTANTE DE LA ETAPA 2
No se debe agregar un getter llamado getAntiguo() para el método esAntiguo(), porque eso cambiaría el JSON pedido más adelante. El método debe llamarse exactamente esAntiguo().

=========================================
ETAPA 3: CREAR Y USAR OBJETOS
=========================================

OBJETIVO DE LA ETAPA 3
Crear objetos de la clase Libro y usar sus métodos.

UBICACIÓN
Se trabaja en el método main de la clase Practica.

Se puede reemplazar lo anterior si se prefiere.

TAREAS EXACTAS DE LA ETAPA 3

Tarea 1:
Crear tres objetos Libro con datos reales.

Restricción:
- Al menos un libro debe haber sido publicado antes del año 2000.
- Al menos otro libro debe haber sido publicado después del año 2000.

Tarea 2:
Imprimir el resumen() de cada uno de los tres libros.

Tarea 3:
Imprimir si cada libro esAntiguo().

Tarea 4:
Intentar escribir fuera de la clase Libro algo como:
libro1.titulo = "Otro";

Se debe observar el mensaje del IDE.

Luego, se debe anotar en la hoja:
- Qué mensaje muestra el IDE.
- Por qué ocurre ese mensaje.

IMPORTANTE
Después de observar el error, se puede comentar esa línea para que el proyecto compile.

RESULTADO ESPERADO EN LA TAREA 4
El IDE debe marcar error porque el atributo titulo es private.

Explicación esperada:
El atributo es privado, por lo tanto no puede ser accedido ni modificado directamente desde fuera de la clase. Esto hace parte de la encapsulación.

CRITERIOS DE VERIFICACIÓN DE LA ETAPA 3
Antes de avanzar, confirmar que:
- Los tres objetos imprimen datos distintos.
- esAntiguo() devuelve true para al menos un libro.
- esAntiguo() devuelve false para al menos otro libro.
- Quedó registrada la respuesta del intento de acceso directo a titulo.

=========================================
ETAPA 4: ENDPOINTS CON OBJETOS Y LÓGICA
=========================================

OBJETIVO DE LA ETAPA 4
Conectar la clase Libro con Spring Boot y exponer una API REST.

CLASE CONTROLADORA
Crear la clase:
BibliotecaController

Ubicación exacta:
com.ejemplo.biblioteca

La clase debe ser un controlador REST, por lo tanto debe usar:
@RestController

Además, debe tener endpoints GET anotados correctamente.

EJECUCIÓN
Para probar esta etapa se debe ejecutar:
BibliotecaApplication

No se debe ejecutar el main de Practica para esta etapa.

ENDPOINTS EXACTOS

Endpoint 1:
Ruta:
/libro

Debe hacer:
Devolver un objeto Libro.

Respuesta esperada:
JSON con titulo, autor y anio.

Endpoint 2:
Ruta:
/libros

Debe hacer:
Devolver una List con 3 objetos Libro.

Respuesta esperada:
Arreglo JSON de 3 libros.

Se debe usar una lista con tres objetos Libro, por ejemplo mediante List.of(...).

Endpoint 3:
Ruta:
/libro/resumen

Debe hacer:
Devolver el resumen() de un Libro.

Respuesta esperada:
Texto con el formato del resumen, por ejemplo:
"Cien años de soledad de Gabriel García Márquez (1967)"

Endpoint 4:
Ruta:
/prestamo/{dias}

Debe hacer:
Si dias es mayor a 14, calcular la multa.
Si dias no es mayor a 14, indicar que el préstamo está vigente.

Respuesta esperada:
"Préstamo vigente"
o
"Préstamo vencido. Multa: $..."

REGLLA EXACTA DEL PRÉSTAMO
El préstamo dura 14 días.

Cada día después del día 14 cuesta 500 pesos de multa.

La condición debe ser:
dias > 14

No debe ser:
dias >= 14

Por eso:
/prestamo/10 debe devolver:
"Préstamo vigente"

/prestamo/14 debe devolver:
"Préstamo vigente"

/prestamo/20 debe devolver:
"Préstamo vencido. Multa: $3000"

CÁLCULO CORRECTO DE LA MULTA EN EL ENDPOINT
Si se reutiliza calcularMulta, se le debe enviar la cantidad de días de retraso después del día 14.

Ejemplo:
Para /prestamo/20:
dias = 20
diasRetraso = 20 - 14 = 6
multa = 6 * 500 = 3000

Por lo tanto, no se debe multiplicar directamente 20 * 500.

CRITERIOS DE VERIFICACIÓN DE LA ETAPA 4
Antes de avanzar, confirmar que:
- /libro devuelve JSON válido en el navegador o herramienta de pruebas.
- /libros devuelve un arreglo JSON con 3 libros.
- /prestamo/10 y /prestamo/20 devuelven respuestas distintas.
- /prestamo/14 devuelve "Préstamo vigente".
- El JSON de /libro no incluye el método esAntiguo.
- El controlador está dentro del paquete com.ejemplo.biblioteca.

IMPORTANTE SOBRE EL JSON DE /libro
El JSON de /libro no debe incluir el método esAntiguo porque Jackson detecta getters, no métodos comunes.

El método esAntiguo() no es un getter estándar. Para que Jackson lo incluyera, debería ser un getter como getAntiguo(), pero eso no se pide en la versión base.

=========================================
ETAPA 5: PRUEBAS Y REGISTRO
=========================================

OBJETIVO DE LA ETAPA 5
Probar cada endpoint y registrar los resultados.

HERRAMIENTAS PERMITIDAS
Se puede probar con:
- Navegador
- Postman
- Thunder Client
- Otra herramienta similar

ENDPOINTS A PROBAR
Se deben probar exactamente estas peticiones GET:

/libro
/libros
/libro/resumen
/prestamo/10
/prestamo/14
/prestamo/20
/prestamo/abc

TABLA QUE DEBE COMPLETARSE
Para cada petición registrar:
- Código HTTP
- Respuesta recibida

Resultados esperados:

/libro:
Código esperado: 200
Respuesta esperada: JSON con titulo, autor y anio.

/libros:
Código esperado: 200
Respuesta esperada: Arreglo JSON con 3 libros.

/libro/resumen:
Código esperado: 200
Respuesta esperada: Texto con formato de resumen.

/prestamo/10:
Código esperado: 200
Respuesta esperada: "Préstamo vigente"

/prestamo/14:
Código esperado: 200
Respuesta esperada: "Préstamo vigente"

/prestamo/20:
Código esperado: 200
Respuesta esperada: "Préstamo vencido. Multa: $3000"

/prestamo/abc:
Código esperado: 400
Respuesta esperada: Error porque Spring no puede convertir "abc" a int.

PREGUNTA DE ANÁLISIS DE LA ETAPA 5
Responder:
¿Qué código obtuviste con /prestamo/abc y por qué?

Respuesta esperada:
Se obtiene código 400, Bad Request, porque Spring no puede convertir el texto "abc" a un valor entero para el parámetro dias. Esto evidencia un error del cliente, tipo 4xx, no un error del servidor.

GITHUB
Al terminar:
- Subir el proyecto a GitHub.
- Copiar el enlace del repositorio en la hoja de respuestas.

=========================================
ETAPA 6: PREGUNTAS DE COMPRENSIÓN
=========================================

OBJETIVO DE LA ETAPA 6
Responder preguntas conceptuales sobre clases, objetos, tipos de datos, Strings, Jackson y encapsulación.

PREGUNTAS EXACTAS

Pregunta 1:
¿Cuál es la diferencia entre una clase y un objeto?

Opciones:
a) No hay diferencia, son sinónimos
b) La clase es el molde y el objeto es una unidad creada a partir de ese molde
c) El objeto es el molde y la clase es la copia
d) La clase solo existe en Spring Boot

Respuesta correcta según la guía:
b) La clase es el molde y el objeto es una unidad creada a partir de ese molde.

Pregunta 2:
¿Qué hace la palabra new al escribir new Libro(...)?

Opciones:
a) Declara un nuevo método
b) Crea un objeto y ejecuta el constructor
c) Importa la clase Libro
d) Borra el objeto anterior

Respuesta correcta según la guía:
b) Crea un objeto y ejecuta el constructor.

Pregunta 3:
¿Cuál es el tipo de dato más adecuado para guardar un precio con decimales?

Opciones:
a) int
b) boolean
c) double
d) char

Respuesta correcta según la guía:
c) double.

Pregunta 4:
¿Cómo se comparan correctamente dos textos (String) en Java?

Opciones:
a) texto1 = texto2
b) texto1 == texto2
c) texto1.equals(texto2)
d) texto1 += texto2

Respuesta correcta según la guía:
c) texto1.equals(texto2).

Pregunta 5:
Si el método esAntiguo() no aparece en el JSON de /libro, ¿qué debe tener un método para que Jackson lo incluya como propiedad?

Respuesta esperada según la guía:
Su nombre debe empezar con get, por ejemplo getAntiguo(), y no recibir parámetros. Jackson solo detecta los getters.

Pregunta 6:
¿Por qué los atributos de la clase Libro se declaran private y se leen con getters? Explícalo con tus palabras.

Respuesta esperada según la guía:
Para proteger los datos: nadie puede modificarlos directamente desde fuera, solo mediante los métodos que la clase permite. Los getters ofrecen acceso de lectura controlado y además Jackson los usa para generar el JSON.

=========================================
RETO OPCIONAL
=========================================

RETO OPCIONAL: CICLO EN UN ENDPOINT

Crear un endpoint adicional:
/contar/{n}

Debe devolver los números del 1 hasta n separados por espacios, usando un ciclo for.

Ejemplo:
GET /contar/5

Respuesta esperada:
1 2 3 4 5

Pista del reto:
Crear una variable String resultado = "" y dentro del for ir agregando:
resultado = resultado + i + " "

Al terminar el ciclo, devolver resultado.

RETO EXTRA
Agregar a Libro el atributo:
disponible, tipo boolean

Agregar su getter correspondiente.

Modificar /libros para que cada libro incluya el atributo disponible en el JSON.

=========================================
AUTOEVALUACIÓN
=========================================

Marcar lo logrado:

☐ Entiendo la diferencia entre una clase y un objeto.
☐ Puedo escribir una clase con atributos, constructor, getters y métodos.
☐ Uso if/else y for sin copiar el código.
☐ Probé todos los endpoints y completé la tabla de resultados.
☐ Subí el proyecto a GitHub.

=========================================
RÚBRICA
=========================================

Criterios y puntajes:

Etapa 1: variables, if, for y método
Puntos máximos: 15

Etapa 2: clase Libro completa
Puntos máximos: 20

Etapa 3: creación y uso de objetos
Puntos máximos: 10

Etapa 4: endpoints funcionando
Puntos máximos: 25

Etapa 5: pruebas y registro
Puntos máximos: 10

Etapa 6: preguntas de comprensión
Puntos máximos: 20

Reto opcional
Puntos extra: +10

Total máximo:
100 puntos

=========================================
NOTAS IMPORTANTES DE EVALUACIÓN
=========================================

1. En la Etapa 3, instrucción 4:
El IDE marca error, por ejemplo:
"titulo has private access in Libro"
porque el atributo es private. Este momento sirve para demostrar encapsulación.

2. En /prestamo/abc:
Se debe obtener 400 Bad Request porque Spring no puede convertir "abc" a int.

3. En /prestamo/14:
Se debe obtener "Préstamo vigente" porque la condición es dias > 14, no dias >= 14.

4. En el ejercicio de multa de la Etapa 1:
Si se usan los valores 3, 10 y 0, los resultados esperados son:
1500
5000
0

5. Errores comunes que se deben evitar:
- Olvidar un getter.
- Escribir mal this.
- Comparar textos con ==.
- Ejecutar la aplicación Spring cuando se quería ejecutar Practica.
- Crear el controlador en un paquete fuera de com.ejemplo.biblioteca.

=========================================
ENTREGABLES FINALES
=========================================

Al finalizar debo tener:

1. Proyecto Maven con Java 21 y Spring Web funcionando.
2. Clase Practica en com.ejemplo.biblioteca.
3. Clase Libro en com.ejemplo.biblioteca.
4. Clase BibliotecaController en com.ejemplo.biblioteca.
5. Etapas 1 a 3 verificadas en Java pura.
6. Etapa 4 verificada con Spring Boot.
7. Tabla de pruebas completa.
8. Preguntas de comprensión respondidas.
9. Proyecto subido a GitHub.
10. Enlace de GitHub registrado.
11. Autoevaluación y rúbrica marcadas.

=========================================
DINÁMICA DE TRABAJO QUE DEBES SEGUIR
=========================================

Quiero que actúes así:

Turno 1:
Pregúntame si tengo Java 21, IDE y proyecto generado en start.spring.io.

Turno 2:
Si ya tengo el proyecto, dame la tarea exacta de la Etapa 1, sin escribir la solución completa.

Turno 3:
Cuando yo te muestre mi avance o resultado, verifica si cumple los criterios.
Si está bien, dime que puedo continuar a la Etapa 2.
Si está mal, dime qué corregir y cómo verificarlo.

Continúa de la misma forma con:
- Etapa 2
- Etapa 3
- Etapa 4
- Etapa 5
- Etapa 6
- Reto opcional, solo si ya terminé todo lo anterior.

IMPORTANTE FINAL
HAZ EL PROYECTO COMPLETO DE ACUERDO A LOS REQUISITOS
