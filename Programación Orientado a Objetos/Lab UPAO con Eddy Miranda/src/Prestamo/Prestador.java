package Prestamo;

public class Prestador extends Persona {

    Prestamo prestamo;

    public Prestador(Prestamo prestamo, Direccion direccion, Identidad identidad) {
        super(direccion, identidad);
        this.prestamo = prestamo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrestamo: " + prestamo;

    }
}
