/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.*;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Spartan0117
 */
public class PersistenciaNominas {
    ArrayList<Nomina> nominas;

    public PersistenciaNominas(){
    nominas=new ArrayList<Nomina>();
    }
    
    public void guardar(Nomina nomina) throws Exception{
    File file=new File("nominas");
    if(file.exists()) nominas=leeTodo();
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        nominas.add(nomina);
        oos.writeObject(oos);
        oos.close();
    }
    
    public ArrayList<Nomina> leeTodo() throws Exception{
    File file=new File("nominas");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        nominas=(ArrayList<Nomina>)ois.readObject();
        return nominas;
    }
    
    public Nomina buscarPorId(int id)throws Exception{
        Nomina n=new Nomina();
        nominas = leeTodo();
        n=nominas.get(id);
        return n;
    }
    
}
