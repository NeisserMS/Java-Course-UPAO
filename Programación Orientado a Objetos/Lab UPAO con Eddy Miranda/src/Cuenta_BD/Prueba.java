package Cuenta_BD;

public class Prueba {

    public static void main(String[] args) {

        BaseDatosCuenta oC = new BaseDatosCuenta();

        System.out.println("--BIENVENIDO AL SISTEMA DE CUENTAS BANCARIAS--");
        System.out.println("");

        Titular oT1 = new Titular("Neisser", "Moreno", "70369866");
        Cuenta oCa1 = new CuentadeAhorro(0.12f, 456324, 105.0f, oT1);

        Titular oT2 = new Titular("Vivian", "Remuzgo", "70659845");
        Cuenta oCc1 = new CuentaCorriente(0.15f, 20203040, 110.00f, oT2);

        oC.AgregarCuenta(oCa1);
        oC.AgregarCuenta(oCc1);

        oCa1.deposito(2000);
        oCc1.deposito(1500.00F);
        oCc1.retiro(900.0F);

        oC.MostrarCuenta();

        System.out.println("By: Neisser Sanchez");

    }

}
