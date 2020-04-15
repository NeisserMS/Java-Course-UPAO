
package LinkedStack;
  public class LinearNode<E> {

        private LinearNode<E> next;
        private E element;

        public LinearNode() {
            next = null;
            element = null;
        }

        public LinearNode(E elem) {
            next = null;
            element = elem;
        }

     
        public LinearNode<E> getNext() {
            return next;
        }

      
        public void setNext(LinearNode<E> node) {
            next = node;
        }

        public E getElement() {
            return element;
        }

       
        public void setElement(E elem) {
            element = elem;
        }
    }
