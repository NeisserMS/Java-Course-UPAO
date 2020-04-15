package Empleado_BD;

public class EmpleadoPorHora extends Empleado {

    private int numerodeHoras;
    private float pagoHora;

    public EmpleadoPorHora(int numerodeHoras, float pagoHora, Direccion direc, Identidad iden) {
        super(direc, iden);
        this.numerodeHoras = numerodeHoras;
        this.pagoHora = pagoHora;
    }

    @Override
    public float obtenerGanancias() {

        return numerodeHoras * pagoHora;

    }

    @Override
    public String toString() {
        return "\nNumero de Horas:" + numerodeHoras + "\nPago por Hora:" + pagoHora;
    }

}
