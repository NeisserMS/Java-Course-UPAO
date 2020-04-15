package Arboles;

public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name); // Crear un nuevo nodo e inicializarlo 
        if (root == null) { // Si no hay raiz, este se vuelve uno
            root = newNode;
        } else {
            Node focusNode = root; // Establecer la raíz como el nodo que iniciaremos mientras atravesamos el árbol
            Node parent; //Futuro padre de nuestro nodo
            while (true) { //Mientras sea cierto
// La raiz es el padre de todo así que empezaremos desde ahí
                parent = focusNode;
                if (key < focusNode.key) { // Compruebe si el nuevo nodo debe ir en el lado izquierdo del nodo principal
                    focusNode = focusNode.leftChild;// Cambiar el enfoque a la hoja izquierda
                    if (focusNode == null) { // Si el lado izquierdo no tiene hijos
                        parent.leftChild = newNode; // Después coloque el nuevo nodo en el lado izquierdo de la misma
                        return; // Todo hecho
                    }
                } else { // si llegamos aquí, colocar el nodo a la derecha
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) { //Si el lado derecho no tiene hijos
                        parent.rightChild = newNode;// Después coloque el nuevo nodo en el lado derecho de la misma
                        return; // Todo hecho
                    }
                }
            }
        }
    }

    public Node findNode(int key) { //Método para encontrar el nodo 
        Node focusNode = root; //Empezar en el top del árbol
        while (focusNode.key != key) { //Mientras no se haya encontrado el nodo, seguir buscando

            if (key < focusNode.key) { //Si debemos buscar a la izquierda

                focusNode = focusNode.leftChild; //Mover el nodo enfocado al lado izquierdo
            } else {
                focusNode = focusNode.rightChild;//Mover el nodo enfocado al lado derecho
            }
            if (focusNode == null) // El nodo no fue encontrado
            {
                return null;
            }
        }
        return focusNode;
    }
// Todos los nodos son visitados en orden ascendente
// El recorrido es usado para ir de un nodo a otro y luego ir a sus nodos hijos y así.

    public void inOrderTraverseTree(Node focusNode) { //método para recorrer el árbol en orden
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild); // Atraviesa el nodo izquiero - Hoja
            System.out.println(focusNode); //Visita el actual nodo enfocado - Raiz
            inOrderTraverseTree(focusNode.rightChild);//Atravesar el nodo derecho - Hoja
        }
    }

    public void preorderTraverseTree(Node focusNode) { //método para recorrer el árbol en preorden
        if (focusNode != null) {
            System.out.println(focusNode); //Raiz
            preorderTraverseTree(focusNode.leftChild); //hola (izquierda)
            preorderTraverseTree(focusNode.rightChild);//hoja derecha
        }
    }

    public void postOrderTraverseTree(Node focusNode) { //método para recorrer el árbol en posorden
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild); //HOja (izquierda
            postOrderTraverseTree(focusNode.rightChild);//Hoja derecha
            System.out.println(focusNode); //Raiz
        }
    }

}
