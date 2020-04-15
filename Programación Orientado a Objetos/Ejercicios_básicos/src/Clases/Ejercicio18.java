/*
 18.	Elevar al cubo un número
 */
package Clases;

import java.util.Scanner;
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero  = 0, cubo = 0;
        
        System.out.println("Ingrese el numero que se elevará al cubo");
        numero = entrada.nextInt();
        
        cubo =  (int) Math.pow(numero, 3);
        
        System.out.println("El resultado es: " + cubo);
        
        
        
        
    }
    
}
