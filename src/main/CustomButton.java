package main;

import javax.swing.*;

import data.Application;

@SuppressWarnings("unused")

public class CustomButton extends JButton {
	private static final long serialVersionUID = 1289736459726L;
	
	private JFrame frame;
	private JPanel panel;
	private Application app;

	public CustomButton(JFrame frame, Application app, int width, int height, int x, int y) {
		this.app = app;
		this.frame = frame;
		this.setSize(width, height);
		frame.add(this);
		this.setLocation(x, y);
	}

	public CustomButton(JPanel panel, Application app, int width, int height, int x, int y) {
		this.app = app;
		this.panel = panel;
		this.setSize(width, height);
		panel.add(this);
		this.setLocation(x, y);
	}

	public Application getApp() {
		return app;
	}

	public void setApp(Application app) {
		this.app = app;
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
