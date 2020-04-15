
package Empleado;

public abstract class  Empleado {
    
    private String nombre;
    private String apellido;
    private String dni;

    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
  abstract float  obtenerGanancias();

    @Override
    public String toString() {
        return "\nEmpleado" + "\nNombre: " + nombre + ", \nApellido: " + apellido + ", \nDni: " + dni  ;
    }   
}
