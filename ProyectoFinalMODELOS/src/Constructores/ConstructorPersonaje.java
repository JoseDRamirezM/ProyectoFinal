/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import Fabricas.FabricaAbstracta;
import Personajes.Personaje;

/**
 *
 * @author USUARIO
 */
public abstract class ConstructorPersonaje {
    
    protected Personaje p;
    protected FabricaAbstracta f;
    
    public Personaje getPersonaje(){
        return p;
    }
    public FabricaAbstracta getFabrica(){
        return f;
    }
    
    public abstract void construirPersonaje();
    public abstract void construirPartes();
    
}
