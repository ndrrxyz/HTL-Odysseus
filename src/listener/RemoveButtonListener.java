package listener;

import javax.swing.*;
import vector_diagram.TabManager;
import java.awt.event.*;

public class RemoveButtonListener implements ActionListener {
	private JTabbedPane tabPane;

	public RemoveButtonListener(JTabbedPane tabPane) {
		this.tabPane = tabPane;
	}

	public void actionPerformed(ActionEvent e) {
		if(tabPane.getSelectedIndex() != -1)
			tabPane.remove(tabPane.getSelectedIndex());
	}

}
