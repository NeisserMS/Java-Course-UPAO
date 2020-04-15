
package Pilas;

public class Prueba {

   
    public static void main(String[] args) {
        
      Mi_Pila Pila = new Mi_Pila(10);
      
      Pila.push(20);
      Pila.push(40);
      Pila.push(60);
      Pila.push(80);
      
      while(!Pila.isEmpty()){
          long value = Pila.pop();
          System.out.println(value);
          System.out.println("");
      }
        System.out.println("");
        
    }
        
      
    
}
