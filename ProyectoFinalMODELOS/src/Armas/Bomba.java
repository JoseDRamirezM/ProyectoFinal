/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

import java.awt.Graphics;
import java.awt.Toolkit;

/**
 *
 * @author USUARIO
 */
public class Bomba extends Arma {
    
    public Bomba(){
        herramienta = Toolkit.getDefaultToolkit();
        sprite = herramienta.getImage(getClass().getResource("/img/spriteBomba.png")).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); 
    }
    
    public Bomba(int x, int y,int vel, Graphics g){
        this.x = x;
        this.y = y;
        this.vel = vel;
        herramienta = Toolkit.getDefaultToolkit();
        sprite = herramienta.getImage(getClass().getResource("/img/spriteBomba.png")).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); 
    }
}
