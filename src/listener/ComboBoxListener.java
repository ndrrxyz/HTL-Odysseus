package listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import data.Background;

public class ComboBoxListener implements ActionListener {
	private JFrame f;

	public ComboBoxListener(JFrame f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unchecked")
		JComboBox<data.Background> cb = (JComboBox<Background>) e.getSource();
		switch ((data.Background) cb.getSelectedItem()) {
		case BLUE: //lol
			f.getContentPane().setBackground(Color.BLUE);
			break;
		case GRAY:
			f.getContentPane().setBackground(Color.DARK_GRAY);
			break;
		case GREEN:
			f.getContentPane().setBackground(Color.GREEN);
			break;
		case RED:
			f.getContentPane().setBackground(Color.RED);
			break;
		case WHITE:
			f.getContentPane().setBackground(Color.WHITE);
			break;
		default:
			break;

		}
	}
}
