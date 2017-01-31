/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.t01.pkg3;
import java.util.Scanner;
/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCT013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de distancia entre dos puntos");
        
         //Variables.
         double X1, Y1, X2, Y2, oper;
         double fin;
         System.out.println("Solicitar X1 ");
         X1 = teclado.nextDouble();
          System.out.println("Solicitar X2 ");
         X2 = teclado.nextDouble();
         System.out.println("Solicitar Y1 ");
         Y1 = teclado.nextDouble();
         System.out.println("Solicitar Y2 ");
         Y2 = teclado.nextDouble();
         
         //Operación Lógica.
         oper = Math.sqrt(Math.pow((X2-X1),2)-Math.pow((Y2-Y1), 2));
         System.out.println("La distancia es de: " + oper);
         
        // TODO code application logic here
    }
    
}
