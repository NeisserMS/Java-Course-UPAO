/*
Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes
*/

package Clases;
import java.util.Scanner;
public class Ejercicio15 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numHombres = 0, numMujeres = 0; 
        int totalAlumnos = 0;
        int porcentajeHombres = 0;
                int porcentajeMujeres = 0;
        System.out.println("Ingrese la cantidad de hombres: ");
        numHombres = entrada.nextInt();
        System.out.println("Ingrese la cantidad de Mujeres: ");
        numMujeres = entrada.nextInt();
        
        totalAlumnos = numHombres + numMujeres;
         porcentajeHombres = numHombres*100/totalAlumnos;
        porcentajeMujeres = numMujeres*100/totalAlumnos;
        
        System.out.println("Porcentaje de hombres: " + porcentajeHombres);
        System.out.println("Porcentaje de Mujeres: " + porcentajeMujeres);
       
    }
    
}
