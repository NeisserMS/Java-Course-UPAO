
package lavadora_uno;
import Libreria.Lavadora;
import java.util.Scanner;


public class lavadora_uno {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("POresiona 1 - ropa blanca / 2 - ropa color");
        
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        Lavadora mensajero = new Lavadora(kilos,TipoDeRopa);
        mensajero.CicloFinalizado();
        
    }
    
}
