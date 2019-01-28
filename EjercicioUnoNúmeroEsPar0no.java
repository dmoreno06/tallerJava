/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion.tallerJava;

import java.util.Scanner;

/**
 *
 * @author IDSAs
 * Numero es par o no.
 */
public class EjercicioUnoNúmeroEsPar0no {
    
    public static void main (String [] arg){
        
        EjercicioUnoNúmeroEsPar0no clase = new EjercicioUnoNúmeroEsPar0no();
        
        Scanner entrada = new Scanner(System.in);
        
         int n1;
       
        System.out.print("ingrese un numero : ");
        n1= entrada.nextInt();
        
        clase.operador(n1);
        
        
    }
    public void operador(int numero){
        if(numero % 2 == 0){
            System.out.println("el numero ,"+ numero +" es par ");
        }else{
            System.out.println("el numero ,"+ numero +" es impar ");
        }
    }
}
