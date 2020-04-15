
package Cuenta_BD;
public class Titular {
    protected String nombre;
    protected String apellido;
    protected String dni;

    public Titular(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = DNI;
    }

    @Override
    public String toString() {
        return   "\nNombre:" + nombre + "\nApellido:" + apellido + "\nDNI:" + dni ;
    }
  
}