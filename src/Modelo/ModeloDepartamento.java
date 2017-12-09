package Modelo;

import include.Departamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloDepartamento extends Conexion {
    public boolean crear_departamento(Departamento a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO departamento VALUES ( ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getNombreDepar());
            pst.setInt(2, a.getEdificio());
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

    public ArrayList<Departamento> getAllDepartamentos(){
        ArrayList<Departamento> departamentos = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM departamento";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                departamentos.add(new Departamento(rs.getString("NombreDepar"),
                        rs.getInt("Edificio"),
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
        return departamentos;
    }



    }


