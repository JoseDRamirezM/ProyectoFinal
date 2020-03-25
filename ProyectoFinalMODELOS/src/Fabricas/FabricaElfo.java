/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armas.Arma;
import Armas.Flecha;

/**
 *
 * @author USUARIO
 */
public class FabricaElfo implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        return new Flecha();
    }        
}
