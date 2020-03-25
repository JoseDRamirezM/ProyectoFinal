/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armas.Arma;
import Armas.Cohete;

/**
 *
 * @author USUARIO
 */
public class FabricaHumano implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        return new Cohete();
    }
    
}
