
package arreglos;
import java.util.Scanner;

public class Matrices {
    
    public static void main(String[] args) {
        int fil = 0, col = 0, contador = 1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantas filas desea ingresar? ");
        fil = entrada.nextInt();
        System.out.println("Cuantas columnas desea ingresar? ");
        col = entrada.nextInt();
        
        int numero [] [] = new int [fil] [col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j <col; j++) {
                numero[i][j] = contador;
                contador++;
                System.out.print("[" + numero[i][j]+ "]");
                
                
            }
            System.out.println("");
        }

        
        
        

        
        
    }

    
    
}
