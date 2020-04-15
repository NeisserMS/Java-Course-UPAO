
package Clases;

public class Ejercicio9 {

   
    public static void main(String[] args) {
        /*Cuanto dinero más se le descontará a un empleado, considerando que los impuestos que 
        se pagan al estado aumentan del 7% al 13% de su salario.
        */
        float impuesto = 6;
        float salario = 1000;
        float total = 0;
        float total1 = 0;
        
         total = salario-(salario*6/100);
         total1 = salario - total;
         
         System.out.println("Su salario es :" + salario + " y se le descontará el 6% que viene a ser :" + total1);
         System.out.println("Su salio del mes es: " + total);

        
    }
    
}


