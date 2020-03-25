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
public class Flecha extends Arma{
    
    
    public Flecha(){
        herramienta = Toolkit.getDefaultToolkit();
        sprite = herramienta.getImage(getClass().getResource("/img/spriteFlecha.png")).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); 
    }
    
    public Flecha(int x, int y, int vel, Graphics g){
        this.x = x;
        this.y = y;
        this.vel = vel;
        herramienta = Toolkit.getDefaultToolkit();
        sprite = herramienta.getImage(getClass().getResource("/img/spriteFlecha.png")).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); 
    }
        
    
    
}
