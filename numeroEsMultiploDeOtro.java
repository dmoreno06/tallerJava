package tallerprogramacion.tallerJava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

prueva de escritorio 
    numero:45
    multiplo:3
    
    resultado:es multiplo

    numero:123
    multiplo:7
    
    resultado:no es multiplo


 */


import java.util.Scanner;

/**
 *
 * @author IDSAS
 */
public class numeroEsMultiploDeOtro {
    
    public static void main(String [] arg) {
        
        numeroEsMultiploDeOtro clase = new numeroEsMultiploDeOtro();
         Scanner entrada = new Scanner(System.in);
         
         int n,m;
         //pido datos de entrada a el sistema
        System.out.print("ingrese numero : ");
        n= entrada.nextInt();
        System.out.print("ingrese multiplo : ");
        m= entrada.nextInt();
         
         clase.multiplo(n, m);
        
        
    }
    public void multiplo(int numero, int multiplo){
        if((numero%multiplo) == 0){
            System.out.println("el numero, " + multiplo + " es multiplo de "+numero );
        }else{
            System.out.println("el numero "+numero+" no es multipo de "+ multiplo);
        }
    }
}
 