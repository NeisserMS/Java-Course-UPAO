package Queue;

class Queue1 {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
//--------------------------------------------------------------

    public Queue1(int s) // constructor y creamos s
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//--------------------------------------------------------------

    public void insert(long j) // insertamos un elemento
    {
        if (rear == maxSize - 1) // 
        {
            rear = -1;
        }
        queArray[++rear] = j; // un preincremento en rear y lo guardamos en j
        nItems++; // nItems se incrementa de 1 en 1
    }
//--------------------------------------------------------------

    public long dequeue() // Pone el elmento encima de la cola
    {
        long temp = queArray[front++]; // Creamos temps y incrementa front
        if (front == maxSize) // Comparamos 
        {
            front = 0;
        }
        nItems--; // se decrementa de 1 en 1
        return temp;
    }
//--------------------------------------------------------------

    public long first() // Examina el elemento que esta en frente de la cola
    {
        return queArray[front];
    }
//--------------------------------------------------------------

    public boolean isEmpty() // Metodo para ver si la cola esta vacia
    {
        return (nItems == 0);
    }
//--------------------------------------------------------------

    public boolean isFull() // // Si la cola esta llena
    {
        return (nItems == maxSize);
    }
//--------------------------------------------------------------

    public int size() // Para ver el tamaño de la pila
    {
        return nItems;
    }
//--------------------------------------------------------------

    public String toString() {
        return "Queue{" + "maxSize=" + maxSize + ", queArray=" + queArray + ", front=" + front + ", rear=" + rear + ", nItems=" + nItems + '}';
    }

}
