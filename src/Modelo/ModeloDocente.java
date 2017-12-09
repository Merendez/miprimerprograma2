package Modelo;

import include.Docente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloDocente  extends Conexion {

    public boolean crear_docente(Docente a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO docente VALUES ( ?, ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getRFCDoce());
            pst.setString(2, a.getNombre());
            pst.setString(3, a.getApellido_paterno());
            pst.setString(4, a.getApellido_materno());
            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if(getConecction() != null) getConecction().close();
                if(pst != null) pst.close();
            } catch (Exception e){

            }
        }
        return flag;
    }

    public ArrayList<Docente> getAllDocente(){
        ArrayList<Docente> docente = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM docente";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                docente.add(new Docente(rs.getInt("RfcDoce"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido_paterno"),
                        rs.getString("Apellido_materno")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConecction() != null)getConecction().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return docente;
    }

