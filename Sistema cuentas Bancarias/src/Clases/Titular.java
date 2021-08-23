package Clases;

public class Titular {

    private String nombre;
    private String apellido;
    private int dni;

    public Titular(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni;
    }

}
