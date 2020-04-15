/*
20.	Elabore un programa que realice la conversión de cm. a pulgadas.
Donde 1cm = 0.39737 pulgadas.

 */
package Clases;

import java.util.Scanner;

public class Ejercicio20 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float centimetro = 0;
        float pulgada  = 0;
        
        System.out.println("Ingrese el número de Pulgadas: ");
        pulgada = entrada.nextFloat();
        //Aplicando una sencilla regla de 3
        centimetro = (float) (pulgada*0.39737/1);
        
        System.out.println("Las pulgadas del numero " + pulgada + " en centimetros es: " + centimetro);
   
    }
    
}
