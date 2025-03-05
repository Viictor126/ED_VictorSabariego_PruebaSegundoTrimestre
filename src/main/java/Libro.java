/**
 * Clase que representa el objeto de un libro
 * @author Victor Sabariego Cossin
 * @version 5.03.2025
 */
public class Libro {

    //TODO: Documentar estos atributos
    /**
     * @param titulo atributo privado de tipo String que representaría el título del libro.
     * @param autor atributo privado de tipo String que representaría el autor del libro.
     * @param anioPublicacion autor atributo privado de tipo Entero que representaría el año de publicación del libro.
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // TODO: Documentar este método
    /**
     * Constructor que genera un objeto libro con todos los atributos.
     * */

// TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Metodo que devuelve un String con el nombre del autor.
     * @return devuelve el String con el nombre del autor
     * */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Metodo que devuelve un Integer con el año de la publicación.
     * @return devuelve un integer con el año de la publicación
     * */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
