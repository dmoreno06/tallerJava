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
public class nominaSencilla {
    
    public static void main(String [] arg){
        
        nominaSencilla clase = new nominaSencilla();
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        double salarioM;
        double salarioB; 
        int horasT,valorH;
        
            
        System.out.print("ingrese un Nombre : ");
            nombre=entrada.next();
        System.out.print("ingrese horas Trabajadas : ");
            horasT=entrada.nextInt();
        System.out.print("ingrese el valor de la Hora : ");
            valorH=entrada.nextInt();
        System.out.print("ingrese el valor del Salario basico : ");
            salarioB=entrada.nextInt();
        
         salarioM = clase.calcularNomina(horasT,valorH);
        if( salarioM > salarioB ){
            System.out.println("Nombre: "+nombre);
            System.out.println("Salario Mensual "+ salarioM);
        }else{
            System.out.println("Nombre: "+nombre);
        }
        
    }
    public int calcularNomina(int hora, int valor){
         
        int totalH = valor*hora;
        return totalH;       
    }
    
}
