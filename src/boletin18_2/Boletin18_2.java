/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import pedirDatos.PedirDatos;

/**
 *
 * @author ceque
 */
public class Boletin18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos m=new Metodos();
       m.crearArrays();
        int b=1;
       do {
       System.out.println("/***********Menu***********/"
                         + "/1-AMOSAR NOTA MEDIA       /"
                         + "/2-AMOSAR NOTA MAS ALTA    /"
                         + "/3-AMOSAR NUMERO APROBADOS /"
                         + "/4-AMOSAR ALUMNOS APROBADOS/"
                         + "/5-ORDENAR POR NOTAS       /"
                         + "/6-BUSCAR POR NOMBRE       /"
                         + "/7-SAIR                    /"
                         + "/**************************/");
       int a=PedirDatos.pedirInt();
       switch(a){        
           case 1:m.amosarMedia();break; 
           case 2:m.amosarNotaMasAlta();break;
           case 3:m.amosarSuspensos();break;
           case 4:m.amosarAlumnosAprobados();break;
           case 5:m.ordenarPorNotas();break;
           case 6:m.buscarPorNombre();break;
           case 7:b=0;break;
        }
       }while(b!=0);
    }
}
