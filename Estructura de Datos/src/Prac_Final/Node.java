
package Prac_Final;

public class Node {

    int key; //llave
    String name; //Nombre
    Node leftChild; //nodo hijo izquierdo
    Node rightChild;//nodo hijo derecho

    Node(int key, String name) { //Constructor
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}