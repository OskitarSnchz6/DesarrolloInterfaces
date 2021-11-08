package Marcos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class DibujarComponentes2 {
	public static void main(String[] args) {
		
	       FijarMarco framePrincipal = new FijarMarco();     
	       
	       framePrincipal.setVisible(true);
	       framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	       
	       
	}
}
	class FijarMarco extends JFrame{
		public FijarMarco() {
			FijarCapa pnlCapa = new FijarCapa();
			setTitle("Ventana con graficos 2D");
			setSize(1000, 500);	//tamaño del marco
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			add(pnlCapa);
	}
}
	
	class FijarCapa extends JPanel	{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 500, 150);
			g2.draw(rectangulo);
			Line2D linea = new Line2D.Double(100, 100, 600, 250);
			g2.draw(linea);
			Ellipse2D ellipse = new Ellipse2D.Double(100, 100, 500, 150);
			g2.draw(ellipse);
			Rectangle2D rectangulo2 = new Rectangle2D.Double(100, 150, 100, 100);
			g2.draw(rectangulo2);
	}
}