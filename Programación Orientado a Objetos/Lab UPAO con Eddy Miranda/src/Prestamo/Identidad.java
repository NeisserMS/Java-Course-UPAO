package Prestamo;

public class Identidad {

    private String nombre;
    private char inicSegunNomb;
    private String apellido;

    public Identidad(String nombre, char inicSegunNomb, String apellido) {
        this.nombre = nombre;
        this.inicSegunNomb = inicSegunNomb;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public char getInicSegunNomb() {
        return inicSegunNomb;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + nombre + "\nInicial Segundo Nombre: " + inicSegunNomb + "\nApellido: " + apellido;
    }

}
