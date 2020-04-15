package Empleado_BD;

public class BaseDatosEmpleado {

    protected Empleado empleados[];
    static int cantEmpleados;

    public BaseDatosEmpleado() {

        empleados = new Empleado[10];
        cantEmpleados = 0;
    }

    public void agregarEmpleado(Empleado Eo) {
        if (cantEmpleados < 10) {
            empleados[cantEmpleados] = Eo;
            cantEmpleados++;
        }
    }

    public void mostrarLista() {
        for (int i = 0; i < cantEmpleados; i++) {
            System.out.println("Cant. de Empleados:" + cantEmpleados);
            System.out.println(empleados[i]);
            System.out.println("\n");

        }

    }

}
