package Empleado;

public class EmpleadoAsalariado extends Empleado {

    private float salario;
    private float tasaDescuento;

    public EmpleadoAsalariado(float salario, float tasaDescuento, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.salario = salario;
        this.tasaDescuento = tasaDescuento;
    }

    @Override

    public float obtenerGanancias() {
        return salario - tasaDescuento;
    }

    @Override
    public String toString() {
        return "\n----EmpleadoAsalariado----" + "\nSalario: " + salario + "\nTasa de Descuento: " + tasaDescuento;
    }

}
