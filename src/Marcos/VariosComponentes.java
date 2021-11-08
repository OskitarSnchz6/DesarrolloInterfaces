package Marcos;

import java.awt.*;
import javax.swing.*;

public class VariosComponentes {
	
	public static void main(String[] args)	{
		
		Botones b = new Botones();
		b.setVisible(true);
		b.setSize(400, 400);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class Botones extends JFrame	{
	
	private JButton
		b1 = new JButton ("Boton 1"),
		b2 = new JButton ("Boton 2");

	
	public Botones ()	{
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
}