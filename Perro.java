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
public class Perro extends Mamifero{
    protected boolean esAlpha;

    public Perro(int nDientes, boolean pelaje, int nPatas, boolean esAlpha) {
        this.nDientes = nDientes;
        this.pelaje = pelaje;
        this.nPatas = nPatas;
        this.esAlpha = esAlpha;
    }
    
    public boolean esAlpha(){
        return this.esAlpha;
    }
    
}
    

    

    
    
    
    

