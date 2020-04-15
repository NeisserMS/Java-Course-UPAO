
package Queue;

public class QueueApp {

    public static void main(String[] args) {

        Queue <Integer> theQueue = new Queue(5); // 

        theQueue.enqueue(10);  // Insertamos 4 items en la cola
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);

        theQueue.dequeue(); // Eliminamos 3 datos de la cola, los 3 primeros en entrar
        theQueue.dequeue();
        theQueue.dequeue();

        theQueue.enqueue(50); // Insertamos 4 elementos en la cola
        theQueue.enqueue(60);
        theQueue.enqueue(70);
        theQueue.enqueue(80);

        while (!theQueue.isEmpty()) { // Quitar y mostrar
            long n = theQueue.dequeue();  // todos los elementos de la cola
            System.out.println(n);
            System.out.println(" ");
         
        }
        System.out.println("");
    } //  Finaliza el main

}// Finaliza la clase




