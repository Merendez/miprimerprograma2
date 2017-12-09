package include;

public class Academia {
    private int ClaveAcade;
    private String Nombre;
    private int Docente_RFC;

    public Academia(int claveAcade, String nombre, int docente_RFC) {
        ClaveAcade = claveAcade;
        Nombre = nombre;
        Docente_RFC = docente_RFC;
    }

    public int getClaveAcade() {
        return ClaveAcade;
    }

    public void setClaveAcade(int claveAcade) {
        ClaveAcade = claveAcade;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDocente_RFC() {
        return Docente_RFC;
    }

    public void setDocente_RFC(int docente_RFC) {
        Docente_RFC = docente_RFC;
    }
}


