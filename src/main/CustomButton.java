package main;

import javax.swing.*;

public class CustomButton extends JButton {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel panel;


	public CustomButton(JFrame frame, String label, int width, int height, int x, int y) {
		this.frame = frame;
		this.setText(label);
		this.setSize(width, height);
		frame.add(this);
		this.setLocation(x, y);
	}

	public CustomButton(JPanel panel, String label, int width, int height, int x, int y) {
		this.panel = panel;
		this.setText(label);
		this.setSize(width, height);
		panel.add(this);
		this.setLocation(x, y);
	}

}
