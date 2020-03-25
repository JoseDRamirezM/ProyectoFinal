/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class ListaFlechas {
    
    private LinkedList<Flecha> lf = new LinkedList<Flecha>();
      
    
    public ListaFlechas(Graphics g){
        addFlecha(new Flecha(100,300,10, g));
    }
    
    Flecha TempFlecha;
    
    public void mover(){
        for(int i = 0; i < lf.size(); i++){
            TempFlecha = lf.get(i);
            
           
        }
    }
    
    public void draw(Graphics g){
        for(int i = 0; i < lf.size(); i++){
            TempFlecha = lf.get(i);
            
            TempFlecha.draw(g);
        }
    }
    
    public void addFlecha(Flecha f){
        lf.add(f);
    }
    
    public void removeFlecha(Flecha f){
        lf.remove(f);
    }
    
}
