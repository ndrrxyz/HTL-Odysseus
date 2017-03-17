package vector_diagram;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Vector_diagram extends JFrame implements Runnable {

	private static final long serialVersionUID = -7525251402309591219L;
	private JPanel mainPane;
	private JTextField referenceTextField;

	@Override
	public void run() {

	}

	public Vector_diagram() {
		setTitle("HTL - Odysseus - Vector Diagram");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vector_diagram.class.getResource("/resources/htl_icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 312, 319);
		mainPane = new JPanel();
		mainPane.setBackground(Color.DARK_GRAY);
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		setVisible(true);

		JTabbedPane components = new JTabbedPane(JTabbedPane.TOP);
		components.setForeground(Color.WHITE);
		components.setBorder(new TitledBorder(null, "Components", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		components.setToolTipText("Component Settings");

		JButton addButton = new JButton("Add");
		
		JButton removeButton = new JButton("Remove");

		JButton nextButton = new JButton("Next...");
		
		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setForeground(Color.WHITE);
		
		JSpinner frequencySpinner = new JSpinner();
		frequencySpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		GroupLayout gl_mainPane = new GroupLayout(mainPane);
		gl_mainPane.setHorizontalGroup(
			gl_mainPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mainPane.createParallelGroup(Alignment.LEADING)
						.addComponent(components, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
						.addGroup(gl_mainPane.createSequentialGroup()
							.addComponent(addButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(removeButton)
							.addPreferredGap(ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
							.addComponent(nextButton))
						.addGroup(gl_mainPane.createSequentialGroup()
							.addComponent(lblFrequency)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(frequencySpinner, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_mainPane.setVerticalGroup(
			gl_mainPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_mainPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFrequency)
						.addComponent(frequencySpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(components)
					.addGap(19)
					.addGroup(gl_mainPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_mainPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(removeButton)
							.addComponent(nextButton))
						.addComponent(addButton))
					.addContainerGap())
		);

		JPanel panel = new JPanel();
		components.addTab("", null, panel, null);

		JLabel componentLabel = new JLabel("Component");

		JComboBox componentBox = new JComboBox();
		componentBox.setToolTipText("Component Type");
		
		JLabel referenceLabel = new JLabel("Reference");
		
		referenceTextField = new JTextField();
		referenceTextField.setToolTipText("e.g. R1, R2, L1");
		referenceTextField.setColumns(10);
		
		JLabel valueLabel = new JLabel("Value");
		
		JSpinner valueSpinner = new JSpinner();
		valueSpinner.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(componentLabel)
						.addComponent(valueLabel)
						.addComponent(referenceLabel))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(valueSpinner)
							.addComponent(referenceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(componentBox, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(408, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(componentBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(referenceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(referenceLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(valueSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(valueLabel)))
						.addComponent(componentLabel))
					.addContainerGap(166, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		mainPane.setLayout(gl_mainPane);
	}
}
