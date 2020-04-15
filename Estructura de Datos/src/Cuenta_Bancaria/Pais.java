
package Cuenta_Bancaria;
public class Pais implements Medible{
    private  String nombreDelPais;
    private double superficie;

    public Pais(String pais, double superficie) {
        this.nombreDelPais = pais;
        this.superficie = superficie;
    }
    
     
    @Override
    public double obtenerMedida() {
        return superficie;
    }
    
    public String toString(){
        return "\nPaís: "+"\n\tNombre del país: "+this.nombreDelPais+"\n\tSuperficie:"+this.superficie;
    }

    
}