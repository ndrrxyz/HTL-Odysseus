package main;

import java.awt.Color;
import javax.swing.*;

public class HTL_Tools {

	public static void main(String[] args) {

		// Standard Window
		JFrame f = new JFrame("HTL-Tools");
		f.setSize(640, 480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
	}
}
