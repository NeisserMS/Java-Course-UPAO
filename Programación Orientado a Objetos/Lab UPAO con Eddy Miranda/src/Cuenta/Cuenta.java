package Cuenta;

public class Cuenta {

    //Atributos
    private double saldo;
    private int numDeTransacciones;
    private float TasaDeInteresAnual;
    private int NumeroDeMeses;
    private int NumDeCuentasCreadas;

    //Constructor
    public Cuenta(double saldo, float TasaDeInteresAnual, int NumeroDeMeses ) {

        this.saldo = saldo;
        this.TasaDeInteresAnual = TasaDeInteresAnual;
        this.NumeroDeMeses = NumeroDeMeses;
        NumDeCuentasCreadas++;
    }

    public Cuenta() {
    }
    

    //Metodos
    public void Deposito(int monto) {
        saldo = saldo + monto;
        numDeTransacciones++;
    }

    public void Retiro(int monto) {
        saldo = saldo - monto;
        numDeTransacciones++;

    }

    public double ObtenerSaldo() {
        return saldo + saldo * TasaDeInteresAnual / 100 * NumeroDeMeses / 12;

    }

    public int NumeroDeTransacc() {
        return numDeTransacciones;

    }
    
    public int CuentasCreadas(){
        return NumDeCuentasCreadas;
    }
   
    public String toString() {
        return "\nSaldo: " + saldo + "\nNumero de Transacciones: " + numDeTransacciones + 
                "\nTasa de interes: " + TasaDeInteresAnual + "\nNumero de meses: " + NumeroDeMeses + 
                "\nSaldo obtenido: " + ObtenerSaldo();
               

    }
}
