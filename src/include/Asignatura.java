package include;

public class Asignatura {
    private int Clave;
    private String Nombre;
    private int Creditos;
    private int ClaveCarrera;

    public Asignatura() {
    }

    public Asignatura(int clave, String nombre, int creditos, int claveCarrera) {
        Clave = clave;
        Nombre = nombre;
        Creditos = creditos;
        ClaveCarrera = claveCarrera;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int clave) {
        Clave = clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int creditos) {
        Creditos = creditos;
    }

    public int getClaveCarrera() {
        return ClaveCarrera;
    }

    public void setClaveCarrera(int claveCarrera) {
        ClaveCarrera = claveCarrera;
    }
}

