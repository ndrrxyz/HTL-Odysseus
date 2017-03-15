package main;

import javax.swing.*;

public class LaunchButton {
	private String label;
	private JButton button;
	private JFrame frame;
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame f) {
		this.frame = f;
	}

}