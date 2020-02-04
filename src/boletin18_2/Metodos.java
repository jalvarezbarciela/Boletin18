/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;
import pedirDatos.PedirDatos;
import Arrays.MetodosArrays;

/**
 *
 * @author ceque
 */
public class Metodos {
    int [] notas=new int [6];
    String [] nombres=new String[6];
    
    
    public void crearArrays(){
        for(int i=0;i<notas.length;i++){
            notas[i]=(int)(Math.random()*10);
            nombres[i]=PedirDatos.pedirString();
        }
    } 
    public void amosarSuspensos(){
        int aprobados=0;
        int suspensos=0;
        for(int i=0;i<notas.length;i++){
            if (notas[i]>=5){
                aprobados++;
            }
            else{
                suspensos++;
            }
        }
        System.out.println("Aprobados="+aprobados+"\n Suspensos"+suspensos);
    }
    public void amosarMedia(){
        int media=0;
        
        for(int i=0;i<notas.length;i++){
                media=media+notas[i];
        }
        System.out.println("A nota media ="+media/notas.length );
    }
    public void amosarNotaMasAlta(){
        int notaAlta=0;
        
        for(int i=0;i<notas.length;i++){
            if (notaAlta<notas[i])    
            notaAlta=notas[i];
            
        }
        System.out.println("A nota mais alta ="+notaAlta );
    }
    public void amosarAlumnosAprobados(){
        
        for(int i=0;i<notas.length;i++){
            if (notas[i]>=5){
                System.out.println("Alumno" + nombres[i]+"\n Nota"+notas[i]);
            }
        }
    }
    public void ordenarPorNotas(){
        int aux;
        String auxNombre;
        for (int i=0;i<notas.length-1;i++){
            for (int j=i+1;j<notas.length;j++){
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                    auxNombre=nombres[i];
                    nombres[i]=nombres[j];
                    nombres[j]=auxNombre;
                }
                
                
            }
        }
    }
    public void buscarPorNombre(){
        int a=MetodosArrays.buscarString(nombres);
        if (a!=-1){
            System.out.println("Nota="+notas[a]);
        }
        
    }
}