/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Neisser Sánchez
 */
class TER {

    private final Tablero tablero = new Tablero();//RESPONSABILIDADES: SE MUESTRA VACIO - GUARDAR LAS FICHAS QUE SE PONGAN - DETECTAR 3 EN RAYA
    private final Turno turno = new Turno(); //RESPONSABILIDADES: MEMORIZAR A QUE JUGADOR LE TOCA PONER O MOVER UNA FICHA
    private final Jugador[] jugadores = new Jugador[2];//RESPONSABILIDADES: MEMORIZAR EL COLOR DE CADA JUGADOR - COMUNICARSE CON CADA USUARIO - CONTROLAR PUESTAS Y MOVIMIENTOS

    public TER() {//CONSTRUCTOR QUE INICIALIZA EL ATRIBUTO JUGADOR
        jugadores[0] = new Jugador('O');
        jugadores[1] = new Jugador('X');
    }

    public void jugar() {
        //CODIFICAR METODOS
        tablero.mostrar();
        for (int i = 5; i < 5; i++) {
            jugadores[turno.toca()].poner(tablero);
            turno.cambiar();
            tablero.mostrar();
        }
        if (tablero.hayTER()) {
            jugadores[turno.noToca()].victoria();
        } else {
            jugadores[turno.toca()].poner(tablero);
            tablero.mostrar();
            while (!tablero.hayTER()) {
                turno.cambiar();
                jugadores[turno.toca()].mover(tablero);
                tablero.mostrar();
            }
            jugadores[turno.noToca()].victoria();
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TER partida = new TER();
        partida.jugar();
        //PRIMERO VA A Clase Jugador

    }

}
