package vector_diagram;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.util.ArrayList;

import data.Bauteile;

public class TabManager {
	private static ArrayList<JTextField> textFieldList = new ArrayList<>();
	private static ArrayList<JSpinner> spinnerList = new ArrayList<>();
	private static ArrayList<JComboBox> boxList = new ArrayList<>();
	
	public static void addManagedTab(JTabbedPane tabPane) {

		JPanel panel = new JPanel();
		tabPane.addTab("", null, panel, null);

		JLabel componentLabel = new JLabel("Component");
		JComboBox<Bauteile> componentBox = new JComboBox<>();
		addBoxList(componentBox);
		componentBox.addItem(Bauteile.RESISTOR);
		componentBox.addItem(Bauteile.COIL);
		componentBox.addItem(Bauteile.CAPACITOR);

		componentBox.setToolTipText("Component Type");

		JLabel referenceLabel = new JLabel("Reference");

		JTextField referenceTextField = new JTextField();
		addTextFieldList(referenceTextField);
		referenceTextField.setToolTipText("e.g. R1, R2, L1");
		referenceTextField.setColumns(10);

		JLabel valueLabel = new JLabel("Value");

		JSpinner valueSpinner = new JSpinner();
		addSpinnerList(valueSpinner);
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
	
	public static void removeManagedTab(JTabbedPane tabPane) {
		int index = tabPane.getSelectedIndex();
		if (index != -1) {
			tabPane.remove(index);
			
			textFieldList.remove(index);
			spinnerList.remove(index);
			boxList.remove(index);
		}
	}

	
	public static ArrayList<JTextField> getTextFieldList() {
		return textFieldList;
	}

	public static void addTextFieldList(JTextField textField) {
		textFieldList.add(textField);
		System.out.println("TextFieldList: " + textFieldList.size());
	}

	
	public static ArrayList<JSpinner> getSpinnerList() {
		return spinnerList;
	}

	public static void addSpinnerList(JSpinner spinner) {
		spinnerList.add(spinner);
		System.out.println("SpinnerList: " + spinnerList.size());
	}

	
	public static ArrayList<JComboBox> getBoxList() {
		return boxList;
	}

	public static void addBoxList(JComboBox box) {
		boxList.add(box);
		System.out.println("ComboList: " + boxList.size());
	}

}
