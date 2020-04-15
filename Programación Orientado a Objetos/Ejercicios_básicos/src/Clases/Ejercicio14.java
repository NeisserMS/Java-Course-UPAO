/*
14.	Un alumno desea saber cual será su calificación final en la materia de Algoritmos.
Dicha calificación se calcula como el promedio simple de tres exámenes parciales
 */
package Clases;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int parcial1 = 0;
        int parcial2 = 0;
        int parcial3 = 0;
        int promedio = 0;
        System.out.println("Ingresa la nota de su parcial 1: ");
        parcial1 = entrada.nextInt();
        System.out.println("Ingresa la nota de su parcial 2: ");
        parcial2 = entrada.nextInt();
        System.out.println("Ingresa la nota de su parcial 3: ");
        parcial3 = entrada.nextInt();
        
        promedio = (parcial1+parcial2+parcial3)/3;
        
        System.out.println("El promedio final es: " + promedio);
        
       
        
        
    }
    
}
