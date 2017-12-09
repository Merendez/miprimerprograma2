package Modelo;

import include.Solicitud;

import java.sql.PreparedStatement;

public class ModeloSolicitud  extends  Conexion{

    public boolean crearSolicitud(Solicitud i) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO solicitud VALUES (?, ?, ?, ?, ?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, i.getNumero_solicitud());
            pst.setString(2, i.getFecha());
            pst.setInt(3, i.getAcademia_clave());
            pst.setInt(4, i.getCiclo_escolar_clave());
            pst.setString(5, i.getDepartamento_nombre());
            pst.setInt(6, i.getDocente_RFC());
            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {

        } finally {
            try {
                if (getConecction() != null)
                    getConecction().close();
                if (pst != null)
                    pst.close();
            } catch (Exception e) {

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        ModeloSolicitud modelo = new ModeloSolicitud();
        System.out.println(modelo.crearSolicitud
                (new Solicitud(1, "12 de agosto",
                        2,
                        2,"desarrollo academico", 13)));

    }

}
