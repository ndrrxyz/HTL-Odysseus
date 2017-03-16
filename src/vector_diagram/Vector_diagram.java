package vector_diagram;

import java.awt.*;
import javax.swing.*;

public class Vector_diagram implements Runnable {
//	final Icon imgResistor = new ImageIcon(getClass().getResource("/resources/resistor"));
//	final Icon imgInduction = new ImageIcon(getClass().getResource("/resources/induction"));
//	final Icon imgCapacitor = new ImageIcon(getClass().getResource("/resources/capacitor"));


	public void run() {
		JFrame f = new JFrame("HTL - Odysseus - Vector Diagram");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(640, 480);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
		
		// Tabs for every Component
		JTabbedPane comp = new JTabbedPane();
		comp.setBorder(BorderFactory.createTitledBorder("Components"));
		comp.setSize(100, 100);
		f.add(comp);
		comp.setLocation(200, 200);
		
		
		// ADD Button
		JButton add = new JButton();
		add.setSize(75, 25);
		add.setText("Add");
		f.add(add);
		add.setLocation(10, 420);
		
	}
	
}
