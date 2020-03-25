/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import Fabricas.FabricaHumano;
import Personajes.Humano;

/**
 *
 * @author USUARIO
 */
public class ConstructorHumano extends ConstructorPersonaje {

    @Override
    public void construirPersonaje() {
        p = new Humano(300 , 100, 0, 64);
    }

    @Override
    public void construirPartes() {
        f = new FabricaHumano();
        p.setArma(f.crearArma());
    }
    
    
}
