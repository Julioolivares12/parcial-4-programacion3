/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.de.examen.pkg4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author julio
 */
public class ConjuntoDemo1 {
    public static void main(String [] args){
        HashSet conjunto1 = new HashSet();
        conjunto1.add("perro");
        conjunto1.add("gato");
        conjunto1.add("perro");
        System.out.println("elementos del objeto 1 (HasSet)= "+conjunto1);
        
        Set conjunto2  = new HashSet();
        conjunto2.add("armario");
        conjunto2.add("mesa");
        conjunto2.add("armario");
        System.out.println("elemtos del objeto 2 (Set)="+conjunto2);
        
        Collection conjunto3 = new HashSet();
        conjunto3.add("hermano");
        conjunto3.add("hermana");
        conjunto3.add("hermano");
        System.out.println("elementos del objeto 3 (Collection)="+conjunto3);
                
    }
}
