

package EjericicioArray;

public interface QueueADT<T> {

    public void enqueue(T element); //Agrega un elemento en la parte posterior de la cola

    public T dequeue(); //Elimina un elemento al frente de la cola

    public T first(); //Examina el elemento de al frente de la cola

    public boolean isEmpty(); //Determina si la cola esta vacia, si no tiene elementos.

    public int size(); //Determina el número de elementos en la cola

    @Override
    public String toString(); //Devuelve en cadena los atributos
}
