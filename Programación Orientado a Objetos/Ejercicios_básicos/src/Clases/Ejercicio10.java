
package Clases;

public class Ejercicio10 {
    /*
    10.	Leer dos números y encontrar:
        -La suma del doble del primero mas el cuadrado del segundo. 
	-El promedio de sus cubos
    */
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int suma = 0, promedio = 0;
        int producto = 0;
        suma = (int)(2*a + Math.pow(b,2));
        promedio = (int) (Math.pow(a, 3) + Math.pow(b,3))/2;
        
        
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        
        
        
        
        
       /* Datos de entrada: A, B
Datos De Salida: S, P
Modelo Matemático :	
S = 2A + B²
P = (A³ + B³) 2 */
       
    }
    
}
