package Marcos;

import javax.swing.*;
import java.awt.Graphics;

public class DibujarMarco {

	public static void main(String[] args) {
		MarcoConDibujo marcoDibujo = new MarcoConDibujo();
		
		marcoDibujo.setVisible(true);
		marcoDibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
	
	class MarcoConDibujo extends JFrame	{	//CONSTRUCTOR
		public MarcoConDibujo()	{
			setTitle("Marco con Dibujo");
			setBounds(180, 180, 800, 400);
			CapaconFiguras pnlCapa = new CapaconFiguras();
			add(pnlCapa);
		}
	



public class CapaconFiguras extends JPanel{
	 

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 100, 50);
		g.drawLine(50, 50, 150, 100);
		g.drawArc(50, 20, 100, 75, 20, 150);
		
		//g.drawRect(EXIT_ON_CLOSE, DISPOSE_ON_CLOSE, WIDTH, HEIGHT);
		//g.drawArc(MAXIMIZED_BOTH, EXIT_ON_CLOSE, WIDTH, HEIGHT, DO_NOTHING_ON_CLOSE, DISPOSE_ON_CLOSE);
		}

	}
}