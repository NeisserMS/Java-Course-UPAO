
package Clases;

public class ClasePrincipal {

    
    public static void main(String[] args) {
        
        HiloProceso hilo1 = new HiloProceso();
        HiloProceso hilo2 = new HiloProceso();
        
        hilo1.start();
        try{
        hilo1.sleep(1000); // esta en milisegundos 1000 = 1 seg.
        
        }catch(InterruptedException e){
            System.out.println("Error en el hilo1 " + e);
        }
        hilo2.start();
        hilo2.stop();
        
        try{
            
            hilo1.sleep(1000);
            
        } catch ( InterruptedException e){
            System.out.println("Error en el hilo2: " + e);
            
        }
        
        
    }
          
    
}
