
package Queue;

public class Queue<T>implements Queue_ADT<T> {
    
    private final int DEFAULT_CAPACITY = 100;
    private int rear;
    private T[] queue; 
    
    public Queue(){
        rear = 0;
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    public Queue (int initialCapacity){
        rear = 0;
        queue = (T[])(new Object[initialCapacity]);
    }
    private void expandCapacity( ){
        T[ ] larger = (T[ ]) (new Object[queue.length*2]);
        System.arraycopy(queue, 0, larger, 0, queue.length);
        queue = larger;
    } 

    @Override
    public void enqueue(T element) {
        if (size() == queue.length)
            expandCapacity( );
       queue[rear] = element;
       rear++;
    }

    @Override
    public T dequeue() {
        T result = queue[0];
        rear--;
        for (int i = 0; i < rear; i++)
            queue[i] = queue[i+1];
        queue[rear] = null;
        return result;
    }

    @Override
    public T first() {
         return queue[rear];
    }

    @Override
    public boolean isEmpty() {
        return (rear==0);
    }

    @Override
    public int size() {
        return rear;
    }

    @Override
    public String toString() {
        return "Queue" + "DEFAULT_CAPACITY=" + DEFAULT_CAPACITY + ", rear=" + rear + ", queue=" + queue + '}';
    }
    
    
    
}
