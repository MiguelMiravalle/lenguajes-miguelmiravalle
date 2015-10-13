/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

/**
 *
 * @author T-107
 */

import java.io.*;
public class InterfazDeUsuario {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        //Generamos el archivo a guardar
        File file=new File("D:\\sucio.xxx");
        //Indicar si vamos a leer o guardar algo en ese archivo
        
        FileOutputStream fos=new FileOutputStream(file);
        //Ponemos algo en el archivo
        String mensajito="Este es un mensajito";
        Integer i=10;
        Float flotante=12.5f;
        //Ahora guardamos el mensaje serializado
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Guardamos
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensaje");
    }
    
}
