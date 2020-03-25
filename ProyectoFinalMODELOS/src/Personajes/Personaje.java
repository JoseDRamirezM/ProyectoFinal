/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Armas.Arma;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author USUARIO
 */
public class Personaje {
    
    protected int x;
    protected int y;
    protected int posiInicialX;
    protected int posiIncialY;
    protected int posiSpriteX;
    protected int posiSpriteY;
    protected int velX;
    protected int velY;
    protected Arma arma;
    protected Image sprite;
    Toolkit herramienta;

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
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

    public int getPosiInicialX() {
        return posiInicialX;
    }

    public void setPosiInicialX(int posiInicialX) {
        this.posiInicialX = posiInicialX;
    }

    public int getPosiInicialY() {
        return posiIncialY;
    }

    public void setPosiInicialY(int posiIncialY) {
        this.posiIncialY = posiIncialY;
    }

    public int getPosiSpriteX() {
        return posiSpriteX;
    }

    public void setPosiSpriteX(int posiSpriteX) {
        this.posiSpriteX = posiSpriteX;
    }

    public int getPosiSpriteY() {
        return posiSpriteY;
    }

    public void setPosiSpriteY(int posiSpriteY) {
        this.posiSpriteY = posiSpriteY;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }
    

    
}
