import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una biblioteca o conjunto de libros.
 * @author Victor Sabariego cossin
 * @version 5.03.2025
 * */
public class Biblioteca {
    // TODO: Documentar estos atributos
    /**
     * Atributo privado que representa una lista de libros
     * @see Libro
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * Constructor que genera una biblioteca con una lista de libros de tipo AarrayList sin ningun parametro de entrada
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    /**
     * Constructor que genera una Lista de libros Con los parámetros dados de entrada
     * @param libros
     */
// Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    // TODO: Testear este metodo.
// Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }
    // TODO: Testear este metodo.
// Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }
    // TODO: Documentar este método

    /**
     * Metodo que devuelve la lista de libros.
     * @return devuelve la lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }
    // TODO: Documentar este método.

    /**
     * Metodo que devuelve un libro que ha sido encontrada por la coincidencia del String que se le da de entrada
     * @param titulo String que apunta al título del libro y que se le da al metodo como entrada para buscar coincidencias de libros
     * @return devuelve el libro con el título que coincida  
     */
// Test 01: buscar libro existente y comprobar que lo localiza.
// Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo.

    /**
     * Metodo ya obsoleto que devuelve un libro que coincida con el autor.
     * @param autor parámetro de entrada para que el metodo busque los libros que tengan la coincidencia con el mismo atributo
     * @return devuelve el libro que coincide con el parámetro de entrada
     * @deprecated recomendable utilizar 2.0
     * @see encuentraLibrosPorAutor(String autor)
     */
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo

    /**
     * Metodo que devuelce una lista de libros que coinciden con los parametros de entrada. Esta es la Version mejorada 2.0
     *
     * @see encuentaLibroPorAutor(String autor)
     * @param autor parámetro de entrada para que el metodo busque los libros que tengan la coincidencia con el mismo atributo
     * @return devuelve una lista de libros coincidentes con el parametro de entrada
     */
// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
