
package Mi_Pila;

public class Prueba {

    public static void main(String[] args) {
     
      Pila laPila = new Pila(10);
        laPila.push(20);
        laPila.push(40);
        laPila.push(60);
        laPila.push(80);
        
        while(!laPila.isEmpty()){
            long value = laPila.pop();
            System.out.println(value);
            System.out.println("");
        }
        System.out.println("");
   
    }
    
}
