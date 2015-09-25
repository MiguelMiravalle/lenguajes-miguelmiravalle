/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.miguelmiravalle;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso;
    float altura;
    
    
    public Imc(float p, float a){
       peso = p;
       altura = a;
       
        
    }
    
    
    public Imc(){
        peso=78f;
        altura=1.68f;
    }
    
    public Imc(float f){
      //Este codigo no tiene nada que ver con los constructores
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        //reasignamos
        b=(byte)i;
        l=i;
        s=(short)l;
        s=b;
        l=s;
        s=(short)l;
        s=(short)i;
        l=b;
        
    }
    
    public float calcular(){
       
        float resultadoImc=peso/(altura*altura);
        
        
        if (resultadoImc<20) {
            System.out.println(resultadoImc+"Eres anorexico te moriras:");
            if (resultadoImc>20||resultadoImc<26) {
            System.out.println("Estas bien sano:"+resultadoImc);
        
            if (resultadoImc>25||resultadoImc<30) {
            System.out.println("Te pasaste de tamales:"+resultadoImc);
        
            if (resultadoImc>30) {
            System.out.println("Eres un tinaco:"+resultadoImc);
        }
        }
            }
        }
        
        //if (resultadoImc<20) {
         //   System.out.println(resultadoImc+"Eres anorexico te moriras:");
       // } 
        //if (resultadoImc>20||resultadoImc<26) {
        //    System.out.println("Estas bien sano:"+resultadoImc);
       // }
       // if (resultadoImc>25||resultadoImc<30) {
       //     System.out.println("Te pasaste de tamales:"+resultadoImc);
      //  } 
      //  if (resultadoImc>30) {
       //     System.out.println("Eres un tinaco:"+resultadoImc);   
      //  } 
         return resultadoImc;
       
        
        
       
    }
       
       
    
}