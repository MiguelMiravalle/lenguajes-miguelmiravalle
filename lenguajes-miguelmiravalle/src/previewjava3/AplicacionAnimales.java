/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previewjava3;

/**
 *
 * @author T-107
 */
public class AplicacionAnimales {
    public static void main(String[] args) {
        ComportamientoRuido r=new Raton();
        System.out.println(botonSonido(r));  
        //Aqui se selecciona de una lista, el animal
        
        //Raton r2=new ComportamientoRuido();
        
    }
    
    public static String botonSonido(ComportamientoRuido r){
        return r.hacerRuido();
        
    }
}
