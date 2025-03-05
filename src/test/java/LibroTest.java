import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class LibroTest {

    Libro libro;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        libro = new Libro("TEMOR A LA LUZ","Stella Tack", 2050);
    }

    @org.junit.jupiter.api.Test
    void Libro(){
        assertEquals(libro,"TEMOR A LA LUZ");
    }

}