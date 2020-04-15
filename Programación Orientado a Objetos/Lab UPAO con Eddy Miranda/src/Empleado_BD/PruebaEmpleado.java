package Empleado_BD;

public class PruebaEmpleado {

    public static void main(String[] args) {
        System.out.println("\n\nHecho por Neisser Moreno Sanchez o*//");
        System.out.println("\nBIENVENIDOS AL SISTEMA DE PLANILLA!:");
        System.out.println("");

        BaseDatosEmpleado oP = new BaseDatosEmpleado();

        Identidad I1 = new Identidad("Neisser", "Moreno", "70369866");
        Identidad I2 = new Identidad("Victor", "Pantoja", "70369866");
        Identidad I3 = new Identidad("Vivian", "Remuzgo", "7036256");

        Direccion D1 = new Direccion("Tumi", "Trujillo", "La libertad", "466982");
        Direccion D2 = new Direccion("Larco", "Trujillo", "La libertad", "888982");
        Direccion D3 = new Direccion("Pucalpa", "Trujillo", "La libertad", "888982");

        EmpleadoAsalariado As1 = new EmpleadoAsalariado(111.50F, 10.5F, D1, I1);
        EmpleadoPorHora Eph = new EmpleadoPorHora(2, 8.50F, D2, I2);
        EmpleadoDestajo EdT = new EmpleadoDestajo(5, 10.6F, D3, I3);

        System.out.println("---Datos del Empleado Asalariado---:" + I1 + "\nDIRECCION: " + D1);
        System.out.println(As1.toString());
        System.out.println("Su Ganancia es:" + As1.obtenerGanancias());
        System.out.println("");

        System.out.println("---Datos del Empleado Por Hora---:" + I2 + "\nDIRECCION: " + D2);
        System.out.println(Eph.toString());
        System.out.println("Su Ganancia es:" + Eph.obtenerGanancias());
        System.out.println("");

        System.out.println("---Datos del Empleado Destajo:---" + I3 + "\nDIRECCION: " + D3);
        System.out.println(EdT.toString());
        System.out.println("Su Ganancia es:" + EdT.obtenerGanancias());
        System.out.println("");

        oP.agregarEmpleado(As1);
        oP.agregarEmpleado(EdT);
        oP.agregarEmpleado(Eph);

        oP.mostrarLista();

    }
}
