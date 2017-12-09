package include;

public class Instituto {
    private String ClaveInst;
    private String NombreInst;
    private String DireccionInst;


    public Instituto(String claveInst, String nombreInst, String direccionInst) {
        ClaveInst = claveInst;
        NombreInst = nombreInst;
        DireccionInst = direccionInst;
    }

    public String getClaveInst() {
        return ClaveInst;
    }

    public void setClaveInst(String  claveInst) {
        this.ClaveInst = claveInst;
    }

    public String getNombreInst() {
        return NombreInst;
    }

    public void setNombreInst(String nombreInst) {
        NombreInst = nombreInst;
    }

    public String getDireccionInst() {
        return DireccionInst;
    }

    public void setDireccionInst(String direccionInst) {
        DireccionInst = direccionInst;
    }

    public String getclaveInst() {
        return ClaveInst;
    }
}
