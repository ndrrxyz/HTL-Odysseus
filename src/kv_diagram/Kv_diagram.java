package kv_diagram;

import java.awt.Color;

import javax.swing.JFrame;

public class Kv_diagram implements Runnable{
		
	public void run() {			
			JFrame f = new JFrame("HTL - Odysseus - KV-Diagramm");
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f.setSize(640, 480);
			f.getContentPane().setBackground(Color.DARK_GRAY);
			f.setVisible(true);
			f.setLayout(null);
			f.setResizable(false);		
	}

}
