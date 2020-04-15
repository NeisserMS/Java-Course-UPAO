
package EjericicioArray;

public class ArrayQueue <T> implements QueueADT<T> {
    
    private final int DEFAULT_CAPACITY = 100;
    private int count;
    private T[] queue; 
    
    public ArrayQueue(){
        count = 0;
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    public ArrayQueue (int initialCapacity){
        count = 0;
        queue = (T[])(new Object[initialCapacity]);
    }
    private void expandCapacity( ){
        T[ ] larger = (T[ ]) (new Object[queue.length*2]);
        for (int index=0; index < queue.length; index++)
            larger[index] = queue[index];
        queue = larger;
    } 

    public void enqueue(T element) {
        if (size() == queue.length)
            expandCapacity( );
       queue[count] = element;
       count++;
    }

    public T dequeue() {
        T result = queue[0];
        count--;
        for (int i = 0; i < count; i++)
            queue[i] = queue[i+1];
        queue[count] = null;
        return result;
    }

    public T first() {
         return queue[count];
    }

    public boolean isEmpty() {
        return (count==0);
    }

    public int size() {
        return count;
    }
        @Override
     public String toString(){
    String result="";
    for (int index=0; index< count; index++)
        result= result + queue[index].toString()+"\n";
    return result;
}

    
}
