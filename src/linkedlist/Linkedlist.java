
package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();
        
        // agregar persona al final de la lista
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "TodoCode", 2));
        
        // agregar al principio
        lista.add(0, new Persona(5, "Fernando", 15));
        
        System.out.println("---------------- FOREACH ----------------");
        // recorrer por foreach
        for (Persona persona : lista) {
            System.out.println("prueba: " + persona.getNombre());
        }
        
    }
    
}
