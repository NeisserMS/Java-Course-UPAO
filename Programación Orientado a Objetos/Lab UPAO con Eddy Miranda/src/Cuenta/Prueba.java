package Cuenta;

public class Prueba {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta(100, 5, 12);
        Cuenta c2 = new Cuenta(200, 15, 6);
        Cuenta c3 = new Cuenta(100, 4, 22);


        c1.Deposito(100);
        c1.Retiro(50);
        c1.Deposito(200);
        System.out.println("Cuenta 1: " + c1.toString());

        c2.Deposito(200);
        c2.Retiro(60);
        c2.Deposito(100);
        c2.Deposito(100);
        System.out.println("Cuenta 2: " + c2.toString());

        c3.Deposito(300);
        c3.Retiro(100);
        System.out.println("Cuenta 3: " + c3.toString());

       


    }

}
