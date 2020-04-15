
package Prestamo;

public class Prestamo {
    private double tasaIntAnual;
    private int numAnios;
    private double cantidadPrestada;
    private double montoP;

    public Prestamo(double tasaIntAnual, int numAnios, double cantidadPrestada, double montoP) {
        this.tasaIntAnual = tasaIntAnual;
        this.numAnios = numAnios;
        this.cantidadPrestada = cantidadPrestada;
        this.montoP = montoP;
    }
  

    public double getTasaIntAnual() {
        return tasaIntAnual;
    }

    public void setTasaIntAnual(double tasaIntAnual) {
        this.tasaIntAnual = tasaIntAnual;
    }

  
    public int getNumAnios() {
        return numAnios = numAnios;
    }

    public void setNumAnios(int numAnios) {
        this.numAnios = numAnios;
    }

    public double getCantidadPrestada() {
        return cantidadPrestada;
    }

    public void setCantidadPrestada(double cantidadPrestada) {
        this.cantidadPrestada = cantidadPrestada;
    }
    
    public double getpagoMensual(double monto){
        double pMensual;
        pMensual = (montoP + (montoP*tasaIntAnual*numAnios)) / 12;
        
        return pMensual;
    }
    public double getpagoTotal(double monto){
        double pTotal;
        pTotal = (montoP+(montoP*tasaIntAnual*numAnios));
        
        return  pTotal;
        
    }

    @Override
    public String toString() {
        return  "\nTasa Interes Anual: " + tasaIntAnual + "\nNumero de Años: " + numAnios + "\nCantidad Prestada: " + cantidadPrestada;
    }
    
}