/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion.tallerJava;

import java.util.Scanner;

/**
 *
 * @author IDSAS
 */
public class OrdenacionDeTresNumeros {
    
    public static void main(String [] arg){
        
        OrdenacionDeTresNumeros clase = new OrdenacionDeTresNumeros();
        
        Scanner entrada = new Scanner(System.in);
        
        int n1,n2,n3;
        
        //pido datos de entrada a el sistema
        System.out.print("ingrese primer : ");
        n1= entrada.nextInt();
        System.out.print("ingrese segundo : ");
        n2= entrada.nextInt();
        System.out.print("ingrese tercero : ");
        n3= entrada.nextInt();
        
        clase.ordenarNumeros(n1, n2, n3);
    }
    
    public void ordenarNumeros(int numero1 ,int numero2, int numero3){
        
        if(numero1>numero2 && numero1>numero3)
            { 
                System.out.println("en numero ," + numero1 + " es el mayor");
                
                if(numero2>numero3){
                    System.out.println("en numero ," + numero2 + " es el del medio");
                    
                    System.out.println("en numero ," + numero3 + " es el ultimo"); 
                }else{
                    System.out.println("en numero ," + numero3 + " es el del medio");
                    
                    System.out.println("en numero ," + numero2 + " es el ultimo"); 
                }
            }else if(numero2>numero1 && numero2>numero3)
            { 
                System.out.println("en numero ," + numero2 + " es el mayor");
                
                if(numero1>numero3){
                    System.out.println("en numero ," + numero1 + " es el del medio");
                    
                    System.out.println("en numero ," + numero3 + " es el ultimo"); 
                }else{
                    System.out.println("en numero ," + numero3 + " es el del medio");
                    
                    System.out.println("en numero ," + numero1 + " es el ultimo"); 
                }
            }else if(numero3>numero1 && numero3>numero1)
            { 
                System.out.println("en numero ," + numero3 + " es el mayor");
                
                if(numero1>numero2){
                    System.out.println("en numero ," + numero1 + " es el del medio");
                    
                    System.out.println("en numero ," + numero2 + " es el ultimo"); 
                }else{
                    System.out.println("en numero ," + numero2 + " es el del medio");
                    
                    System.out.println("en numero ," + numero1 + " es el ultimo"); 
                }
            }
        
    }
}
