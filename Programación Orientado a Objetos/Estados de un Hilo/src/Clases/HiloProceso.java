
package Clases;

public class HiloProceso extends Thread{
    
@Override    
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "" + getName());
            
           try{
               
            HiloProceso.sleep(1000);
            
           }catch(InterruptedException e){
               System.out.println(" " + e);
           }
        }
    }
}

/* TAmbien se puede aqui, para controlar como queremos que se ejecute 

*/