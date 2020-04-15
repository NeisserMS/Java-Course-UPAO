package Cuenta_Bancaria;

public class CuentaBancaria implements Medible{
    public String nombredelTitular;
    public double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.nombredelTitular = titular;
        this.saldo = saldo;
    }
    public double obtenerMedida(){
        return saldo;
    }
    public String toString() {
        return "\nCuentasBancattrias: " + "\n\ttitular: " + this.nombredelTitular + "\n\tsaldo=" + saldo;
    }
}
