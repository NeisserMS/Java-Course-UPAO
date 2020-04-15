
package Mi_Pila;

public class Pila {
    private long stackArray[];
    private int maxDim;
    private int top;
    
    public Pila(int s){
        maxDim = s;
        stackArray = new long[maxDim];
        top = -1;
    }
    public void push(long j){
        stackArray[++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxDim -1);
    }
}

    
    
    
  