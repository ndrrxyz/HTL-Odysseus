package vector_diagram;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.util.ArrayList;

import data.Bauteile;

public class TabManager {
	private ArrayList<JComboBox<Bauteile>> comboBoxList = new ArrayList<>();
	private ArrayList<JTextField> textFieldList = new ArrayList<>();
	private ArrayList<JSpinner> spinnerList = new ArrayList<>();
	private JTabbedPane tabPane;
	private int tabCount;

	public TabManager(JTabbedPane tabPane) {
		this.tabPane = tabPane;
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void addManagedTab(JTabbedPane tabPane) {

		JPanel panel = new JPanel();
		tabPane.addTab("", null, panel, null);

		JLabel componentLabel = new JLabel("Component");
		JComboBox<Bauteile> componentBox = new JComboBox<>();
		comboBoxList.add(componentBox);
		componentBox.addItem(Bauteile.RESISTOR);
		componentBox.addItem(Bauteile.COIL);
		componentBox.addItem(Bauteile.CAPACITOR);

		componentBox.setToolTipText("Component Type");

		JLabel referenceLabel = new JLabel("Reference");

		JTextField referenceTextField;
		referenceTextField = new JTextField();
		textFieldList.add(referenceTextField);
		referenceTextField.setToolTipText("e.g. R1, R2, L1");
		referenceTextField.setColumns(10);

		JLabel valueLabel = new JLabel("Value");

		JSpinner valueSpinner = new JSpinner();
		spinnerList.add(valueSpinner);
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
						.addComponent(componentBox, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
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

	public ArrayList<JComboBox<Bauteile>> getComboBoxList() {
		return comboBoxList;
	}

	public ArrayList<JTextField> getTextFieldList() {
		return textFieldList;
	}

	public ArrayList<JSpinner> getSpinnerList() {
		return spinnerList;
	}
}
