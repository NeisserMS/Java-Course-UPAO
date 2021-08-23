
package Clases;

public abstract class Cuenta {
    
    private int nro_cuenta;
    protected float saldo;
    private Titular titular;
    
    public Cuenta(int nro_cuenta, float saldo, Titular titular){
        this.nro_cuenta = nro_cuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public abstract float deposito(float monto);
    public abstract float retiro(float monto);
    
    public String toString(){
        return "\nNumero de cuenta: " + nro_cuenta + "\nTitular: " + titular;
    }
    
}


