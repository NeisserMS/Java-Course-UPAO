
package Stack;

public class Prueba {

    public static void main(String[] args) {

        ArrayStack pila = new ArrayStack();

        pila.push(20);
        pila.push(40);
        pila.push(60);
        pila.push(80);
        pila.push(100);

            System.out.println("El tamaño de la pila es: " + pila.size());

        while (!pila.isEmpty()) {
            int value = (int) pila.pop();
            System.out.print("\n" + value);
            System.out.print(" ");
      
        }

        
    }

}
