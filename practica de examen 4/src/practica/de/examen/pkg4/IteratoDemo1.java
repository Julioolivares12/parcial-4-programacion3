/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.de.examen.pkg4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author julio
 */
public class IteratoDemo1 {
    public static void main(String [] args){
        ArrayList lista1 = new ArrayList();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        lista1.add("D");
        System.out.println("contenido pricipal de la lista");
        Iterator itr =lista1.iterator();
        while(itr.hasNext()){
            Object elemento = itr.next();
            System.out.print(elemento+" ");
        }
        System.out.println();
        
        //modificando los elementos 
        ListIterator litr = lista1.listIterator();
        while(litr.hasNext()){
            Object elemento = litr.next();
            litr.set(elemento+"+");
        }
        System.out.println("Contenido modificado de la lista");
        itr=lista1.iterator();
        while(itr.hasNext()){
            Object elemento = itr.next();
            System.out.print(elemento+" ");
        }
        System.out.println();
    }
}
