package com.ejemplo.biblioteca;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibliotecaController {

    @GetMapping("/libro")
    public Libro libro() {
        return new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
    }

    @GetMapping("/libros")
    public List<Libro> libros() {
        return List.of(
                new Libro("Cien años de soledad", "Gabriel García Márquez", 1967),
                new Libro("El principito", "Antoine de Saint-Exupéry", 1943),
                new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001));
    }

    @GetMapping("/libro/resumen")
    public String resumen() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        return libro.resumen();
    }

    @GetMapping("/prestamo/{dias}")
    public String prestamo(@PathVariable int dias) {
        if (dias > 14) {
            int diasRetraso = dias - 14;
            return "Préstamo vencido. Multa: $" + Practica.calcularMulta(diasRetraso);
        }
        return "Préstamo vigente";
    }

    // Reto opcional: ciclo dentro de un endpoint
    @GetMapping("/contar/{n}")
    public String contar(@PathVariable int n) {
        String resultado = "";
        for (int i = 1; i <= n; i++) {
            resultado = resultado + i + " ";
        }
        return resultado;
    }
}
