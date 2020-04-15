package Cliente_ArrayList;

public class ClienteJuridico extends Cliente {

    private String numRuc;
    private String nombContacto;

    public ClienteJuridico(String numRuc, String nombContacto, String codigo, String nombre) {
        super(codigo, nombre);
        this.numRuc = numRuc;
        this.nombContacto = nombContacto;
    }

    public String getNumRuc() {
        return numRuc;
    }

    public void setNumRuc(String numRuc) {
        this.numRuc = numRuc;
    }

    public String getNombContacto() {
        return nombContacto;
    }

    public void setNombContacto(String nombContacto) {
        this.nombContacto = nombContacto;
    }

    @Override
    public String toString() {
        return "\nCLIENTE JURIDICO: " + "\nRUC:" + numRuc + "\nContacto:" + nombContacto + super.toString();
    }

}
