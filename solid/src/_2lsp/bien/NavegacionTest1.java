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
public class NavegacionTest1 {
    
    
    /*
     Si enviamos una moto acuatica y no está encendida, obtendremos una excepción.
    */
    public void navegacion(VehiculoAcuatico1... vehiculosAcuaticos) {
		for (VehiculoAcuatico1 vehiculo : vehiculosAcuaticos) {
			vehiculo.navegar();
		}
	}
    
}
