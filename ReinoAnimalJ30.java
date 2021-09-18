/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioambiental_dron.reinoanimalj30;

/**
 *
 * @author Acer
 */
public class ReinoAnimalJ30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gato gatito = new Gato(30, true, 4, 60);
        Perro perrito = new Perro (42, true, 4, false);
        
        System.out.println(perrito.getNDientes());
        
        
        
        

    }
    
}
