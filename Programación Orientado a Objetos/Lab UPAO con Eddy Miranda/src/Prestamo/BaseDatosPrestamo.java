package Prestamo;

public class BaseDatosPrestamo {

    protected Prestador prestadores[];

    private int cantPrest;

    BaseDatosPrestamo() {
        prestadores = new Prestador[20];
        cantPrest = 0;
    }

    public void agregarPrestador(Prestador oP) {
        if (cantPrest < 20) {
            prestadores[cantPrest] = oP;
            cantPrest++;
        }
    }

    public void mostrarPrestador() {
        for (int i = 0; i < cantPrest; i++) {
            System.out.println("PRESTADOR: " + cantPrest);
            System.out.println(prestadores[i]);
            System.out.print("\n");
        }
    }

}
