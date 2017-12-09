package include;

public class Docente {
private int RfcDoce;
private String Nombre;
private String  Apellido_paterno;
private String Apellido_materno;


public Docente () {
    }

    public Docente (int rfcDoce, String nombre, String apellido_paterno, String apellido_materno ){

    RfcDoce = rfcDoce;
    Nombre = nombre;
    Apellido_paterno = apellido_paterno;
    Apellido_materno = apellido_materno;

    }

    public int getRFCDoce() {
        return RfcDoce;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido_paterno() {
        return Apellido_paterno;
    }

    public String getApellido_materno() {
        return Apellido_materno;
    }

    public void setRFCDoce(int RFCDoce) {
        this.RfcDoce = RFCDoce;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido_paterno(String apellido_paterno) {
        Apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        Apellido_materno = apellido_materno;
    }
}
