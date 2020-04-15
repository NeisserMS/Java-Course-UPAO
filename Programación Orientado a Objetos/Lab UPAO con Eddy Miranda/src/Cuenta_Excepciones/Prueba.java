package Cuenta_Excepciones;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        BaseDatosCuenta oC = new BaseDatosCuenta();

        System.out.println("--BIENVENIDO AL SISTEMA DE CUENTAS BANCARIAS--");
        System.out.println("");

        ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();

        try {

            Titular oT1 = new Titular("Neisser", "Moreno", "70369866");
            Titular oT2 = new Titular("Vivian", "Remuzgo", "70659845");

            Cuenta oCa1 = new CuentaAhorro(0.12f, 456324, 105.0f, oT1);
            Cuenta oCc1 = new CuentaCorriente(0.15f, 20203040, 330.00f, oT2);

            oC.AgregarCuenta(oCc1);
            oC.AgregarCuenta(oCa1);

            //Operaciones
            oCa1.deposito(2000);
            oCc1.deposito(1500.00F);
            //Estoy haciendo un retiro de 9900 cuando el saldo es 330.00, lo que genera la excepcion
            oCc1.retiro(9900.00F);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex);

        }

        oC.MostrarCuenta();
    }

}
