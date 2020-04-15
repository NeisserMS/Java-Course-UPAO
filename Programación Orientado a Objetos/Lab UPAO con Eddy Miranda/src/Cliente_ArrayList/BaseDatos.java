package Cliente_ArrayList;

import java.util.ArrayList;

public class BaseDatos {

    //Declaramos la colección
    ArrayList<Comprobante> comprobantes;
    static int cantComprobantes;

    //Constructor
    public BaseDatos() {
        //Crear Coleccion
        comprobantes = new ArrayList<Comprobante>();
        cantComprobantes++;
    }

    //Metodos que trabajen con la Coleccion
    public void agregarComprobante(Comprobante oC) {
        comprobantes.add(oC);
        cantComprobantes++;
    }

    public void mostrarLista() {
        for (Comprobante oC : comprobantes) {
            System.out.println(oC.toString());
            System.out.println("\n");

        }
        System.out.println("Cant. de Comprobantes:" + cantComprobantes);
    }
}
