
package Clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Clase {

    public static void main(String[] args) {
        
       Persona p1 = new Persona("Neisser", "Moreno",6);
       Persona p2 = new Persona("Mariela", "Moreno",5);
       Persona p3 = new Persona("Karen", "Moreno",7);
       Persona p4 = new Persona("Junior", "Moreno",9);
       Persona p5 = new Persona("Fish", "Moreno",8);
       
       List<Persona> personas = new ArrayList<Persona>();
       personas.add(p1);
       personas.add(p2);
       personas.add(p3);
       personas.add(p4);
       personas.add(p5);
        
        Collections.sort(personas);
        for(Persona elemento: personas){
            System.out.println(elemento);
        }
        
        
        
        
        
        
    }

    
    
}
