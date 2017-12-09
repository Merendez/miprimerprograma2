package include;


public class CicloEscolar {

    private Integer ClaveCiclo;
    private String Nombre;

    public CicloEscolar(Integer claveCiclo, String nombre) {
        ClaveCiclo = claveCiclo;
        Nombre = nombre;


    }

    public Integer getClaveCiclo() {
        return ClaveCiclo;
    }

    public void setClaveCiclo(Integer claveCiclo) {
        ClaveCiclo = claveCiclo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

}
