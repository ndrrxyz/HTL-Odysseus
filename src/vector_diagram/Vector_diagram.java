package vector_diagram;

import java.awt.Color;

import javax.swing.JFrame;

public class Vector_diagram implements Runnable {

	public void run() {
		JFrame f = new JFrame("HTL - Odysseus - Vector Diagram");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(640, 480);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
	}
	
}
