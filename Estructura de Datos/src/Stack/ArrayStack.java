
package Stack;
import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

public class ArrayStack implements StackADT<Integer> {

    private int stackArray[];
    private int top;

    public ArrayStack() {
        top = 0;
        stackArray = (new int[DEFAULT_CAPACITY]);
    }

    public void push(Integer j) {
        stackArray[top] = j;
        top++;
    }

    public Integer pop() {
        return stackArray[top];
    }

    public Integer peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        top--;
        return (top == -1);
    }

    public int size() {
        return top;
    }

    
    

}
