
package EjericicioArray;

public class TicketCounter {

    final static int PROCESS=120;  //variable final, 120.
    final static int MAX_CASHIERS=10; //máximo de cajeros 10
    final static int NUM_CUSTOMERS=100; //Número de clientes 100 //Variables finales, no cambian
    
    public static void main(String[] args) {  
        
        Customer customer;  //Se declara una variable customer de tipo Customer
        ArrayQueue<Customer> customerQueue = new ArrayQueue<Customer>();  //Se crea a los objetos de tipo Customer
        int[]cashierTime = new int[MAX_CASHIERS]; //Se crea el tiempo de los cajeros y se le da un valor maximo por defecto
        int totalTime, averageTime,departs;  //Se crea dos variables de tipo entero
        
        for(int cashiers=0;cashiers<MAX_CASHIERS;cashiers++){  //Bucle for 
            for(int count=0;count<cashiers;count ++ )           //Cambia los tiempos de los cajeros a 0
                cashierTime[count]=0;
            
            for(int count =1;count<=NUM_CUSTOMERS;count++)      //recorre la cola de clientes  
                customerQueue.enqueue(new Customer(count*15));  
            totalTime=0;
            
            while(!(customerQueue.isEmpty())){                  // Revisamos si la cola esta vacia
                for(int count=0;count<=cashiers;count++){        //Recorre la lista de cajeros 
                 if((!(customerQueue.isEmpty()))){               //condición si no está vacío la cola de clientes
                     customer=customerQueue.dequeue();           // Se quita o elimina un elemento del frente
                     if(customer.getArrivalTime()>cashierTime[count]) //Si el tiempo de llegada el cliente es mayor al del cajero
                         departs=customer.getArrivalTime()+PROCESS; //El tiempo de salida es igual al tiempo de llega del cliente +el proceso
                     else
                         departs=cashierTime[count]+PROCESS;  //El tiempo de salida es el tiempo que demora en el cajero +el proceso
                     customer.setDepartureTimer(departs);  //El cliente cambia su tiempo de salida
                     cashierTime[count]=departs;            
                     totalTime+=customer.totalTime();
                 }   
                }
            }
            //Retorna los resultados
            averageTime = totalTime/NUM_CUSTOMERS;
            System.out.println("Número de cajeros: "+(cashiers+1));
            System.out.println("Tiempo promedio : "+averageTime+"\n");           
        }    
    }
}
        
        
        
        
        
        
        
    
    

