/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProbarSerializacion {
    public static void main(String[] args){
    Direccion d1=new Direccion();
              d1.setCalle("Calle 13");
              d1.setColonia("Colonia Sangre");
              d1.setCp(55130);
              d1.setMunicipio("Ecatepec");
    Usuario u=new Usuario();
            u.setDireccion(d1);
            u.setLogin("Miguel");
            u.setPassword("yo");
            
    //Ahora usamos la clase persistencia
    PersistenciaUsuario2 p2=new PersistenciaUsuario2();
        try {
            p2.guardar(u);
            System.out.println("Este usuario se guardo con exito!");
            
        } catch (Exception ex) {
            //Logger.getLogger(ProbarSerializacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

        
    }
    
}
