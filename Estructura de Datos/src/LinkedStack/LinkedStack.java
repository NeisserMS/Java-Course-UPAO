
package LinkedStack;

public class LinkedStack<T> implements StackADT<T> {

    private LinearNode<T> top;
    private int link;

    public LinkedStack() {
        link = 0; 
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return link == 0;
    }

    @Override
    public int size() {
        return link;
    }

    @Override
    public void push(T element) {
        LinearNode<T> T1 = new LinearNode<>(element);
        T1.setNext(top);
        top = T1;
        link++;
    }

    @Override
    public T pop() {
        T resultado = top.getElement();
        top = top.getNext();
        link--;
        return resultado;

    }

    @Override
    public T peek() {
        return top.getElement();
    }

    @Override
    public String toString() {
        String result = "";
        LinearNode<T> LN1 = top;
        while(LN1!=null){
        result = result + LN1.getElement() + "\n";
        LN1 = LN1.getNext();
        
        }
        return result;
        
    }
   

}