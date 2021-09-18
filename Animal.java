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
public class Animal {
    protected int nDientes;
    protected boolean pelaje;
    protected int nPatas;
    protected double peso;
    protected int nivelO2;
    protected int nivelCO2;
    
    public void respirar() {
        this.nivelO2 = 100;
        this.nivelCO2 = 0;
    }
    
    public int getNDientes(){
        return this.nDientes;
    }
}



