package include;

public class Departamento {

    private String nombreDepar;
    private Integer Edificio;
    private Integer Docente_RFC;

    public Departamento(String nombreDepar, Integer edificio, Integer docente_RFC) {
        this.nombreDepar = nombreDepar;
        Edificio = edificio;
        Docente_RFC = docente_RFC;
    }

    public String getNombreDepar() {
        return nombreDepar;
    }

    public void setNombreDepar(String nombreDepar) {
        this.nombreDepar = nombreDepar;
    }

    public Integer getEdificio() {
        return Edificio;
    }

    public void setEdificio(Integer edificio) {
        Edificio = edificio;
    }

    public Integer getDocente_RFC() {
        return Docente_RFC;
    }

    public void setDocente_RFC(Integer docente_RFC) {
        Docente_RFC = docente_RFC;
    }
}
