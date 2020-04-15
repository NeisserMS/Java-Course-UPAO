package Empleado_BD;

public class EmpleadoAsalariado extends Empleado {

    private float salario;
    private float tasaDescuento;

    public EmpleadoAsalariado(float salario, float tasaDescuento, Direccion direc, Identidad iden) {
        super(direc, iden);
        this.salario = salario;
        this.tasaDescuento = tasaDescuento;
    }

    @Override

    public float obtenerGanancias() {
        return salario - tasaDescuento;
    }

    @Override
    public String toString() {
        return "\nSalario:" + salario + "\nTasa de Descuento:" + tasaDescuento;
    }

}
