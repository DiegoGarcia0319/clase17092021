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
public class Gato extends Mamifero {
    protected int volRonroneo;
    
    public Gato (int nDientes, boolean pelaje, int nPatas, int volRonroneo) {
        this.nDientes = nDientes;
        this.pelaje = pelaje;
        this.nPatas = nPatas;
        this.volRonroneo = volRonroneo;
    }

    public int getVolRonroneo() {
        return volRonroneo;
    }
    
}
