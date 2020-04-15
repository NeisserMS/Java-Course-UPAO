/*
Elabore un programa que lea 2 números enteros positivos y que muestre la suma y la multiplicación de estos
 */
package Clases;
import java.util.Scanner;

public class Ejercico19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 10;
        int numero2 = 8;
        int suma = 0;
        int multiplicacion = 0;
        System.out.println("Ingrese el primer número positivo: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número positivo: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        multiplicacion = numero1 * numero2;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " +suma);
         System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " +multiplicacion );
        
        
    }
    
}
