/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import Fabricas.FabricaElfo;
import Personajes.Elfo;

/**
 *
 * @author USUARIO
 */
public class ConstructorElfo extends ConstructorPersonaje{

    @Override
    public void construirPersonaje() {
        p = new Elfo(300 , 100, 0, 64) ;
    }

    @Override
    public void construirPartes() {
        f = new FabricaElfo();
        p.setArma(f.crearArma());
    }
    
}
