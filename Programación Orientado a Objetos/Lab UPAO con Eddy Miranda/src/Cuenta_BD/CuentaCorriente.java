
package Cuenta_BD;

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
        
       return saldo=saldo+cantidad; 
    }

    
    public float retiro(float cantidad) {
        if(cantidad<saldo)
       saldo=saldo-cantidad;
        return saldo;
    }

    public float getTasaInteres() {
        return TasaDeComision;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public float getSaldo(float saldO) {
         saldO = saldo*TasaDeComision;
         return saldo-saldO;
        
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CUENTA CORRIENTE:\n" + "Saldo inicial:" +getSaldoInicial()+ 
                "\nSaldo Restante: "+getSaldo(0)+"\nTasa de Comision:" + TasaDeComision+ "\n"+super.toString();
    }
    
 
}