package Cliente_ArrayList;

public class ClienteNatural extends Cliente {

    private String numDni;

    public ClienteNatural(String numDni, String codigo, String nombre) {
        super(codigo, nombre);
        this.numDni = numDni;

    }

    public String getNumDni() {
        return numDni;
    }

    public void setNumDni(String numDni) {
        this.numDni = numDni;
    }

    @Override
    public String toString() {
        return "\nCLIENTE NATURAL: " + "\nDNI:" + numDni + super.toString();
    }

}
