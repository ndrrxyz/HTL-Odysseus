package listener;

import javax.swing.*;

import vector_diagram.TabManager;
import java.awt.event.*;
import java.awt.*;

public class AddButtonListener implements ActionListener {
	private JTabbedPane tabPane;
	
	public AddButtonListener(JTabbedPane tabPane) {
		this.tabPane = tabPane;
	}
	
	public void actionPerformed(ActionEvent e) {
		TabManager.addManagedTab(tabPane);
	}
}
