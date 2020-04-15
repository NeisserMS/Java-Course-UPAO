package Arbol;
import Arbol.BinaryTree.*;
import static Arbol.BinaryTree.traverse;

public class Prueba {
    
    public static void main(String[] args) {
        
        Node<String> Angie = new Node<String>("Angie");
        Node<String> bertha = new Node<String>("Bertha");
        Node<String> Diz = new Node<String>("Diz");
        Node<String> Gaela = new Node<String>("Gaela");
        Node<String> Ely = new Node<String>("Ely");
        Node<String> Carmen = new Node<String>("Carmen");
        Node<String> Fany = new Node<String>("Fany");
        Node<String> Helen = new Node<String>("Helen");
        Node<String> Julia = new Node<String>("Julia");

        Angie.left = bertha;
        Angie.right = Carmen;
        bertha.left = Diz;
        bertha.right = Ely;
        Carmen.left = Fany;
        Diz.left = Gaela;
        Fany.left = Helen;
        Fany.right = Julia;

        
        traverse(Angie, ORDER.Preorder);
        System.out.print("\n");
        traverse(Angie, ORDER.Inorder);
        System.out.print("\n");
        traverse(Angie, ORDER.Postorder);
        System.out.print("\n");
        traverse(Angie, ORDER.Leverorder);
        
    }
}
       
        