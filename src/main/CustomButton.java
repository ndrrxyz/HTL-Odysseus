package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
	private static final long serialVersionUID = 1289736459726L;
	
	private JFrame frame;
	private JPanel panel;

	public CustomButton(JFrame frame, int width, int height, int x, int y) {
		this.frame = frame;
		this.setSize(width, height);
		frame.add(this);
		this.setLocation(x, y);
	}

	public CustomButton(JPanel panel, int width, int height, int x, int y) {
		this.panel = panel;
		this.setSize(width, height);
		panel.add(this);
		this.setLocation(x, y);
	}

	public void changeIcon(String resource) {
		try {
			final Icon icon = new ImageIcon(getClass().getResource(resource));
			this.setIcon(icon);
		} catch (Exception e) {
			System.err.println("Fehler: " + e);
		}
	}
}
