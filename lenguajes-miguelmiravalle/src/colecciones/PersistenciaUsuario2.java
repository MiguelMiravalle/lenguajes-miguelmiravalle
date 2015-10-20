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
import java.util.ArrayList;
public class PersistenciaUsuario2 {
    
    //Declaramos el arraylist con la variable de usuario
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario2() {
        usuarios=new ArrayList<Usuario>();
    }
    
    //Guardamos el Usuario
    //Agregamos un Arraylist y dentro de este agregamos el usuario
    //Guardar
    public void guardar(Usuario u)throws Exception{
    //Este es el mas dificil, usa el de abajo.
    //Donde lo guardamos
    File f=new File("D:\\usuario.sql");
    if(f.exists())usuarios=buscarTodos();
    FileOutputStream fos=new FileOutputStream(f);
    //
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    usuarios.add(u);
    oos.writeObject(usuarios); 
    //Si existe ve a buscarTodos
        
    }
    
    //Leer
    public ArrayList<Usuario> buscarTodos()throws Exception{
     //Aqui va toda la tarea, este busca todo
     File file=new File("D:\\usuario.sql");
     FileInputStream fis=new FileInputStream(file);
     ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios=(ArrayList<Usuario>) ois.readObject();
    //Nos regresa un objeto y debemos hacerle casting para que no marque error
     
      
     //Nos regresa el ArrayList de usuarios   
     return usuarios;  
    }
    
    public Usuario buscarUno(Usuario u)throws Exception{
     //public Usuario buscarUno(String loggin)throws Exception. Busca por Loggin
     //public Usuario buscarUno(String password)throws Exception. Busca por password 
     //Aqui va la otra tarea,busca un usuario en especifico
     //Abstracto
     return u;   
        
    }
    
}
