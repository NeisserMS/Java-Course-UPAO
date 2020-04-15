package Arboles;

public class Arbol_binario {

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();  //Se crea el árbol
        theTree.addNode(50, "Boss"); //Se añade la Llave y el jefe
        theTree.addNode(25, "Vice President");//Se añade la Llave y el vicepresidente
        theTree.addNode(15, "Office Manager"); //Se añade la Lllave y el gerente de oficina
        theTree.addNode(30, "Secretary"); //Se añade la Llave y Secretari
        theTree.addNode(75, "Sales Manager");//Se añade la Llave y gerente de ventas
        theTree.addNode(85, "Salesman 1"); //Se añade la Llave y el vendedor;
// Diferentes maneras de recorrer los árboles binarios
        System.out.println("En orden");
        theTree.inOrderTraverseTree(theTree.root); //En orden
        System.out.println("\nEn preorden");
        theTree.preorderTraverseTree(theTree.root);//Preorden
        System.out.println("\nEn posorden");
        theTree.postOrderTraverseTree(theTree.root);//Posorden
// Encuantra el nodo con el llave 75
        System.out.println("\nNode with the key 75");
        System.out.println(theTree.findNode(75));
    }
}
