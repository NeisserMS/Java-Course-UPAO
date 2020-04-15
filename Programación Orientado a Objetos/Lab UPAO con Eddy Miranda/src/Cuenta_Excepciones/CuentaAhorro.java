package Cuenta_Excepciones;

public class CuentaAhorro extends Cuenta {

    private float TasaInteres;

    public CuentaAhorro(float TasaInteres, int numeroDeCuenta, float saldo, Titular titular) {
        super(numeroDeCuenta, saldo, titular);
        this.TasaInteres = TasaInteres;
    }

    public float getSaldoInicial() {

        return saldo;
    }

    public float deposito(float cantidad) {

        return saldo = saldo + cantidad;
    }

    //En el metodo retiro se genera la excepcion
    public float retiro(float cantidad) throws IllegalArgumentException {
        if (cantidad < saldo) // La cantidad de retiro tiene que ser menor que el saldo
        {
            saldo = saldo - cantidad;
        } else {
            throw new IllegalArgumentException("EL MONTO A RETIRAR NO PUEDE SER MAYOR QUE EL SALDO DISPONIBLE");
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

    @Override
    public String toString() {
        return "CUENTA DE AHORRO:\n" + "Saldo Inicial:" + getSaldoInicial() + "\nSaldo Restante: " + getSaldo(0)
                + "\nTasaInteres:" + TasaInteres + "\n" + super.toString();
    }
}
