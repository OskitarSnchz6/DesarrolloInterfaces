package Marcos;

import javax.swing.JFrame;
import java.awt.*;

public class CrearVentanaCentrada {

public static void main(String [] args)	{
		
		VentanaCentrada miVentana = new VentanaCentrada();
		
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

		
}


class VentanaCentrada extends JFrame	{	//CONSTRUCTOR
	
	public VentanaCentrada()	{
		this.setTitle("Titulo del marco");	//Titulo Ventana
		setResizable(false);	//Ampliar/minimiza tamaño si/no
		//setBounds(500, 200, 1000, 600);	//Localizacion y tamaño del marco
		//setLocation(500, 200);	//localizacion del marco
		//setSize(1000, 600);	//tamaño del marco
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;	//Anchura de la Ventana
		int altoPantalla = sizePantalla.height;	//Altura de la Ventana
		
		//Centrar la Ventana
		setSize(anchoPantalla/2, altoPantalla/2);		
		setLocation(anchoPantalla/4, altoPantalla/4);	
	}
}