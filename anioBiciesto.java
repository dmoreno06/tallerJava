/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion.tallerJava;

import java.util.Scanner;

/**
 *(anio/100 == 0) && (anio/400 == 0) || (anio/100 == 0) && (anio/400 == 0
 * @author IDSAS
 */
public class anioBiciesto {
    
    public static void main(String [] arg){
        
        anioBiciesto clase = new anioBiciesto();
        
        Scanner entrada = new Scanner(System.in);
        
        int anios;
        
        System.out.print("ingrese un año: ");
        anios = entrada.nextInt();
        
        clase.biciesto(anios);
     
    }
    public void biciesto(int anio){
        
        if((anio%4 == 0) || (anio%4 == 0 && anio%100 != 0) || (anio%100 == 0 && anio%100 != 4)){
            System.out.println("El año : "+anio+" es biciesto");
        }else{
            System.out.println("El año : "+anio+" no es biciesto");
        }
    }
}
