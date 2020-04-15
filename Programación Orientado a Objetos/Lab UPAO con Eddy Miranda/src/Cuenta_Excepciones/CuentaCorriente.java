package Cuenta_Excepciones;

public class CuentaCorriente extends Cuenta {

    private float TasaDeComision;

    public CuentaCorriente(float TasaDeComision, int numeroDeCuenta, float saldo, Titular titular) {
        super(numeroDeCuenta, saldo, titular);
        this.TasaDeComision = TasaDeComision;
    }

    public float getSaldoInicial() {
        return saldo;
    }

    public float deposito(float cantidad) {

        return saldo = saldo + cantidad;
    }

    //En el metodo retiro se genera la excepcion
    public float retiro(float cantidad) throws IllegalArgumentException {
        if (cantidad < saldo) // La cantidad de retiro tiene que ser mejor que el saldo
        {
            saldo = saldo - cantidad;
        } else {
            throw new IllegalArgumentException("EL MONTO A RETIRAR NO PUEDE SER MAYOR QUE EL SALDO DISPONIBLE");
        }

        return saldo;
    }

    public float getTasaInteres() {
        return TasaDeComision;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public float getSaldo(float saldO) {
        saldO = saldo * TasaDeComision;
        return saldo - saldO;

    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CUENTA CORRIENTE:\n" + "Saldo inicial:" + getSaldoInicial()
                + "\nSaldo Restante: " + getSaldo(0) + "\nTasa de Comision:" + TasaDeComision + "\n" + super.toString();
    }

}
