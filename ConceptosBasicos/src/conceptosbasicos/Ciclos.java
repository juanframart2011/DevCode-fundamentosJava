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
public class Ciclos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        System.out.println( "¿Cuantos números quieres procesar?" );
        int cantidad = entrada.nextInt();
        
        System.out.printf( "Ingresa %d datos:  \n", cantidad );
        //el ciclo for
        /*for(int i = 1; i <= cantidad; i++ ){
            System.out.printf( "Dato %d: ", i );
            
            int num = entrada.nextInt();
            int resultado = num * 2;
            
            System.out.printf( "Dato %d procesado: %d \n", i, resultado );
        }*/
        
        int c = 1;
        while( c <= cantidad ){
            
            System.out.printf( "Dato %d: ", c );
            
            int num = entrada.nextInt();
            int resultado = num * 2;
            
            System.out.printf( "Dato %d procesado: %d \n", c, resultado );
            c++;
        }
    }
}