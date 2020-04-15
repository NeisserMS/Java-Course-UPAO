package Cliente_ArrayList;

public abstract class Comprobante {

    private char tipo;
    private int numero;
    private Producto produc;
    private Fecha fech;
    private Producto produc2;

    private static int contCompro;

    public Comprobante(char tipo, int numero, Producto produc, Fecha fech, Producto produc2) {
        this.tipo = tipo;
        this.numero = numero;
        this.produc = produc;
        this.fech = fech;
        this.produc2 = produc2;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto getProduc() {
        return produc;
    }

    public void setProduc(Producto produc) {
        this.produc = produc;
    }

    public Fecha getFech() {
        return fech;
    }

    public void setFech(Fecha fech) {
        this.fech = fech;
    }

    public static int getContCompro() {
        return contCompro;
    }

    public static void setContCompro(int contCompro) {
        Comprobante.contCompro = contCompro;
    }

    public Producto getProduc2() {
        return produc2;
    }

    public void setProduc2(Producto produc2) {
        this.produc2 = produc2;
    }

    @Override

    public String toString() {
        return "\nCOMPROBANTE:" + "\nTipo:" + tipo + "\nNumero:" + numero + produc.toString() + produc2.toString() + fech.toString();
    }

}
