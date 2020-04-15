
package Clases;

public class Proceso extends Thread {
    
    int num_int;
    
    //Constructor
    public Proceso(String NombreHilo){
        super(NombreHilo);
        
    }
    
    
    @Override
    public void run(){
        for (int i = 0; i <=num_int; i++) {
            System.out.println(i + this.getName());
            //GetName es para saber el nombre del hilo
        }
        
        System.out.println("");
    
    }
    //Metodo para recibir valor a través de parametros
    public void PasarelValor(int valor){
        this.num_int = valor; // este valor se guarda dentro de valor
        
    }
  }     