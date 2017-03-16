package complex_calculator;

import java.awt.Color;

import javax.swing.JFrame;

public class Complex_calculator implements Runnable{
	
	public void run() {
		JFrame f = new JFrame("HTL - Odysseus - Komplex Rechner");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(640, 480);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
	}
}
