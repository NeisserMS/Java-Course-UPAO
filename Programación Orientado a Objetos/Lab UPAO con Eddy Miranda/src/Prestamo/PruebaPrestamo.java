package Prestamo;

public class PruebaPrestamo {

    public static void main(String[] args) {
        BaseDatosPrestamo oB = new BaseDatosPrestamo();

        Identidad I1 = new Identidad("Neisser", 'A', "Moreno Sanchez");
        Identidad I2 = new Identidad("Ana", 'M', "Caballero Caballero");

        Direccion D1 = new Direccion("Pasaje Tumi", "Trujillo", "La lIbertad", "51236489");
        Direccion D2 = new Direccion("Las Tunas", "Trujillo", "La lIbertad", "53002355");

        Prestamo P1 = new Prestamo(0.79, 5, 200, 1000);
        Prestamo P2 = new Prestamo(0.90, 3, 500, 8000);

        Prestador oP1 = new Prestador(P1, D1, I1);
        Prestador oP2 = new Prestador(P2, D2, I2);

        oB.agregarPrestador(oP1);
        oB.agregarPrestador(oP2);

        oB.mostrarPrestador();

    }

}
