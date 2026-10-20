package com.ejemplo.biblioteca;

public class Practica {

    public static void main(String[] args) {
        // ===== ETAPA 1: variables, condicionales, ciclos y métodos =====

        // Tarea 1: variables
        String titulo = "Cien años de soledad";
        int anio = 1967;
        boolean disponible = true;

        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Disponible: " + disponible);

        // Tarea 2: if/else probado con dos años
        imprimirEpoca(1967);
        imprimirEpoca(2015);

        // Tarea 3: ciclo for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ejemplar " + i);
        }

        // Tarea 4: llamada al método con tres valores distintos
        System.out.println("Multa por 3 días: " + calcularMulta(3));
        System.out.println("Multa por 10 días: " + calcularMulta(10));
        System.out.println("Multa por 0 días: " + calcularMulta(0));

        // ===== ETAPA 3: crear y usar objetos =====

        // Tarea 1: tres objetos Libro con datos reales
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001);

        // Tarea 2: imprimir el resumen de cada libro
        System.out.println(libro1.resumen());
        System.out.println(libro2.resumen());
        System.out.println(libro3.resumen());

        // Tarea 3: imprimir si cada libro es antiguo
        System.out.println("¿Es antiguo? " + libro1.esAntiguo());
        System.out.println("¿Es antiguo? " + libro2.esAntiguo());
        System.out.println("¿Es antiguo? " + libro3.esAntiguo());

        // Tarea 4: acceso directo a un atributo privado.
        // El IDE marca: "titulo has private access in Libro".
        // Ocurre porque titulo es private: solo se accede desde dentro de Libro.
        // libro1.titulo = "Otro";
    }

    public static void imprimirEpoca(int anio) {
        if (anio < 2000) {
            System.out.println("Clásico");
        } else {
            System.out.println("Contemporáneo");
        }
    }

    public static int calcularMulta(int diasRetraso) {
        return diasRetraso * 500;
    }
}
