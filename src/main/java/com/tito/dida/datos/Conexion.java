/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tito.dida.datos;


import javax.sql.DataSource;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;




/**
 
 * @author ferna
 */
public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/juegospsp?zeroDateTimeBehavior=convertToNull&useTimezone=true&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
    
    public static DataSource getDataSource (){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        ds.setInitialSize(50);
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }  
    }
    public static void close(PreparedStatement stmt){
        try {
           stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }  
    }
    public static void close(Connection conn){
        try {
           conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }  
    }
    
        

}
    
