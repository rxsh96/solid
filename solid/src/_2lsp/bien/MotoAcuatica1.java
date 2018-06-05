/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2lsp.bien;


/**
 *
 * @author Palacios
 */
public class MotoAcuatica1  implements VehiculoAcuatico1{
    private boolean encendido;

    public MotoAcuatica1() {
        this.encendido = false;
    }
    
    
    /*
      En esta ocasión la clase moto acuática no podria sustituir a su padre sin tener problemas
      ya que depende si este encendida para poder navegar.
    */
    @Override
    public void navegar() {
        if(!estaEncendido())
            throw new UnsupportedOperationException();
        else
            System.out.println("Navegando");
    }
    
    public boolean estaEncendido(){
        return encendido;
        
    }
    
    public void encender(){
        this.encendido = true;
    }
    
}
