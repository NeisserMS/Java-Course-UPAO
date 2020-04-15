
package Cliente_ArrayList;
public class Boleta extends Comprobante{
        
        private float total;
        private ClienteNatural clieNatu;

    public Boleta(float total, ClienteNatural clieNatu, char tipo, int numero, Producto produc, Fecha fech, Producto produc2) {
        super(tipo, numero, produc, fech, produc2);
        this.total = total;
        this.clieNatu = clieNatu;
    }
    
    public ClienteNatural getClieNatu() {
        return clieNatu;
    }

    public void setClieNatu(ClienteNatural clieNatu) {
        this.clieNatu = clieNatu;
    }


    @Override
    public String toString() {
        return "\n*********BOLETA*********" + "\nTotal:" + total +  clieNatu.toString() + super.toString();
    }         
}

