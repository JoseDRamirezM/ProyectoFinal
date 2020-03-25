/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author USUARIO
 */
public class Teclado implements KeyListener {
    
    private final static int numeroTeclas = 120;
    private final boolean[] teclas = new boolean[numeroTeclas];
        
    public boolean izquierda;
    public boolean derecha;
    public boolean atacar;        
    public boolean estadoPersonaje;
    
    public void actualizar(){       
        derecha = teclas[KeyEvent.VK_D];
        izquierda = teclas[KeyEvent.VK_A];
        atacar= teclas[KeyEvent.VK_SPACE];             
    }
    
    @Override
    public void keyTyped(KeyEvent e) {    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()] = true;
        if(derecha || izquierda || atacar){
            estadoPersonaje = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
        estadoPersonaje = false;       
    }
    
}
