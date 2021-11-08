package Marcos;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaBoton extends JFrame{

	public static void main(String[] args) {
		new VentanaBoton();
		
	}


	public  VentanaBoton() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		JButton boton = new JButton();
		boton.setText("Púlsame");
		add(boton);
		boton.setBounds(130, 150, 130, 50);
		this.setVisible(true);
		
		
	}
}