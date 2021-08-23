
package Clases;


public class Cuenta_Corriente extends Cuenta {
    
    private float tasaComision;
    
    public Cuenta_Corriente(float tasaComision, int nro_cuenta, float saldo, Titular titular){
        super(nro_cuenta, saldo, titular);
        this.tasaComision = tasaComision;
    }
    
    public float deposito (float monto){
        return saldo = saldo + monto;
    }
    
    public float retiro(float monto){
        return saldo = saldo - monto;
}
    public float getComision(){
        return saldo = saldo - tasaComision;
    }
    
    public String toString(){
        return "\nCuenta Corriente " + "\nTasa de Comision: " + tasaComision + "\nSaldo: " + getComision() + super.toString();
    }
}
