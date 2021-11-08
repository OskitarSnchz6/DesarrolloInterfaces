package Marcos;

import javax.swing.JFrame;

public class CrearMarco	{
	public static void main(String [] args)	{
		
		Marco miMarco = new Marco();
		
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class Marco extends JFrame	{	//CONSTRUCTOR
	
	public Marco()	{
		this.setTitle("Titulo del marco");
		setResizable(false);	//Ampliar/minimiza tamaño si/no
		setBounds(500, 200, 1000, 600);	//Localizacion y tamaño del marco
		
		//setLocation(500, 200);	//localizacion del marco
		//setSize(1000, 600);	//tamaño del marco
		
		
		
}
}