
package com.tito.dida.datos;

import com.tito.dida.dominio.Juego;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ferna
 */
public class JuegoDAOJDBC {
    private static final String SQL_SELECT = "SELECT idjuego, nombre, anho, descripcion, valoracion, desarrollador, plataforma FROM juego";
    private static final String SQL_SELECT_BY_ID ="SELECT idjuego, nombre, anho, descripcion, valoracion,desarrollador, plataforma FROM juego WHERE idjuego = ?";
    private static final String SQL_INSERT = "INSERT INTO juego (nombre, anho, descripcion, valoracion, desarrollador, plataforma) VALUES (?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE juego SET nombre = ?, anho = ?, descripcion = ?, valoracion = ?, desarrollador = ?, plataforma = ? WHERE idjuego = ?";
    private static final String SQL_DELETE = "DELETE FROM juego WHERE idjuego = ?";                                     


    public List<Juego> listar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Juego juego = null;
        List<Juego> juegos = new ArrayList<>();
            try{
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(SQL_SELECT);
                rs = stmt.executeQuery();
                while(rs.next()){
                    int idJuego = rs.getInt("idjuego");
                    String nombre =rs.getString("nombre");
                    int anho =rs.getInt("anho");
                    String descripcion = rs.getString("descripcion");
                    String valoracion = rs.getString("valoracion");
                    String desarrollador = rs.getString("desarrollador");
                    String plataforma = rs.getString("plataforma");
                    juego = new Juego(idJuego, nombre, anho, descripcion, valoracion, desarrollador, plataforma);
                    juegos.add(juego);
                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }finally{
                    Conexion.close(rs);
                    Conexion.close(stmt);
                    Conexion.close(conn);
            }
            return juegos;
    }
    
    public Juego encontrar(Juego juego){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, juego.getIdJuego());
            rs = stmt.executeQuery();
            rs.absolute(1);//forzamos a que empiece en la posicion 1
            String nombre =rs.getString("nombre");
            int anho =rs.getInt("anho");
            String descripcion = rs.getString("descripcion");
            String valoracion = rs.getString("valoracion");
            String desarrollador = rs.getString("desarrollador");
            String plataforma = rs.getString("plataforma");
            juego.setNombre(nombre);
            juego.setAnho(anho);
            juego.setDescripcion(descripcion);
            juego.setValoracion(valoracion);
            juego.setDesarrollador(desarrollador);
            juego.setPlataforma(plataforma);
            
            
            
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
           Conexion.close(rs);
           Conexion.close(stmt);
           Conexion.close(conn);
        }
        return juego;
    }
    public int insertar(Juego juego){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,juego.getNombre());
            stmt.setInt(2,juego.getAnho());
            stmt.setString(3,juego.getDescripcion());
            stmt.setString(4,juego.getValoracion());
            stmt.setString(5,juego.getDesarrollador());
            stmt.setString(6,juego.getPlataforma());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int actualizar(Juego juego){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,juego.getNombre());
            stmt.setInt(2,juego.getAnho());
            stmt.setString(3,juego.getDescripcion());
            stmt.setString(4,juego.getValoracion());
            stmt.setString(5,juego.getDesarrollador());
            stmt.setString(6,juego.getPlataforma());
            stmt.setInt(7, juego.getIdJuego());
      
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
             
        }finally{
        return rows;
       }
    }   
    public int eliminar(Juego juego){
            
           Connection conn = null;
           PreparedStatement stmt = null;
           int rows = 0; 
            
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,juego.getIdJuego());
            
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
             
        }finally{
        return rows;
        }
    }      
}
