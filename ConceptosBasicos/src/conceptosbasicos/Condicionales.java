/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import java.util.Scanner;

/**
 *
 * @author JDK
 */
public class Condicionales {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        System.out.println( "Calculadora de propinas" );
        System.out.println( "Ingresa la cantidad a pagar" );
        double cantidad = entrada.nextDouble();
        System.out.println( "Ingresa el % de propina" );
        int porcentaje = entrada.nextInt();
        
        if( porcentaje < 15 ){
            
            System.out.println( "Servicio no fue muy bueno" );
        }
        else if( 15 <= porcentaje && porcentaje < 30 ){
            
            System.out.println( "Servicio fue muy bueno" );
        }
        else{
            
            System.out.println( "Servicio fue excelente" );
        }
        
        double total = cantidad + ( cantidad * porcentaje / 100 );
        
        System.out.printf( "El total es: %.1f \n", total );
    }
}