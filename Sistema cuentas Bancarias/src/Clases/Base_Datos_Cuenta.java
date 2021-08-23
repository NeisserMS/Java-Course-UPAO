package Clases;

public class Base_Datos_Cuenta {

    private Cuenta cuentas[];
    private int nro_cuentas;

    public Base_Datos_Cuenta() {
        cuentas = new Cuenta[20];
        this.nro_cuentas = 0;
    }

    public void agregarCuenta(Cuenta Oc) {
        if (nro_cuentas < 20) {
            cuentas[nro_cuentas] = Oc;
            nro_cuentas++;

        }
    }

    public void mostrarCuenta() {
        for (int i = 0; i < nro_cuentas; i++) {
            System.out.println(cuentas[i]);
        }

        System.out.println("\nLa cantidad de cuentas creaas son: " + nro_cuentas);
    }


}
