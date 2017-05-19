/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.de.examen.pkg4;

/**
 *
 * @author julio
 */
public class Animes {
    String nombre;
    int cantidad_episodios;
    public Animes(String n,int c){
        this.nombre=n;
        this.cantidad_episodios=c;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCantidad_episodios(int can){
        this.cantidad_episodios=can;
    }
    public int getCantidad_episodios(){
        return cantidad_episodios;
    }
}
