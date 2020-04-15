package Arbol;
import java.util.*;

public class BinaryTree {
    
     static enum ORDER {
		Preorder, Inorder, Postorder, Leverorder
	}

    static <T> void traverse(Node<T> node, ORDER order) {
        if (node == null) {
            return;
        }
        switch (order) {
            case Preorder:
                node.visit();
                traverse(node.left, order);
                traverse(node.right, order);
                break;
            case Inorder:
                traverse(node.left, order);
                node.visit();
                traverse(node.right, order);
                break;
            case Postorder:
                traverse(node.left, order);
                traverse(node.right, order);
                node.visit();
                break;
            case Leverorder:
                Queue<Node<T>> queue = new LinkedList<>();
                queue.add(node);
                while (!queue.isEmpty()) {
                    Node<T> next = queue.remove();
                    next.visit();
                    if (next.left != null) {
                        queue.add(next.left);
                    }
                    if (next.right != null) {
                        queue.add(next.right);
                    }
                }
        }
    }

  

}
