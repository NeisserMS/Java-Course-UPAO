
package Clases;

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        
       
        Scanner entrada = new Scanner(System.in);
        double ancho = 0, largo = 0, area = 0 , arena = 0 ,a = 0.5;
    
   
        System.out.println("Ingrese el ancho de la Pared: ");
        ancho = entrada.nextInt();
        System.out.println("Ingrese el alto de la Pared: ");
        largo = entrada.nextInt();
      
        area = largo*ancho;
        
        System.out.println("El area de la pared en metros es: " + area);
        
        arena =  area*Math.pow(a, 3);
        System.out.println("Los metros cubicos de arena son: " + arena);
   
    }
    
}
