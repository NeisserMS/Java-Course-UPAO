package Clases;

import java.util.*;

public class Tree {

    private Node root; // raiz del arbol, es el origen

    public Tree() { // constructor

        root = null; // apunta a null, osea esta vacio, no contiene nada.
    } 


    public Node find(int key) {  //Metodo para encontrar un nodo especifico, para ello necesitamos el dato y viene a ser key.
        Node current = root; // Se crea una variable axuliar llamada current y este apunta a raiz
        while (current.iData != key) { // se crea un bucle, en el cual decimos si current de dato es diferente del dato que estamos buscando, entonces:
            //En un arbol binario las insercciones son de manera ordenado, si es dato es menor que el de raiz es a la izquierda y si es mayor o igual va hacia la derecha
            if (key < current.iData) // Si el dato que estamos buscando es menor que el dato current de dato, entonces este apunta hacia la izquierda.
            {
                current = current.leftChild; //current apunta hacia la izquierda
            } else // de caso contrario, no sea menor
            {
                current = current.rightChild;//apunta hacia el lado derecho
            }
            if (current == null) // nos dice que es igual a null, osea hizo el recorrido y no encontró el dato
            {
                return null; // retorna un null
            }
        }
        return current; // retorna un valor de tipo nodo con toda su información
    }//fin de la busqueda 

    public void insert(int id, double dd) { //metodo para insertar un nodo, para eso necesitamos su dato y el nombre, que viene a ser la variable id y dd
        Node newNode = new Node(); //crea un nuevo nodo
        newNode.iData = id; // decimos que la variable iData apunta a id
        newNode.dData = dd; //decimos que la variable dData apunta a dd
        if (root == null) // Si la raiz apunta a null, osea no contiene ningún nodo, entonces:
        {
            root = newNode; // el nuevo nodo pasa a ser la raiz
        } else 
        {
            Node current = root; //el nodo creado una nodo auxiliar llamada current y apunta a la raiz
            Node parent; // se ha creado un nodo padre, por el momento no apunta a nada
            while (true) //  se crea un bucle y decimos que mientras sea verdadero, entonces pasará lo siguiente:
            {
                parent = current; // el nodo padre apunta a current, en otras palabras apunta también a la raiz
                if (id < current.iData) { // si el dato que insertamos es menor a current(raiz) de dato, entonces:
                    current = current.leftChild; // como es menor apunta hacia la izquierda
                    if (current == null) { // ahora cuando current apunta a null, quiere decir que ya hizo el recorrido y encontró el lugar donde insertar el nodo
                        parent.leftChild = newNode; // se inserta el nuevo nodo y el hijo anterior pasa a ser padre
                        return; // no retorna nada, el return sin valor solo es para finalizar
                    }
                } else  { // En caso contrario el dato que se inserta no es menor, es mayor, entonces:
                    current = current.rightChild; // current apunta a la derecha, hijo derecho
                    if (current == null) { // de la misma manera que el anterior, ya hizo el recorrido y encontró el lugar donde insertar, osea encontró un nodo que no tengas hijos.
                        parent.rightChild = newNode; // se inserta el nuevo nodo a la derecha y el nodo anterior de donde extiende pasa a ser padre.
                        return; // return, solo sirve para finalizar
                    }
                }
            }
        }
    } 

    public boolean delete(int key) { //metodo para eliminar un nodo, para eso necesitamos la llave que viene a ser el dato.
        // (assumes non—empty list) 
        Node current = root; // creanos una variable de tipo nodo llamado current y que apunta a la raiz
        Node parent = root; // creamos uan variable root llamada padre que apunta a la raiz
        boolean isLeftChild = true; // se crea una variable llamada " es hijo izquierdo" de tipo boolean y decimos que es igual a verdadero.
        while (current.iData != key) // se crea un bucle donde decimos que si current de dato es diferente del dato que estamos buscando para eliminar
        {
            parent = current; // padre apunta a current, ambos apuntan a raiz
            if (key < current.iData) //  si el dato que ingresamos es menor que current(raiz) de dato, entonces:
            {
                isLeftChild = true; // es verdadero, ya que apunta hacia hijo izquierdo.
                current = current.leftChild; // apunta hacia el lado izquierdo
            } else // en caso contrario, si el dato es mayor que raiz
            {
                isLeftChild = false; // no es hijo izquierdo, es falso.
                current = current.rightChild; // current apunta hacia el hijo derecho
            }
            if (current == null) // condición de cuando current apunta a null
            {
                return false; // no encontró el dato de hijo izquierdo que queria eliminar.
            }
        } 
     
        if (current.leftChild == null 
                && current.rightChild == null) { //  si current de hijo izquierdo y current de hijo derecho son iguales a null, entonces:
            if (current == root) // current apunta a raiz
            {
                root = null; // raiz apunta a null, esta vacio.
            } else if (isLeftChild) { // condición de si es hijo izquierdo, entonces
                parent.leftChild = null; // padre de hijo izquierdo apunta a null, no hay nada.
            } else // en caso contrario
            {
                parent.rightChild = null; // padre del hijo derecho apunta a nada
            }
        } 
        else if (current.rightChild == null) { //cuando current(raiz) de hijo izquierdo es igual a null entonces:
            if (current == root) { // se hace una condición que diga que current es igual a raiz
                root = current.leftChild; // raiz es igual a current de hijo izquierdo
            } else if (isLeftChild) { // condición de que si es hijo izquierdo
                parent.leftChild = current.leftChild; // padre de hijo izquierdo es igual a current de hijo esquierdo
            } else { // en caso ocntrario
                parent.rightChild = current.leftChild; // padre de hijo derecho es igual a current de hijo izquierdo
            }
        } 
        
        else if (current.leftChild == null) { // condición de que cuando current de hijo izquierdo es igual a null, entonces:
            if (current == root) { // cuando current es igual a raiz
                root = current.rightChild; // raiz apunta a current de hijo derecho
            } else if (isLeftChild) { // condición de si es hijo izquierdo
                parent.leftChild = current.rightChild; // padre de hijo izquierdo es igual  a current de hijo derecho
            } else { // en caso ocntrario
                parent.rightChild = current.rightChild; //padre de hijo derecho es igual a current de hijo derecho
            }
        } else 
        { 
            Node successor = getSuccessor(current); //se crea un succesor de tipo , y conecta al  padre de la corriente al sucesor en su lugar
           
            if (current == root) {  // cuando current es igual a raiz
                root = successor; // entonces la raiz es igual a succesor
            } else if (isLeftChild) { //condición de si es hijo izquierdo
                parent.leftChild = successor; // padre de hijo izquierdo es igual a succesor
            } else  {// en caso contrario
                parent.rightChild = successor; // padre de hijo derecho es igual a succesor
            }
        
            successor.leftChild = current.leftChild; // succedor de hijo izquierdo es igual a current de hijo izquierdo
        } 
        return true; // retorna verdadero, el succesor
    } // fin del metodo eliminar

    private Node getSuccessor(Node delNode) { // metodo para asignar un succesor y necesitamos un parametro de tipo nodo, en este caso llamado delNode
        Node successorParent = delNode; // varible de tipo nodo llamado succesorParent y apunta a delNode.
        Node successor = delNode; // variable de tipo Node llamado succesor que apunta a delNode
        Node current = delNode.rightChild; // variable current de tipo Nodo que apunta a delNode de dato hijo derecho
        while (current != null) // // bucle de cuando current es diferente de null, osea cuando tenga elementos o nodos
        { 
            successorParent = successor; //succesorParent es igual a succesor
            successor = current; // succesor es igual a current
            current = current.leftChild; // apunta al hijo izquierdo
        }
    
        if (successor != delNode.rightChild) //bucle de cuando succesor sea diferente del dato de hijo derecho
        { 
            successorParent.leftChild = successor.rightChild; //succesorParent de dato hijo izquierdo es igual a succesor de dato hijo derecho
            successor.rightChild = delNode.rightChild; //succesor de hijo derecho es igual al parametro delNode de hijo derecho
        }
        return successor; // retorna un succesor

    }

    public void traverse(int traverseType) { // metodo switch 
        switch (traverseType) {
            case 1:
                System.out.print("\n Recorrido Preorder : ");
                preOrder(root); // se hace el recorrido preOrder y para eso necesitamos la raiz
                break; //termina
            case 2:
                System.out.print("\n Recorrido Inorder : ");
                inOrder(root); //se hace el recorrido inOrder y para eso necesitamos la raiz
                break; //termina
            case 3:
                System.out.print("\n Recorrido Postorder : ");
                postOrder(root); // se hace el recorrido postOrder y para eso necesitamos la raiz
                break; //termina
        }
        System.out.println(); //salto de linea
    }
    //los reccoridos son recursivos, en otras palabras nos espeficica como debe de hacerse el proceso
    
    private void preOrder(Node localRoot) { // hacemos el recorrido en preOrder y necesitamos la raiz
        if (localRoot != null) { //cuando la raiz es diferente de null, osea cuando si existen nodos podemos hacer el recorrido
            System.out.print(localRoot.iData + " "); //prmero visitamos el la raiz y nos muestra
            preOrder(localRoot.leftChild); //visita los nodos izquierdo, despues la del lado derecho
            preOrder(localRoot.rightChild); //visita los nodos del lado derecho
        }
    }

    private void inOrder(Node localRoot) { //hacemos el recorrido en inOrder y necesitamos la raiz para hacer el recorrido
        //este metodo no visita hasta agotar la izquierda
        if (localRoot != null) { //cuando la raiz es diferente de null, osea cuando si existen nodos podemos hacer el recorrido
            inOrder(localRoot.leftChild); // No visita hasta agotar todos los nodos izquierdos
            System.out.print(localRoot.iData + " ");  // después visita la raiz y muestar el dato
            inOrder(localRoot.rightChild); // despúees de agotar la izquierda visita la derecha
        }
    }

    private void postOrder(Node localRoot) { // metodo para recorrer en postOrder y necesitamos la raiz de tipo nodo para hacer el recorrido
        if (localRoot != null) { ////cuando la raiz es diferente de null, osea cuando si existen nodos podemos hacer el recorrido
            //Este metodo visita cuando ya se agoto tanto la izquierda como la derecha
            postOrder(localRoot.leftChild); //  visita los nodos del lado izquierdo
            postOrder(localRoot.rightChild);  // visita los nodos del lado derecho
            System.out.print(localRoot.iData + " "); //visita la raiz y muestra el dato

        }
    }

    public void displayTree() { // metodo para monitorear el arbol
        Stack globalStack = new Stack(); // se crea un objeto 
        globalStack.push(root); // el objeto llama al metodo push para insertar la raiz
        int nBlanks = 32; // se crea una variable que tendrá como valor el número 32
        boolean isRowEmpty = false; //  variable que dice si la fila esta vacia, es de tipo boolean y asigna a falso
        System.out.println("......................................."); //salto de linea, solo serviria como un marco
        while (isRowEmpty == false) { //se hace un bucle en al cual se  dice si isRowEmpty(si la fila esta vaci) es igual a falso
            Stack localStack = new Stack(); // se crea un objeto localStack
            isRowEmpty = true; // isRowEmpty es igual a true
            for (int j = 0; j < nBlanks; j++) { //bucle for
                System.out.print(' ');
            }
            while (globalStack.isEmpty() == false) { // bucle donde el objeto llama al metodo isEmpty(esta vacio) y es igual a falso
                
                Node temp = (Node) globalStack.pop(); //se crea una variable de tipo nodo llamado temp y el objeto blobalStack llama al metodo pop(eliminar)
                if (temp != null) { // cuando temp es diferente de null, osea cuando si ahiga elementos
                    System.out.print(temp.iData); // mostramos  a temp y el dato
                    localStack.push(temp.leftChild); // el objeto llama a push para insertar un nodo y al lado izquierdo
                    localStack.push(temp.rightChild); // el objeto llama al metodo push y  inserta temp al lado derecho
                    if (temp.leftChild != null
                            || temp.rightChild != null) { // una condición donde decimos que tem de hijo izquierdo, como también temp de hijo derecho apuntan a null
                        isRowEmpty = false; // 
                    }
                } else {
                    System.out.print("--"); // es un pequeño marco
                    localStack.push(null); //el objeto llama a push para insertar y inserta null
                    localStack.push(null); //el objeto llama a push para insertar y inserta null
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) { //bucle 
                    System.out.print(' ');
                }
            } 
            System.out.println();//salto de linea
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        } 
        System.out.println(".............................."); // marco
    }
}
