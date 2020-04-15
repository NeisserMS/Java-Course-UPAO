
package arreglos;
import java.util.Scanner;

public class Ejemplo {

    
    public static void main(String[] args) {
       String palabra = "", palabra_Invertida = "";
       int longitud_palabra = 0;
       
       Scanner entrada = new Scanner (System.in);
       
        System.out.print("Ingrese una palabra: ");
        
        palabra = entrada.nextLine();
        
        longitud_palabra = palabra.length();
        
        while(longitud_palabra !=0){
            palabra_Invertida += palabra.substring(longitud_palabra-1, longitud_palabra);
            longitud_palabra--;
        }
        System.out.print("Palabra Invertida: " + palabra_Invertida);
    }
    
}
