package Empleado_BD;

public abstract class Empleado {

    protected Direccion direc;
    protected Identidad iden;

    public Empleado(Direccion direc, Identidad iden) {
        this.direc = direc;
        this.iden = iden;

    }

    abstract float obtenerGanancias();

    @Override
    public String toString() {

        String mnsj = iden.toString() + direc.toString();

        return mnsj;
    }
}
