package Cliente_ArrayList;

public class Factura extends Comprobante {

    private float total;
    private ClienteJuridico clienJuridico;

    public Factura(float total, ClienteJuridico clienJuridico, char tipo, int numero, Producto produc, Fecha fech, Producto produc2) {
        super(tipo, numero, produc, fech, produc2);
        this.total = total;
        this.clienJuridico = clienJuridico;
    }

    public ClienteJuridico getClienJuridico() {
        return clienJuridico;
    }

    public void setClienJuridico(ClienteJuridico clienJuridico) {
        this.clienJuridico = clienJuridico;
    }

    @Override
    public String toString() {
        return "\n********FACTURA********" + "\nTotal:" + total + clienJuridico.toString() + super.toString();
    }
}
