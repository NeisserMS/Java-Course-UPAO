
package Clases;

import java.io.*;

public class OtroArbol {
    public static void main(String []args )throws IOException{
        int value; // se crea variable lde tipo entero llamado value
        Tree theTree =new Tree(); // se crea el objeto arbol
        theTree.insert(50,1.5); // Se hacen las insercciones
        theTree.insert(25,1.2);
        theTree.insert(75,1.7);
        theTree.insert(12,1.5);
        theTree.insert(37,1.2);
        theTree.insert(43,1.7);
        theTree.insert(30,1.5);
        theTree.insert(33,1.2);
        theTree.insert(87,1.7);
        theTree.insert(93,1.5);
        theTree.insert(97,1.5);
        
        while (true){ // bucle, mientras sea verdadero
            System.out.print("Ingrese la primera letra de mostrar : "); // muestra por pantalla el contenido
            System.out.print("insertar, hallar, borrar o recorrer :  "); // muestra por pantalla el contenido
            int choice = getChar();
            switch(choice){ // Es el menú de opciones
                case 'm':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Ingrese el valor a Insertar: ");
                    value = getInt();
                    theTree.insert(value, value+0.9);
                    break;
                case 'h':
                    System.out.println("Ingrese el valor Buscado: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if(found!=null){
                        System.out.print("hallado");
                        found.displayNode();
                        System.out.print("\n");
                    }
                    else
                        System.out.print("No se pudo encontrar!");
                    System.out.print(value+'\n');
                    break;
                case 'b':
                    System.out.println("Ingrese un valor para borrar: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if(didDelete)
                        System.out.print("borrado!" + value + '\n');
                    else
                        System.out.print("no se pudo borrar! :c ");
                    System.out.print(value+'\n');
                    break;
                case 'r':
                    System.out.println("Ingrese 1, para recorrido Preorder \n");
                    System.out.println("Ingrese 2, para recorrido Inorder \n");
                    System.out.println("Ingrese 3, para recorrido Posorder \n");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.print("Opción Invalida\n");
            }//fin de las opciones
        }//fin del bucle while
    }//fin del mein
    public static String getString()throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar()throws IOException{
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt()throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
