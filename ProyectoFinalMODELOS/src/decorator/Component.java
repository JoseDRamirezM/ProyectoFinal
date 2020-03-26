/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import Armas.Arma;
import Personajes.Personaje;

/**
 *
 * @author USUARIO
 */
public interface Component {
    public Arma doThis(Personaje p, String tipo);
    
}
