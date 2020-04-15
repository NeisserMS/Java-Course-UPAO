
package Empleado;

public class EmpleadoPorHora extends Empleado{
    
    private int numerodeHoras;
    private float pagoHora;

    public EmpleadoPorHora(int numerodeHoras, float pagoHora, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.numerodeHoras = numerodeHoras;
        this.pagoHora = pagoHora;
    }

    @Override
    public  float obtenerGanancias(){
          
 
       return numerodeHoras*pagoHora;
       
       } 

    @Override
    public String toString() {
        return "\n----EmpleadoPorHora----" + "\nNúmero de Horas:" + numerodeHoras + "\nPago por Hora: " + pagoHora ;
    }
   
   
}

