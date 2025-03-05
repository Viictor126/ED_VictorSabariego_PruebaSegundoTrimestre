import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("TEMOR A LA LUZ","Stella Tack", 2050);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
        assertTrue(biblioteca.eliminarLibro(this.libro));
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {

    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
    }
}