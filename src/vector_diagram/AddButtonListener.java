package vector_diagram;

import java.awt.event.*;
import javax.swing.*;

public class AddButtonListener implements ActionListener {
	private JTabbedPane pane;
	
	AddButtonListener(JTabbedPane pane) {
		this.pane = pane;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		pane.addTab("", new JPanel());
	}

}
