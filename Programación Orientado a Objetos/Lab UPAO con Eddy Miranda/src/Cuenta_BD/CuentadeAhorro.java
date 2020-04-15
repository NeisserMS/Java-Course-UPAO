package Cuenta_BD;

public class CuentadeAhorro extends Cuenta {

    private float TasaInteres;

    public CuentadeAhorro(float TasaInteres, int numeroDeCuenta, float saldo, Titular titular) {
        super(numeroDeCuenta, saldo, titular);
        this.TasaInteres = TasaInteres;
    }

    public float getSaldoInicial() {
        return saldo;
    }

    public float deposito(float cantidad) {

        return saldo = saldo + cantidad;
    }

    public float retiro(float cantidad) {
        if (cantidad < saldo) {
            saldo = saldo - cantidad;
        }
        return saldo;
    }

    public float getTasaInteres() {
        return TasaInteres;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public float getSaldo(float saldO) {
        saldO = saldo * TasaInteres;
        return saldo - saldO;

    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CUENTA DE AHORRO:\n" + "Saldo Inicial:" + getSaldoInicial() + "\nSaldo Restante: " + getSaldo(0)
                + "\nTasaInteres:" + TasaInteres + "\n" + super.toString();
    }
}
