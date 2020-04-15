/*
 17.	Convertir una distancia en metros a pies y pulgadas.
 */
package Clases;
import java.util.Scanner;
public class Ejercicio17 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        
        float distancia = 0;
        float pies = (float) 0.3048;
        float pulgadas = (float) 0.0254;
        float metros = 0;
        
        System.out.println("Ingrese la distancia en metros: ");
        distancia = entrada.nextInt();
        
        pies = (float) (distancia*(  3.28/1));
        pulgadas = (float) (distancia* (39.37/1));
        System.out.println("La distancia " + distancia + "\nEn pies es: "  + pies + "\nEn pulgadas es: "+ pulgadas);
   
    }

    
    
}
