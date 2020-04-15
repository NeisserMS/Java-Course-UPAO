
package Empleado_BD;

public class EmpleadoDestajo extends Empleado {
    
    private int numerodeItems;
    private float pagoItems;

    public EmpleadoDestajo(int numerodeItems, float pagoItems, Direccion direc, Identidad iden) {
        super(direc, iden);
        this.numerodeItems = numerodeItems;
        this.pagoItems = pagoItems;
    }

    @Override
    public float obtenerGanancias(){
        
        return numerodeItems*pagoItems;
    }

    @Override
    public String toString() {
        return "\nNumero de Items:" + numerodeItems + "\nPago por Items:" + pagoItems ;
    }
}

