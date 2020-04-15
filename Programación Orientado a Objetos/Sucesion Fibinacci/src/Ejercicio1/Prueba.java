
package Ejercicio1;

public class Prueba {

    public static void main(String[] args) {
        
        int i=0,a=0, b=1, c=0;
        System.out.println("Serie con For");
        for(i =0; i<10; i++){
            if(i<9){
                System.out.print(a+",");
                c = a +b;
                a = b;
                 b = c;
                
            } else{
                System.out.print(a);
            }
            
        }
                }
        // TODO code application logic here(
    
    
}
