package Empleado;

public class PruebaEmpleado {

    public static void main(String[] args) {

        EmpleadoAsalariado As1 = new EmpleadoAsalariado(100.50F, 20.50F, "Neisser", "moreno", "70369866");

        EmpleadoPorHora Eph = new EmpleadoPorHora(5, 20.50F, "Vivian", "Remuzgo", "70956458");

        EmpleadoDestajo EdT = new EmpleadoDestajo(10, 20, "Victor", "Pantoja", "70569874");

        System.out.println(As1 + "\nSu ganancias es:" + As1.obtenerGanancias());

        System.out.println(Eph + "\nSu ganancias es:" + Eph.obtenerGanancias());

        System.out.println(EdT + "\nSu ganancias es:" + EdT.obtenerGanancias());

    }

}
