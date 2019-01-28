/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
pedir tre numero por pantalla y decir cual de los tres es el mayor
 */
package tallerprogramacion.tallerJava;

import java.util.Scanner;

/**
 *
 * @author IDSAS
 */
public class NumeroMayor {
    
    public static void main(String [] arg){
        NumeroMayor clase = new NumeroMayor();
        
        Scanner entrada = new Scanner(System.in);
        
        int n1,n2,n3;
        
        //pido datos de entrada a el sistema
        System.out.print("ingrese un numero : ");
        n1= entrada.nextInt();
        System.out.print("ingrese un numero : ");
        n2= entrada.nextInt();
        System.out.print("ingrese un numero : ");
        n3= entrada.nextInt();
        
        clase.numeroEsMayor(n1, n2, n3);
        //realizamos las comparaciones
        
    }
    
    public void numeroEsMayor(int numero1 ,int numero2, int numero3){
        
        if(numero1>numero2 && numero1>numero3){ System.out.print("en numero ," +numero1+" es el mayor"); }
        
        if(numero2>numero1 && numero2>numero3){ System.out.print("en numero ," +numero2+" es el mayor"); }
        
        if(numero3>numero1 && numero3>numero2){ System.out.print("en numero ," +numero3+" es el mayor"); }  
    }
    
     // public void numeroEsMayor(int numero1 ,int numero2, int numero3){
     //   if(numero1>numero2 && numero1>numero3){ 
     //       System.out.print("en numero ," +numero1+" es el mayor"); 
     //   }else if(numero2>numero1 && numero2>numero3){
     //       System.out.print("en numero ," +numero1+" es el mayor"); 
     //   }else if(numero3>numero1 && numero3>numero2){ 
     //       System.out.print("en numero ," +numero1+" es el mayor"); 
    //    }   
   // }
    
}
