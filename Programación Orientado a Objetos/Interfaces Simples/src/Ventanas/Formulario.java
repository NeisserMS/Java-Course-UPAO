
package Ventanas;
import javax.swing.*;
import java.awt.event.*;

public class Formulario  extends JFrame implements ActionListener{
    
    private JTextField texField1;
    private JLabel label1;
    private JButton boton1;
    
    public Formulario(){ //Constructor
        setLayout(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Nos permite evitar que el programa una vez cerrado siga ejecutandose.
        
        label1 = new JLabel ("Mensaje: "); //Texto para mostrar
        label1.setBounds(15, 10, 100, 30); //Dimensiones en pixeles
        add(label1); //Indicamos a que componente asignamos el diseño anterior
        
        texField1 = new JTextField(); //
        texField1.setBounds(80, 16, 190, 20); //Dimensiones 
        add(texField1); //Asignamos al componente al que asignamos todo el diseño
        
        
        boton1 = new JButton("Mostrar"); //Lo que muestra el boton
        boton1.setBounds(10, 60, 100, 30); // Dimensiones
        add(boton1);
        boton1.addActionListener(this); //Decimos que vamos a agregar un componente mas adelante 
        
}
    @Override
    //Asignamos el evento al boton
    public void actionPerformed(ActionEvent e){ //
        if(e.getSource()==boton1){ //Estrcutura que reconoce de donde se origina el evento
        String cadena = texField1.getText(); 
        JOptionPane.showMessageDialog(null, cadena); //Que se muestre en pantalla
        
        }
    }
    
    public static void main(String []args){ //Diseño para el JFrame
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true); //Que la interfaz sea visible
        formulario.setLocationRelativeTo(null); //Para que se centre
        
        
    }
    
    
    
    
}
