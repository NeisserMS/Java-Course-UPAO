
package Pilas;

public class Mi_Pila {  
    
    private long stackArray[];
    private int dimMax;
    private int top;
    
    public Mi_Pila(int s){
        dimMax = s;
        stackArray = new long[dimMax];
        top = -1;
        
    }
    
    public void push(int j){
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
        return (top == dimMax);
    }
    
    }