
package Arbol;
public class Node<T> {

    T value; //Dato
    Node<T> left; //nodo hijo izquierdo
    Node<T> right;//nodo hijo derecho

    public Node(T value) { //Constructor
        this.value = value;

    }

    void visit() {
        System.out.print(this.value + ",");
    }
}
