
/* 11.	Leer tres números enteros de un Digito y almacenarlos en una sola variable 
que contenga a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562. */

package Clases;
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
       
        int A =5;
        int B=6;
        int C= 2;
        String  x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        A = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        B = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        C = entrada.nextInt();
        
        String s = Integer.toString(A);
        String t = Integer.toString(B);
        String o = Integer.toString(C);
        
        x = (String)s+t+o;
        
        System.out.println("Los 3 son: " + x);
          
 
    }
    
}
