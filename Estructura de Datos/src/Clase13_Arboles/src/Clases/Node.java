package Clases;

public class Node {

    public int iData; // dato, valor del nodo (la llave)
    public double dData; // dato, vendría a ser el nombre
    public Node leftChild; // Hijo izquierdo
    public Node rightChild; // Hijo derecho

    public void displayNode() // Metodo que mostrará la información del nodo
    {
        System.out.print('{');
        System.out.print(iData);  // muestra el dato o valor del nodo ( la llave)
        System.out.print(",");
        System.out.print(dData); //muestar el dato, el nombre del nodo
        System.out.print("}");
    }
}
