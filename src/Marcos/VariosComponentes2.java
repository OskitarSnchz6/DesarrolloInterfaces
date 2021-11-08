package Marcos;

import javax.swing.*;
import java.awt.*;

public class VariosComponentes2 {
	public static void main(String[] args) {
		
		Botones2 b2 = new Botones2();
		b2.setVisible(true);
		b2.setSize(400, 400);
		b2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Botones2 extends JFrame{
	public Botones2() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		GridLayout gl = new GridLayout(4,3);
		gl.setHgap(5);
		gl.setVgap(5);
		cp.setLayout(gl);
		
		for(int i=1; i<=9; i++)	{
			cp.add(new JButton(String.valueOf(i)));
		}
		cp.add(new JButton(String.valueOf("*")));
		cp.add(new JButton(String.valueOf("0")));
		cp.add(new JButton(String.valueOf("#")));
	}
}