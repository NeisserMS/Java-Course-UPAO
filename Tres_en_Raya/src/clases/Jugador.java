
package clases;

class Jugador {
	 
	 private char color;
	 
	 public Jugador(char color) {
		 this.color=color;
	 }

	public void poner(Tablero tablero) {
		(new GestorIO()).out("Juega: " + color);//INSTANCIACION DE CLASE (SE CREA OBJETO) DE LA CLASE GESTORIO SIN CREACION DE REFERENCIA
		Coordenada destino=new Coordenada();
		do {
			destino.recoger("Coordenada destino de movimiento");
		}while(!destino.valida() || tablero.ocupado(destino));
		tablero.poner(destino,color);
	}

	public void victoria() {
		
	}

	public void mover(Tablero tablero) {
		Coordenada origen=new Coordenada();
		do {
			origen.recoger("Coordenada origen de movimiento");	
		}while(origen.valida() || tablero.vacio());
		tablero.sacar(origen);
		this.poner(tablero);
		
	}
}
