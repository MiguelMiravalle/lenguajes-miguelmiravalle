/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author T-107
 */
public class ContenedorGraficadora extends Canvas {
    public static float apertura= 0.01f;
    

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        /*g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.drawLine(getWidth()/2,0,getHeight(),getWidth()/2);*/
        //Eje X
        g.drawLine(0, getHeight()/2 ,getWidth() , getHeight()/2 );
        //Eje y
        g.drawLine(getWidth()/2, 0 ,getWidth()/2 , getHeight());
        
        g.translate(getWidth()/2, getHeight()/2);
        
        //Graficamos una paravola simple
        
        float x0=-100;
        float x1=-99;
        float y0;
        float y1;
        for(int i=0;i<=100;i++){
        y0=-apertura*x0 * x0;
        y1=-apertura*x1 * x1;
        g.drawLine((int)x0,(int) y0,(int) x1,(int) y1);
        x0++;
        x1++;
        
        }
       //vamos a graficar la funcion seno
        
        double xsen0 = -2*Math.PI - 1;
        double xsen1 = -2*Math.PI;
        double ysen0;
        double ysen1;
        
        ysen0 = Math.sin(xsen0);
        ysen1 = Math.sin(xsen1);
        
        for(int i=0;i<=100;i++){
        ysen0=apertura*xsen0 * xsen0;
        ysen1=apertura*xsen1 * xsen1;
        g.drawLine((int)xsen0,(int) ysen0,(int) xsen1,(int) ysen1);
        xsen0++;
        xsen1++;
        
        }
        
        
        
        
        
    }
    
    
    
}
