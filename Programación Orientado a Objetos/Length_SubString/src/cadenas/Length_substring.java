
package cadenas;

import java.util.Scanner;

public class Length_substring {

    public static void main(String[] args) {
        String cadena_completa = "", cadena_cortada = "";
        int NroCaracteres = 0, desde = 0, hasta = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la cadena de caracteres: ");
        cadena_completa = entrada.nextLine();
        
        NroCaracteres = cadena_completa.length();
        System.out.println("La cadena " + cadena_completa + " posee " + NroCaracteres + " caracteres.");
        
        System.out.println("Desde que numero quiere el recorte de la cadena?");
        desde = entrada.nextInt();
        System.out.println("Hasta que numero quiere el recorte de la cadena?");
        hasta = entrada.nextInt();
        
        cadena_cortada = cadena_completa.substring(desde,hasta);
        System.out.println("La nueva cadena es:" + cadena_cortada);
                 
       }
        
    }
    

