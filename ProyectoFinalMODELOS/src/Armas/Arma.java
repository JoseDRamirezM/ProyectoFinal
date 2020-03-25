/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author USUARIO
 */
public class Arma {
    
    protected int x;
    protected int y;
    protected int vel;    
    Graphics g;
    protected Image sprite;
    Toolkit herramienta; 
    
    public void mover(){        
           y -= vel;                 
    }
    
    public void draw(Graphics g){
        g.drawImage(sprite, (int) x, (int) y, null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }
    
    

   
}
