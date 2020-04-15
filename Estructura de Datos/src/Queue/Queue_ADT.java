
package Queue;

public interface Queue_ADT<T> {
    
    
    //Métodos
    public void enqueue (T element);  //Para añadir un elemento del final
    public T dequeue();               //Para quitar un elemento del frente  
    public T first();                 //Para examinar el elemento al inicio de la cola 
    public boolean isEmpty();         //Para verifica si está vacío
    public int size();                //Para determinar el tamaño de la cola
    public String toString();         //Para devolver los datos;
}
  