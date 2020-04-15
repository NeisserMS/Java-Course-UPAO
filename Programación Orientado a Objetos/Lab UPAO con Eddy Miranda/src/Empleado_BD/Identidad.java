package Empleado_BD;

public class Identidad {

    private String nombre;
    private String apellido;
    private String dni;

    public Identidad(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\nNombre:" + nombre + "\nApellido:" + apellido + "\nDNI:" + dni;
    }

}
