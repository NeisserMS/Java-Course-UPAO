package Empleado;

public class EmpleadoDestajo extends Empleado {

    private int numerodeItems;
    private float pagoItems;

    public EmpleadoDestajo(int numerodeItems, float pagoItems, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.numerodeItems = numerodeItems;
        this.pagoItems = pagoItems;
    }

    @Override
    public float obtenerGanancias() {

        return numerodeItems * pagoItems;
    }

    @Override
    public String toString() {
        return "\n----EmpleadoDestajo----" + "\nNúmero de Items: " + numerodeItems + "\nPago Items: " + pagoItems;
    }
}
