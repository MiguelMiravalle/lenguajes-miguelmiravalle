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
public class ProbarColecciones {
    public static void main(String[] args) {
        PersistenciaUsuarios p=new PersistenciaUsuarios();
        System.out.println(p.obtenerUsuario().size());
        
        
        int []algo={1,34,22,-40};
        for (int i:algo){
            System.out.println(i);   
        }
        
        for (Usuario u: p.obtenerUsuario()){
            System.out.println("El Login es: " + u.getLogin() + " y vive en la calle: " + u.getDireccion().getCalle());    
        }
    }
}
