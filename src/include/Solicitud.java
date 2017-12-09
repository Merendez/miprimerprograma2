package include;

public class Solicitud {

    private int Numero_solicitud;
    private  String Fecha;
    private int  Academia_clave;
    private int Ciclo_escolar_clave;
    private String Departamento_nombre;
    private int Docente_RFC;


    public Solicitud(int numero_solicitud, String fecha, int academia_clave, int ciclo_escolar_clave, String departamento_nombre, int docente_RFC) {
        Numero_solicitud = numero_solicitud;
        Fecha = fecha;
        Academia_clave = academia_clave;
        Ciclo_escolar_clave = ciclo_escolar_clave;
        Departamento_nombre = departamento_nombre;
        Docente_RFC = docente_RFC;
    }

    public int getNumero_solicitud() {
        return Numero_solicitud;
    }

    public void setNumero_solicitud(Integer numero_solicitud) {
        Numero_solicitud = numero_solicitud;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public int getAcademia_clave() {
        return Academia_clave;
    }

    public void setAcademia_clave(int academia_clave) {
        Academia_clave = academia_clave;
    }

    public int getCiclo_escolar_clave() {
        return Ciclo_escolar_clave;
    }

    public void setCiclo_escolar_clave(int ciclo_escolar_clave) {
        Ciclo_escolar_clave = ciclo_escolar_clave;
    }

    public String getDepartamento_nombre() {
        return Departamento_nombre;
    }

    public void setDepartamento_nombre(String departamento_nombre) {
        Departamento_nombre = departamento_nombre;
    }

    public int getDocente_RFC() {
        return Docente_RFC;
    }

    public void setDocente_RFC(int docente_RFC) {
        Docente_RFC = docente_RFC;
    }
}
