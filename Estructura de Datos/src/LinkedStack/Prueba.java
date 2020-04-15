package LinkedStack;

public class Prueba {

    public static void main(String[] args) {

        LinkedStack <Integer> linked1 = new LinkedStack<>();

        System.out.println("Contenido de la Pila: ");
        for (int i = 9; i >= 0; i--) {

            linked1.push(i);
            System.out.println(i);

        }

        System.out.println("Numero de elementos existentes: " + linked1.size());
        System.out.println("El entero encima de la Pila es: " + linked1.peek());

    }
}
