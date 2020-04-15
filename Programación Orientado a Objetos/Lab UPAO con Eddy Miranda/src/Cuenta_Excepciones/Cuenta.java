package Cuenta_Excepciones;

public abstract class Cuenta {

    protected int numeroDeCuenta;
    protected float saldo;
    protected Titular titular;

    public Cuenta(int numeroDeCuenta, float saldo, Titular titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public abstract float deposito(float cantidad);

    public abstract float retiro(float cantidad);

    public abstract float getSaldo(float saldO);

    @Override

    public String toString() {
        return "Numero de cuenta:" + numeroDeCuenta + "\nTITULAR:" + titular;
    }
}
