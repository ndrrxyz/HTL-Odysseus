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

import listener.AddButtonListener;
import listener.RemoveButtonListener;

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
		gl_mainPane.setHorizontalGroup(gl_mainPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_mainPane.createParallelGroup(Alignment.LEADING)
								.addComponent(components, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
								.addGroup(gl_mainPane.createSequentialGroup().addComponent(addButton)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(removeButton)
										.addPreferredGap(ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
										.addComponent(nextButton))
								.addGroup(gl_mainPane.createSequentialGroup().addComponent(lblFrequency)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(frequencySpinner,
												GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		gl_mainPane.setVerticalGroup(gl_mainPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_mainPane
				.createSequentialGroup().addGap(36)
				.addGroup(gl_mainPane.createParallelGroup(Alignment.BASELINE).addComponent(lblFrequency).addComponent(
						frequencySpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(components).addGap(19)
				.addGroup(gl_mainPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_mainPane
						.createParallelGroup(Alignment.BASELINE).addComponent(removeButton).addComponent(nextButton))
						.addComponent(addButton))
				.addContainerGap()));
		mainPane.setLayout(gl_mainPane);
		addButton.addActionListener(new AddButtonListener(components));
		removeButton.addActionListener(new RemoveButtonListener(components));
	}
}
