package Modelo;

import include.Academia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloAcademia  extends  Conexion{
    public boolean crear_academia(Academia a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO academia VALUES ( ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getClaveAcade());
            pst.setString(2, a.getNombre());
            pst.setInt(3, a.getDocente_RFC());
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

    public ArrayList<Academia> getAllAcademias(){
        ArrayList<Academia> academias = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM academia";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                academias.add(new Academia(rs.getInt("ClaveAcade"),
                        rs.getString("Nombre"),
                        rs.getInt("Docente_RFC")));
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
        return academias;
    }


    }

