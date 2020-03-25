/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Armas.Arma;
import Armas.ListaFlechas;
import Control.Teclado;
import Personajes.Personaje;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class Canvas extends JFrame implements Runnable{
    
    private final int ANCHO_VENTANA = 600;
    private final int ALTO_VENTANA = 400;
    
    private Personaje p;
    private Image imgPersonaje;
    private Image imgCaja;
    private Thread hilo;
    private BufferedImage fondo;
    private int incremento = 0;
       
    private boolean colision;
    private boolean colisionProyectil;
    
    private ListaFlechas lf;
    private Arma arma;
    
    int i = 0;
    private int mx;
    private int my;    
    Graphics g2d;
    Teclado t;
    int velX, velY, posiSpriteX, posiSpriteY, xPersonaje, frames = 8, posiCajaX, posiCajaY, xProyectil, yProyectil;    
    
    
    public Canvas(Personaje p){
        this.setSize(ANCHO_VENTANA, ALTO_VENTANA);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Juego");
        this.setResizable(false);
        t = new Teclado();
        addKeyListener(t);
        this.p = p;
        velX = p.getVelX();
        velY = p.getVelY();
        posiSpriteX = p.getPosiSpriteX();
        posiSpriteY = p.getPosiSpriteY();    
        xPersonaje = p.getX();
              
        
        
//        definirCajaX();
//        definirCajaY();
        posiCajaX = 400;
        posiCajaY = 300;
        
        colision = false;
        colisionProyectil = false;
        
        lf = new ListaFlechas(g2d);
        arma = p.getArma();
        xProyectil = arma.getX();
        yProyectil = arma.getY();
        arma.setVel(10);
                
        hilo = new Thread(this);
        fondo = new BufferedImage(ANCHO_VENTANA, ALTO_VENTANA, BufferedImage.TYPE_INT_RGB);        
        Toolkit herramienta;
        herramienta = Toolkit.getDefaultToolkit();
        imgPersonaje = p.getSprite();
        imgCaja = herramienta.getImage(getClass().getResource("/img/spriteFlecha.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);         
        hilo.start();                      
        this.setVisible(true);
    }
    
    
    @Override
    public void paint(Graphics g){
     
        g.drawImage(fondo, 0, 0, this);
        g2d = (Graphics2D) fondo.getGraphics();
        g2d.fillRect(0, 0, ANCHO_VENTANA, ALTO_VENTANA);
        
        mx = (incremento%frames)*64;
        my = i;
        
        pintarSpriteInicialPersonaje(imgPersonaje, p.getPosiInicialX());
        pintarCaja();
        
        
        this.repaint();
        
        if(t.derecha){
            p.setVelX(8);
            p.setPosiSpriteX(192);
            p.setPosiSpriteY(256);
            
            i = 448;
            
            velX = p.getVelX();            
            posiSpriteX = p.getPosiSpriteX();            
            posiSpriteY = p.getPosiSpriteY();
            
            pintarSpritePostAccion(imgPersonaje, p.getPosiInicialX());
            
        }else if(t.izquierda){
            p.setVelX(-8);
            p.setPosiSpriteX(64);
            p.setPosiSpriteY(128);
            
            i = 320;
            
            velX = p.getVelX();            
            posiSpriteX = p.getPosiSpriteX();            
            posiSpriteY = p.getPosiSpriteY();
            
            pintarSpritePostAccion(imgPersonaje, p.getPosiInicialX());
            
        }else if(t.atacar){
            frames = 6;                     
            p.setPosiSpriteX(0);
            p.setPosiSpriteY(64);
            
            i = 768;
                                    
            posiSpriteX = p.getPosiSpriteX();            
            posiSpriteY = p.getPosiSpriteY();
            pintarSpritePostAccion(imgPersonaje, p.getPosiInicialX());
            
            
            pintarProyectil();
            
        }
        
    }
    
    public void pintarSpriteInicialPersonaje(Image img, int posiInicial){
        
        g2d.drawImage(img, posiInicial+p.getX(), posiInicial, posiInicial+64+p.getX() , posiInicial+64, posiSpriteX, posiSpriteX, posiSpriteY, posiSpriteY, this);
        g2d.setColor(Color.RED);
        g2d.drawRect( posiInicial+p.getX(), posiInicial, 64, 64);
    }
    
    public void pintarSpritePostAccion(Image img, int posiInicial){
        
        g2d.drawImage(img, posiInicial+p.getX(), posiInicial, posiInicial+64+p.getX() , posiInicial+64 ,mx ,my ,mx+64 ,my+64 ,this);
    }
    
    public void pintarCaja(){
        g2d.setColor(Color.RED);
        g2d.drawRect(posiCajaX, posiCajaY, 50, 50);
    }
        
    public void definirCajaX(){
        posiCajaX = new Random().nextInt(570);      
    }
    
    public void definirCajaY(){
        
        posiCajaY = ThreadLocalRandom.current().nextInt(0, 250 );              
    }
    
    public void pintarProyectil(){
        arma.setX(p.getPosiInicialX()+ xPersonaje);
        arma.setY(p.getPosiInicialX()-50);
        xProyectil = arma.getX();
        yProyectil = arma.getY();
        arma.draw(g2d);
        for(int i = 0; i < ALTO_VENTANA; i++){
            arma.mover();
            yProyectil = arma.getY();
            arma.draw(g2d);
            g2d.drawRect(xProyectil, yProyectil, 50, 50);
            colisionProyectil();
        }
        
        
    }
    
    public void colision(){
        Rectangle rect1 = new Rectangle(p.getPosiInicialX()+p.getX(), p.getPosiInicialX(), 64, 64 );
        Rectangle rect2 = new Rectangle(posiCajaX, posiCajaY, 20, 20);
        if(rect1.intersects(rect2) && t.atacar){
            colision = true;
        }else colision = false;     
        
    }
    
    public void colisionProyectil(){
        Rectangle rect1 = new Rectangle(xProyectil, yProyectil, 50, 50 );
        Rectangle rect2 = new Rectangle(posiCajaX, posiCajaY, 20, 20);
        if(rect1.intersects(rect2) && t.atacar){
            colisionProyectil = true;
        }else colisionProyectil = false;     
        
    }

    @Override
    public void run() {
        requestFocusInWindow();
        while(true){
            try{
                t.actualizar();
                colision();                
                if(colision){
                    definirCajaX();
                    definirCajaY();
                }
                if(colisionProyectil){
                    definirCajaX();
                    definirCajaY();
                }
                if(t.estadoPersonaje && !t.atacar){
                    xPersonaje += velX; 
                    p.setX(xPersonaje);
                }       
            Thread.sleep(50);                        
            } catch (InterruptedException ex){
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
            incremento++; 
               
            
            if(incremento > 221){
                incremento = 0;
            }
            
            }
        }
}
    
