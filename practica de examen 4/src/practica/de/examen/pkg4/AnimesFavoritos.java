/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.de.examen.pkg4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author julio
 */
public class AnimesFavoritos {
    ArrayList<Animes> listaAnime1 = new ArrayList();
    public void InsertarAnimes(String nombre,int cant){
      
        Animes animes = new Animes(nombre,cant);
        listaAnime1.add(animes);
    }
    public void mostrarLista(){
        Iterator itr = listaAnime1.iterator();
        while(itr.hasNext()){
            Object elemento = itr.next();
           System.out.println(elemento);
        }
       
    }
}
