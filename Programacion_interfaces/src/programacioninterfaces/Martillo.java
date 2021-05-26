/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioninterfaces;

/**
 *
 * @author user10
 */
public class Martillo implements Herramienta {

    @Override
    public String getNombre() {
        return "Martillo";
    }

    @Override
    public String getHabilidad() {
        return "Golpear clavos";
    }
    
}
