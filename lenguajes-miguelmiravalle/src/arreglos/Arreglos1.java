/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-107
 */
public class Arreglos1 {
    public static void main(String[] args) {
        int x;
        //Inicializacion explicita
        int []y={7,-20,15};
        //Inicializacion implicita
        int z[]=new int[4];
       //Arreglo de referenciados
        String mensaje[]={"Hola", "como", " estas"," hoy"};
        System.out.println(z[2]);
        //ciclo for para iterar los elementos del arreglo 
        //de strings
        for(int i=0;i<mensaje.length;i++){
            System.out.println(mensaje[i]);
        }//Termina el ciclo for
        
        //ciclo for mejorado
        for(String valor:mensaje){
            System.out.println(valor);
            if(valor.equals("como"))break;
        }
                
    }
    
}