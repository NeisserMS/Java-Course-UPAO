
package EjericicioArray;

public class Customer {
    
   
    private int arrivalTime, departureTime;

    public Customer(int arrives) {                     //Constructor de la clase
        arrivalTime = arrives;
        departureTime = 0;
    }

    public int getArrivalTime() {                        //Método para obtener el tiempo promedio 
        return arrivalTime;
    }

    public void setDepartureTimer(int departs) {         //Método para modificar el tiempo de salida
        departureTime = departs;
    }

    public int getDepartureTime() {                      //Método para obtener el tiempo de salida 
        return departureTime;
    }

    public int totalTime() {                             //Método para obtener el tiempo total 
        return departureTime - arrivalTime;
    }
}
  

