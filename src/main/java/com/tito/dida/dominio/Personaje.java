
package com.tito.dida.dominio;

/**
 *
 * @author ferna
 */
public class Personaje {
    
    private int idPersonaje;
    private String nombre;

    public Personaje() {
    }
 
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    
    public Personaje(int idPersonaje, String nombre) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "personaje{" + "id=" + idPersonaje + ", nombre=" + nombre + '}';
    }
    
    
    
}
