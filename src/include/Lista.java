package include;

public class Lista {

    private Integer NumeroSolicitud;
    private Integer Libro_ISBN;
    private Integer Asignatura_clave;


    public Lista(Integer numeroSolicitud, Integer libro_ISBN, Integer asignatura_clave) {
        NumeroSolicitud = numeroSolicitud;
        Libro_ISBN = libro_ISBN;
        Asignatura_clave = asignatura_clave;
    }

    public Integer getNumeroSolicitud() {
        return NumeroSolicitud;
    }

    public void setNumeroSolicitud(Integer numeroSolicitud) {
        NumeroSolicitud = numeroSolicitud;
    }

    public Integer getLibro_ISBN() {
        return Libro_ISBN;
    }

    public void setLibro_ISBN(Integer libro_ISBN) {
        Libro_ISBN = libro_ISBN;
    }

    public Integer getAsignatura_clave() {
        return Asignatura_clave;
    }

    public void setAsignatura_clave(Integer asignatura_clave) {
        Asignatura_clave = asignatura_clave;
    }
}
