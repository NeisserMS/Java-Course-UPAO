package Medible;

public class Prueba {

    public static void main(String[] args) {

        Medible[] cuentas = new Medible[3];
        cuentas[0] = new CuentaBancaria("Neisser", 1000.0);
        cuentas[1] = new CuentaBancaria("Mariela", 2000.0);
        cuentas[2] = new CuentaBancaria("Aracely", 3000.0);
        System.out.println("Saldo promedio de las cuentas:" + promedio(cuentas));

        Medible[] paises = new Medible[3];
        paises[0] = new Pais("Perú", 1.285);
        paises[1] = new Pais("Ecuador", 2.83560);
        paises[2] = new Pais("Chile", 756.102);
        System.out.println("Superficie promedio de los Paises:" + promedio(paises));

    }

    public static double promedio(Medible[] oB) {
        if (oB.length == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < oB.length; i++) {
            suma = suma + oB[i].ObtenerMedida();
        }

        return suma / oB.length;
    }

}
