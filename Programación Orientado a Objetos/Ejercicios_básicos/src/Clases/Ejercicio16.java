/*
16.	Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.
*/
 
package Clases;
import java.util.Scanner;
public class Ejercicio16 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float salario_Anterior = 0;
         float nuevo_Salario = 0;
         
         System.out.println("Ingrese el Salario Anterior del obrero: ");
         salario_Anterior = entrada.nextInt();
         
         nuevo_Salario = (float) ((salario_Anterior*0.25) + salario_Anterior);
         System.out.println("Su incremento en su nuevo salario es 25%");
         System.out.println("Su salario nuevo es: " + nuevo_Salario);
        
        
      
        
        
        
    }
    
}
