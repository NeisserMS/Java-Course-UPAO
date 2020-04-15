package Cliente_ArrayList;

public class Prueba {

    public static void main(String[] args) {

        BaseDatos oC = new BaseDatos();

        System.out.println("\nBIENVENIDOS AL SISTEMA!");

        Fecha f1 = new Fecha(20, 11, 1995);
        Fecha f2 = new Fecha(13, 04, 1997);

        Producto pro1 = new Producto("4562", "Atun", 10.50F);
        Producto pro2 = new Producto("8962", "Cereal", 2.50F);
        Producto pro3 = new Producto("6786", "Galleta", 3.50F);
        Producto pro4 = new Producto("7654", "Gaseosa", 7.50F);

        ClienteJuridico clie1 = new ClienteJuridico("20623252", "Neisser Sánchez", "72577", "Mariela Caballero");
        ClienteNatural clie3 = new ClienteNatural("70369866", "563658", "Victor Pantoja");

        //Agregando objetos al ArrayList
        Comprobante com3 = new Boleta(14.00F, clie3, 'B', 12, pro1, f1, pro3);
        Comprobante com1 = new Factura(10.00F, clie1, 'F', 12, pro2, f2, pro4);

        oC.agregarComprobante(com1);
        oC.agregarComprobante(com3);

        //Mostrar
        oC.mostrarLista();
    }
}
