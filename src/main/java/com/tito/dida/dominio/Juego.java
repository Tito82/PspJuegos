/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tito.dida.dominio;

/**
 *
 * @author ferna
 */
public class Juego {
    private int idJuego;
    private String nombre;
    private int anho;
    private String descripcion;
    private String valoracion;
    private String desarrollador;
    private String plataforma;
    private int cod_personaje;
    
    public Juego(){
        
    }
    
    public Juego(int idJuego){
        this.idJuego = idJuego;
    }

    public Juego(int idJuego, String nombre, int anho, String descripcion, String valoracion, String desarrollador, String plataforma) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.anho = anho;
        this.descripcion = descripcion;
        this.valoracion = valoracion;
        this.desarrollador = desarrollador;
        this.plataforma = plataforma;
    }

   

    public Juego(int idJuego, String nombre, int anho, String descripcion, String valoracion, String desarrollador, String Plataforma, int cod_personaje) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.anho = anho;
        this.descripcion = descripcion;
        this.valoracion = valoracion;
        this.desarrollador = desarrollador;
        this.plataforma = plataforma;
        this.cod_personaje = cod_personaje;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getCod_personaje() {
        return cod_personaje;
    }

    public void setCod_personaje(int cod_personaje) {
        this.cod_personaje = cod_personaje;
    }

    @Override
    public String toString() {
        return "Juego{" + "idJuego=" + idJuego + ", nombre=" + nombre + ", anho=" + anho + ", descripcion=" + descripcion + ", valoracion=" + valoracion + ", desarrollador=" + desarrollador + ", plataforma=" + plataforma + '}';
    }

    
    
}
