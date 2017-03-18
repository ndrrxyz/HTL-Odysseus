package listener;

import javax.swing.*;
import vector_diagram.TabManager;
import java.awt.event.*;

public class AddButtonListener implements ActionListener {
	private JTabbedPane tabPane;
	private TabManager tm;
	
	public AddButtonListener(JTabbedPane tabPane) {
		this.tabPane = tabPane;
		tm = new TabManager(tabPane);
	}
	
	public void actionPerformed(ActionEvent e) {
		tm.addManagedTab(this.tabPane);
	}
}
