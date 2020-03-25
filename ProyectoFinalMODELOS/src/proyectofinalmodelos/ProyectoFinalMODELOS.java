/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalmodelos;

import Constructores.ConstructorElfo;
import Constructores.ConstructorHumano;
import Graficos.Canvas;
import Personajes.Personaje;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ProyectoFinalMODELOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipoPersonaje;
        
        Personaje p;
        Canvas c;
        p = new Personaje();                
        tipoPersonaje = JOptionPane.showConfirmDialog(null, "Escoja su personaje. Presione SI para Humano, NO para elfo y cancelar para salir");
        if(tipoPersonaje == JOptionPane.YES_OPTION){
             ConstructorHumano h = new ConstructorHumano();
             h.construirPersonaje();
             h.construirPartes();
             p = h.getPersonaje();              
             c = new Canvas(p);
            
        }else if(tipoPersonaje == JOptionPane.NO_OPTION){
            ConstructorElfo e = new ConstructorElfo();
            e.construirPersonaje();
            e.construirPartes();
            p = e.getPersonaje();
            c = new Canvas(p);
            
        }else JOptionPane.showMessageDialog(null, "Vuelva Pronto");
                
        
    }
    
}
