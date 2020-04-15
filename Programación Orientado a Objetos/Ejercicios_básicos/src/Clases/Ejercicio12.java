
package Clases;

import java.util.Scanner;

public class Ejercicio12 {
     

    public static void main(String[] args) {
        
        /* Obtener la edad de una persona en meses, si se ingresa su edad en años y meses.
        Ejemplo: Ingresado 3 años 4 meses debe mostrar 40 meses. 
        
        */
         
        int A = 0, M = 0, T = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de años: ");
        A = entrada.nextInt();
        System.out.println("Ingrese el numero de Meses: ");
        M = entrada.nextInt();
        
        
        T = A * 12 + M;
        System.out.println("Su edad en meses es: " + T);
    
        
        
    }
    
}
