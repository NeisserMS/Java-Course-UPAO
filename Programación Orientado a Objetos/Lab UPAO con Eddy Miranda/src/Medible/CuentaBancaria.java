
package Medible;

public class CuentaBancaria implements Medible {
    private String titular;
    private double saldo;
    

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double ObtenerMedida(){
        
        return saldo;
        
    }

    @Override
    public String toString() {
        return "\nCuenta Bancaria:" + "\nTitular:" + titular + "\nSaldo:" + saldo;
    }
}

