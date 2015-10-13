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
public class LeerMensajito {
    public static void main(String[] args) throws Exception{
        
    //Ahora vamos a leer, esta es otra clase
    //El primer paso es obtener el archivo que se guardo     
    File file=new File("D:\\sucio.xxx");
    //El se gundo paso es establecer la direccion de la informacion
    FileInputStream fis=new FileInputStream(file);
    //Creamos el objeto que leera 
    ObjectInputStream ois=new ObjectInputStream(fis);
    //Ahora si a leer el archivo
    String algodon=(String) ois.readObject();
    System.out.println(algodon);

    }
}
