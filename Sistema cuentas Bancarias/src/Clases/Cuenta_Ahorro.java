package Clases;

public class Cuenta_Ahorro extends Cuenta {

    private float tasaInteres;

    public Cuenta_Ahorro(float tasaInteres, int nro_cuenta, float saldo, Titular titular) {
        super(nro_cuenta, saldo, titular);
        this.tasaInteres = tasaInteres;
    }

    public float deposito(float monto) {
        return saldo = saldo + monto;
    }

    public float retiro(float monto) {
        return saldo = saldo - monto;
    }

    public float getTasaInteres() {
        return saldo = saldo * tasaInteres;
    }

    @Override
    public String toString() {
        return "\nCuenta de Ahorro: " + "\nTasa de Interes: " + tasaInteres + "\nSaldo: " + getTasaInteres() + super.toString();
    }

}
