/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.bien;

/**
 *
 * @author Palacios
 */
public class Programador1 {
    
    private IComputadora computadora;
    
    /*
        El programador  pueda utilziar cualquier computadaora, 
        tiene total independencia para elegir su computadora
    */
    
    public Programador1(IComputadora computadora) {
        this.computadora = computadora;
    }

    public IComputadora getComputadora() {
        return computadora;
    }

    public void setComputadora(IComputadora computadora) {
        this.computadora = computadora;
    }
    
}
