package Modelo;

import include.Lista;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ModeloLista extends Conexion {
    public boolean crear_lista(Lista a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO lista VALUES ( ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getNumeroSolicitud());
            pst.setInt(2, a.getLibro_ISBN());
            pst.setInt(3, a.getAsignatura_clave());
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

    public ArrayList<Lista> getAllListas(){
        ArrayList<Lista> listas = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM lista";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                listas.add(new Lista(rs.getInt("NumeroSolicitud"),
                        rs.getInt("Libro_ISBN"),
                        rs.getInt("Asignatura_clave")));
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
        return listas;
}

