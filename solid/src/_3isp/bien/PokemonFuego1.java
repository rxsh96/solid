/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3isp.bien;


/**
 *
 * @author Palacios
 */
public class PokemonFuego1 extends Pokemon1 implements EntrenamientoPokemonFuego{

    @Override
    public void aprenderAtaqueFuego() {
        this.getMovimientos().add("Fuego");
    }

    @Override
    public void aprenderAtaqueCorte() {
        this.getMovimientos().add("Corte");
    }
    
}
