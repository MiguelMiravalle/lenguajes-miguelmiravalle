/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class PuebaThreads implements Runnable{
    public static void main(String[] args) {
        /* int x[]=new int[3];
        for(int i=0; i<5; i++){
        System.out.println(x[i]);
        }*/
        
        //Primer paso Creado
        PrimerThread t1=new PrimerThread();
        //Segundo paso Iniciado
        
        Runnable r2 = new PuebaThreads();
        Thread t2=new Thread(r2);
        
        //Tercer forma de crear Threads, esta es la chida
        //Usando clases internas anonimas
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Yo soy un Thread como clase interna anonima");
            }
            
        });
        
        t1.start(); 
        t2.start();
        t3.start();
    }
    
    public void run(){
        System.out.println("Soy el segundo Thread");
    }
    
}
