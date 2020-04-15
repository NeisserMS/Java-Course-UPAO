
package Listas;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo UltimoValorIngresado;
    int tamaño = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null; //valor de arranque null
        tamaño = 0;
    }
    
    //Metodo para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado ==null; // Que compare si tiene un valor null
    }
    //Metodo para insertar un nodo en la pila
    public void InsentarNodo (int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamaño++;
    }
    
    //Metodo Eliminar un nodo de la pila
    
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamaño--;
        return auxiliar;
        
    }
    
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    //Metodo para conocer el tamaño de la pila
    public int TamañoPila(){
        return tamaño;
    }
    public void VaciarPila(){
        while(!PilaVacia()){ //Mkientras el metodo sea diferente de vacia
            EliminarNodo(); //utiliza el metodo 
        }
    }
    
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido!=null){
            Lista += recorrido.informacion + "\n"; //=+ variable de acumulacion
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista); //Debe de mostrar 
        Lista = ""; //Para limpiar y no acumule
    }
    
}
