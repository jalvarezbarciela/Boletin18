/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol18_1;

/**
 *
 * @author ceque
 */
public class Metodos {
    int [] numeros=new int [6];
    
    public void crearArrays(){
        for(int i=0;i<numeros.length;i++)
            numeros[i]=(int)(Math.random()*50+1);
    } 
   public void amosar(){
        for(int i=0;i<=numeros.length-1;i++){
          System.out.println(numeros[i]);
       }
        
   }
    public void amosarReves(){
        for(int b=numeros.length-1;b>=0;b--){
            System.out.println(numeros[b]);
        }
    }
}
