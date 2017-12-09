package Modelo;

import include.CicloEscolar;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloCicloEscolar extends  Conexion{

    public boolean crear_cicloescolar(CicloEscolar a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO cicloescolar VALUES ( ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getClaveCiclo());
            pst.setString(2, a.getNombre());
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

    public ArrayList<CicloEscolar> getAllCicloEscolar(){
        ArrayList<CicloEscolar> cicloEscolars = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM cicloescolar";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                cicloEscolars.add(new CicloEscolar(rs.getInt("ClaveCiclo"),
                        rs.getString("Nombre")));
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
        return cicloEscolars;

    }

    }




