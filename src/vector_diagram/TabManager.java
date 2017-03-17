package vector_diagram;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;

public class TabManager {
	private JTabbedPane tabPane;
	
	public TabManager(JTabbedPane tabPane) {
		this.tabPane = tabPane;
	}

	public static void addManagedTab(JTabbedPane tabPane) {
		JPanel panel = new JPanel();
		tabPane.addTab("", null, panel, null);

		JLabel componentLabel = new JLabel("Component");
		JComboBox componentBox = new JComboBox();
		componentBox.setToolTipText("Component Type");

		JLabel referenceLabel = new JLabel("Reference");

		JTextField referenceTextField;
		referenceTextField = new JTextField();
		referenceTextField.setToolTipText("e.g. R1, R2, L1");
		referenceTextField.setColumns(10);

		JLabel valueLabel = new JLabel("Value");

		JSpinner valueSpinner = new JSpinner();
		valueSpinner.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(componentLabel)
						.addComponent(valueLabel).addComponent(referenceLabel))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false).addComponent(valueSpinner)
								.addComponent(referenceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(componentBox, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(408, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addComponent(componentBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(referenceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(referenceLabel))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(valueSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(valueLabel)))
						.addComponent(componentLabel))
				.addContainerGap(166, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
	}
}
