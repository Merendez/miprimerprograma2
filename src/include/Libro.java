package include;

public class Libro {

    private String NombreLibro;
    private String Autores;
    private String Editorial;
    private Integer Año;
    private Integer ISBN;
    private Integer Edicion;


    public Libro(String nombreLibro, String autores, String editorial, Integer año, Integer ISBN, Integer edicion) {
        NombreLibro = nombreLibro;
        Autores = autores;
        Editorial = editorial;
        Año = año;
        this.ISBN = ISBN;
        Edicion = edicion;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        NombreLibro = nombreLibro;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        Autores = autores;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public Integer getAño() {
        return Año;
    }

    public void setAño(Integer año) {
        Año = año;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getEdicion() {
        return Edicion;
    }

    public void setEdicion(Integer edicion) {
        Edicion = edicion;
    }
}
