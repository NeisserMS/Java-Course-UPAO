
package Prac_Final;
public class Prueba {
    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();  //Se crea el árbol
        
        theTree.addNode(58, "-");
        theTree.addNode(29, "/");
        theTree.addNode(20, "*");
        theTree.addNode(11, "+");              
        theTree.addNode(7, "3"); 
        theTree.addNode(15, "1"); 
        theTree.addNode(24, "3");
        theTree.addNode(48, "+");
        theTree.addNode(39, "-");
        theTree.addNode(35, "9");
        theTree.addNode(43, "5");
        theTree.addNode(52, "2");
        theTree.addNode(87, "+");
        theTree.addNode(68, "*");
        theTree.addNode(64, "3");
        theTree.addNode(77, "-");        
        theTree.addNode(73, "7");
        theTree.addNode(81, "4");
        theTree.addNode(91, "6");
        
        System.out.print("En InOrder: ");
        theTree.inOrderTraverseTree(theTree.root); //En orden
        double resultado=3+1*3/9-5+2-3*7-4+6;
        System.out.print("\nLa solucion es:"+ resultado);
        
        System.out.print("\nEn preorden: ");
        theTree.preorderTraverseTree(theTree.root);//Preorden
        
        System.out.print("\nEn postorden: ");
        theTree.postOrderTraverseTree(theTree.root);//Postorden
        
        
       
    }
    
}
