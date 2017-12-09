package Modelo;

import include.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloLibro extends Conexion {
    public boolean crear_libro(Libro a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO libro VALUES ( ?, ?, ?, ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getNombreLibro());
            pst.setString(2, a.getAutores());
            pst.setString(3, a.getEditorial());
            pst.setInt(4, a.getAño());
            pst.setInt(5, a.getISBN());
            pst.setInt(6, a.getEdicion());
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

    public ArrayList<Libro> getAllLibros(){
        ArrayList<Libro> libros = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM libro";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                libros.add(new Libro(rs.getString("NombreLibro"),
                        rs.getString("Autores"),
                        rs.getString("Editorial"),
                        rs.getInt("Año"),
                        rs.getInt("ISBN"),
                        rs.getInt("Edicion")));
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
        return libros;
    }


