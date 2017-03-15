package main;

import java.awt.Color;
import javax.swing.*;
import data.Background;
import listener.ComboBoxListener;

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

		JComboBox<data.Background> changeColor = new JComboBox<>();
		addComboBoxItems(changeColor, Background.GRAY, Background.WHITE, Background.GREEN, Background.RED,
				Background.BLUE);
		f.add(changeColor);
		changeColor.addActionListener(new ComboBoxListener(f));
		changeColor.setBounds(25, 400, 50, 30);
	}

	// Zur Übersicht in eine eigene Methode
	public static void addComboBoxItems(JComboBox<Background> a, data.Background... b) {
		for (data.Background k : b) {
			switch (k) {
			case WHITE:
				a.addItem(data.Background.WHITE);
				break;
			case RED:
				a.addItem(data.Background.RED);
				break;
			case GREEN:
				a.addItem(data.Background.GREEN);
				break;
			case BLUE:
				a.addItem(data.Background.BLUE);
				break;
			case GRAY:
				a.addItem(data.Background.GRAY);
				break;
			}
		}
	}
}
