package Clases;

public class Prueba {

    public static void main(String[] args) {

        Base_Datos_Cuenta Oc = new Base_Datos_Cuenta();

        System.out.println("BIENVENIDO AL SISTEMA DE CUENTAS BANCARIAS");

        Titular T1 = new Titular("Neisser", "Moreno", 70369866);
        Cuenta Ca1 = new Cuenta_Ahorro(1.2f, 2365423, 100.0f, T1);

        Titular T2 = new Titular("Jair", "Moreno", 70369865);
        Cuenta Cc1 = new Cuenta_Corriente(7.50f, 2365222, 500.0f, T2);

        Oc.agregarCuenta(Ca1);
        Oc.agregarCuenta(Cc1);

        Ca1.deposito(100.0f);
        Ca1.retiro(50.0f);

        Cc1.deposito(200.0f);
        Cc1.retiro(100.0f);

        Oc.mostrarCuenta();

    }

}
