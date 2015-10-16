/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.*;

/**
 *
 * @author T-107
 */
public class PersistenciaUsuarios {
    
    public ArrayList<Usuario> obtenerUsuario(){
    ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
    //Empezamos a llenar el arraylist generico a la clase usuario
    Direccion d1=new Direccion();
              d1.setCalle("Av.Mexico");
              d1.setColonia("Ejidos Tulpetlac");
              d1.setCp(55130);
              d1.setMunicipio("Ecatepec");
    Usuario u1=new Usuario();
            u1.setDireccion(d1);
            u1.setLogin("Juan");
            u1.setPassword("Algo");
    usuarios.add(u1);
    
    Direccion d2=new Direccion();
              d2.setCalle("La viga");
              d2.setColonia("Xalpa");
              d2.setCp(55123);
              d2.setMunicipio("Ecatepec");
              
    Usuario u2=new Usuario();
            u2.setDireccion(d2);
            u2.setLogin("Ana");
            u2.setPassword("Bien");
    usuarios.add(u2);
            
    Direccion d3=new Direccion();
              d3.setCalle("Sur 44");
              d3.setColonia("Vicente Villada");
              d3.setCp(55090);
              d3.setMunicipio("Ecatepec");
              
    Usuario u3=new Usuario();
            u3.setDireccion(d3);
            u3.setLogin("Pedro");
            u3.setPassword("Nose");  
            
    usuarios.add(u3);        
            
    return usuarios;
    }

}
