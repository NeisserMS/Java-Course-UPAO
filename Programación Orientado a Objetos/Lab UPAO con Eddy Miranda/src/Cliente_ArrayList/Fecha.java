package Cliente_ArrayList;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getFecha() {
        return mes;
    }

    public void setFecha(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    @Override
    public String toString() {
        return "\nFECHA:" + " Dia:" + dia + ",Mes:" + mes + ",Año:" + anio;

    }
}
