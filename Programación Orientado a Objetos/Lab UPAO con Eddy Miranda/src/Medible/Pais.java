package Medible;

public class Pais implements Medible {

    private String pais;
    private double superficie;

    public Pais(String pais, double superficie) {
        this.pais = pais;
        this.superficie = superficie;
    }

    public double ObtenerMedida() {
        return superficie;
    }

    @Override
    public String toString() {
        return "\nPais:" + pais + "\nSuperficie:" + superficie;
    }

}
