
package clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class Calculadora {

		public static void main(String[] args) {
			// TODO Auto-generated method stub		
			
		MarcoMultiple calculadora=new MarcoMultiple();
		
		calculadora.setVisible(true);
		
		calculadora.setBounds(600, 200, 450, 300);
		
		calculadora.setTitle("Calculadora");
		
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		
}

class MarcoMultiple extends JFrame{
	
	public MarcoMultiple(){
		
	LaminaBotonCero lamina1=new LaminaBotonCero();
	
	add(lamina1);	
	
	
	}			
	
}


			
class LaminaBotonCero extends JPanel{
	
	public LaminaBotonCero(){
		
		sincero=true;		
		
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		
		add(pantalla, BorderLayout.NORTH);
		
		pantalla.setEnabled(false);
		
		laminaBotones=new JPanel();
		
		add(laminaBotones,BorderLayout.CENTER);
		
		laminaBotones.setLayout(new GridLayout(4,4));
		
		InsertaNumero insertar=new InsertaNumero();
		
		AccionOrden orden=new AccionOrden();
		
		Ponerboton("7",insertar);
		
		Ponerboton("8",insertar);

		Ponerboton("9",insertar);
		
		Ponerboton("/", orden);

		Ponerboton("4",insertar);

		Ponerboton("5",insertar);

		Ponerboton("6",insertar);
		
		Ponerboton("*", orden);

		Ponerboton("1",insertar);

		Ponerboton("2",insertar);

		Ponerboton("3",insertar);
		
		Ponerboton("-",orden);
		
		Ponerboton("0",insertar);
		
		Ponerboton(".",insertar);
		
		Ponerboton("=",orden);

		Ponerboton("+",orden);
		
		ultimaOperacion="=";

		
	}
	
	public void Ponerboton(String numero, ActionListener oyente){
		
		JButton restoBotones=new JButton(numero);
		
		laminaBotones.add(restoBotones); //Agrega los botones a la lamina
		
		restoBotones.addActionListener(oyente); //Pone los botones a la escucha
		
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(sincero){
				
				pantalla.setText("");
			}
			
			sincero=false;
			
			String entrada=e.getActionCommand(); // getActionCommand: CAPURA LA ACCION DEL COMANDO ASOCIADO, EN ESTE CASO EL NUMERO DEL BOTON PRESIONADO
			
			pantalla.setText(pantalla.getText() + entrada);
			
		}
		
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub			
			

			String operacion=e.getActionCommand();			
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion; // Esta linea hace que se pueda comparar el en metodo calcular las operaciones matematicas		
			
			sincero=true; //BORRA EL CONTENIDO DE LA PANTALLA		

			}	
		
		
		public void calcular(double x){ // El metodo calcular va dentro de la clase AccionOrden pues es parte de las operaciones matematicas realizadas (el mas, menos, dividir y multiplicar)
			
			if(ultimaOperacion.equals("+")){
				
				resultado+=x;
				
				//System.out.println(resultado);	

				
			}
			
			if(ultimaOperacion.equals("=")){
				
				resultado=x;
			
				
			}
			
			else if(ultimaOperacion.equals("-")){
				
				resultado-=x;
				
			}
			
			else if(ultimaOperacion.equals("*")){
				
				resultado*=x;
				
			}
			
			else if(ultimaOperacion.equals("/")){
				
				resultado/=x;
				
			}
			
			pantalla.setText(" " + resultado);
			
		}
		
		}	
	
	private String ultimaOperacion;	

	private JPanel laminaBotones;
	
	private JButton pantalla;
	
	private boolean sincero;
	
	private double resultado;
		
}

