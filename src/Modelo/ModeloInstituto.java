package Modelo;


import include.Instituto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ModeloInstituto  extends Conexion {
    public boolean crear_instituto(Instituto a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO instituto VALUES ( ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getClaveInst());
            pst.setString(2, a.getNombreInst());
            pst.setString(3, a.getDireccionInst());
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

    public ArrayList<Instituto> getAllInstitutos(){
        ArrayList<Instituto> institutos = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM instituto";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                institutos.add(new Instituto(rs.getString("ClaveInst"),
                        rs.getString("NombreInst"),
                        rs.getString("DireccionInst")));
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
        return institutos;
    }
    /*
    public static void main(String[] args) {
        ModeloInstituto asign = new ModeloInstituto();
        //System.out.println(asign.crear_instituto(new Instituto(1, "Tec. Altamirano", 509)));

        for(Instituto a : asign.getAllInstitutos()) {
            System.out.println(a.getNombreInstituto());
        }
    }
    */
}