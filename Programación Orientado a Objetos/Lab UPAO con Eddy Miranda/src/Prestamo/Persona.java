package Prestamo;

public class Persona {

    Direccion direccion;
    Identidad identidad;

    public Persona(Direccion direccion, Identidad identidad) {
        this.direccion = direccion;
        this.identidad = identidad;
    }

    public Identidad getIdentidad() {
        return identidad;
    }

    public void setIdentidad(Identidad identidad) {
        this.identidad = identidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nDireccion:" + direccion.toString() + "\nIdentidad: " + identidad.toString();
    }
}
