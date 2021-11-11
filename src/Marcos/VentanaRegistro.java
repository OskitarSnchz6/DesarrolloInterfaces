package Marcos;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaRegistro {
	public static void main (String []args)	{
		
	Ventana vRegistro = new Ventana();
	
	vRegistro.setSize(400, 300);
	vRegistro.setVisible(true);
	vRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

public class Ventana extends JFrame{
	public void Registro()	{
	
	 setTitle("Añadir usuario");
	// Panel de fecha
	 JPanel pF = new JPanel();
	 pF.setLayout(new FlowLayout());
	 pF.add(new JTextField(2));
	 pF.add(new JLabel("/"));
	 pF.add(new JTextField(2));
	 pF.add(new JLabel("/"));
	 pF.add(new JTextField(2));
	 // Panel de datos
	 JPanel pd = new JPanel();
	 GridLayout gl = new GridLayout(3,2,0,5);
	 pd.setLayout(gl);
	 pd.add(new JLabel("Nombre:"));
	 pd.add(new JTextField(10));
	 pd.add(new JLabel("DNI:"));
	 pd.add(new JTextField(9));
	 pd.add(new JLabel("Fecha de nacimiento: "));
	 pd.add(pF);
	 
	// Panel de botones
	 JPanel pb = new JPanel();
	 pb.setLayout(new FlowLayout());
	 pb.add(new JButton("Aceptar"));
	 pb.add(new JButton("Cancelar"));

	 Container cp = getContentPane();
	 cp.add(pd, BorderLayout.CENTER);
	 cp.add(pb, BorderLayout.SOUTH);
	}
}