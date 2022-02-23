
package com.tito.dida.datos;

import com.tito.dida.dominio.Juego;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.tito.dida.dominio.Personaje;

/**
 *
 * @author ferna
 */
public class PersonajeDAOJBDC {
    private static final String SQL_SELECT = "SELECT idpersonaje, nombre FROM personaje";
    private static final String SQL_SELECT_BY_ID ="SELECT idpersonaje, nombre FROM juego WHERE idpersonaje = ?";
    private static final String SQL_INSERT = "INSERT INTO personaje (nombre) VALUES (?)";
    private static final String SQL_UPDATE = "UPDATE personaje SET nombre = ? WHERE idpersonaje = ?";
    private static final String SQL_DELETE = "DELETE FROM personaje WHERE idpersonaje = ?"; 
    
    public List<Personaje> listar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Personaje personaje = null;
        List<Personaje> personajes = new ArrayList<>();
            try{
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(SQL_SELECT);
                rs = stmt.executeQuery();
                while(rs.next()){
                    int idPersonaje = rs.getInt("idpersonaje");
                    String nombre =rs.getString("nombre");
                    personaje = new Personaje(idPersonaje, nombre);
                    personajes.add(personaje);
                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }finally{
                    Conexion.close(rs);
                    Conexion.close(stmt);
                    Conexion.close(conn);
            }
            return personajes;
    }
    
    public Personaje encontrar(Personaje personaje){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, personaje.getIdPersonaje());
            rs = stmt.executeQuery();
            rs.absolute(1);//forzamos a que empiece en la posicion 1
            String nombre =rs.getString("nombre");
            personaje.setNombre(nombre);
       
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
           Conexion.close(rs);
           Conexion.close(stmt);
           Conexion.close(conn);
        }
        return personaje;
    }
    public int insertar(Personaje personaje){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,personaje.getNombre());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int actualizar(Personaje personaje){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,personaje.getNombre());
            stmt.setInt(6, personaje.getIdPersonaje());
      
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
             
        }finally{
        return rows;
       }
    }   
    public int eliminar(Personaje personaje){
            
           Connection conn = null;
           PreparedStatement stmt = null;
           int rows = 0; 
            
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, personaje.getIdPersonaje());
            
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
             
        }finally{
        return rows;
        }
    }      
}

