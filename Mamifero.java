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
public class Mamifero extends Animal{
    
    protected int nFosasNasales;
    
    public void respirar(){
        int tiempo = 0;
        int diff = 1*nFosasNasales;
        
        while (this.nivelO2 < 100){
            this.nivelO2 += diff/this.peso;
            if (this.nivelO2 > 100){
                this.nivelO2 = 100;
            }
            tiempo += 1;
        }
        
        while (this.nivelCO2 > 0){
            this.nivelCO2 -= diff;
            if (this.nivelCO2 < 0){
                this.nivelCO2 = 0;
            }
            tiempo += 1;
        }
        System.out.println("Tiempo tomado: " + tiempo);
    }
        

    
    
}
