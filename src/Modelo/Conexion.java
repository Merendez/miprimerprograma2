package Modelo;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
private String user = "merendez";
private String password = "55liliana";
private String hostname = "localhost";
private String port ="3306";
private String database ="solicitud_bibliografia";
private String classname = "com.mysql.jdbc.Driver";
private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
private Connection con;


public Conexion(){
    try{
        Class.forName(classname);
        con = DriverManager.getConnection(url, user, password);

    }catch (ClassNotFoundException e){
        System.err.println(e.getMessage());
    }catch (SQLException esql){
        System.err.println(esql.getMessage());
    }
}

public Connection getConecction(){
    return con;

}
}
