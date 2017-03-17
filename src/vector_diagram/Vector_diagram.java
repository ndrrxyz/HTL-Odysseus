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
	private JTextField reference;

	@Override
	public void run() {
		System.out.println("wow");
	}

	public Vector_diagram() {
		setTitle("HTL - Odysseus - Vector Diagram");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vector_diagram.class.getResource("/resources/htl_icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 480);
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
		addButton.addActionListener(new AddButtonListener(components));

		JButton btnNewButton = new JButton("Remove");

		JButton btnNext = new JButton("Next...");
		
		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setForeground(Color.WHITE);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
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
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
							.addComponent(btnNext))
						.addGroup(gl_mainPane.createSequentialGroup()
							.addComponent(lblFrequency)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_mainPane.setVerticalGroup(
			gl_mainPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_mainPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFrequency)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(components, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
					.addGap(30)
					.addGroup(gl_mainPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(addButton)
						.addComponent(btnNewButton)
						.addComponent(btnNext))
					.addContainerGap())
		);

		JPanel panel = new JPanel();
		components.addTab("", null, panel, null);

		JLabel lblNewLabel = new JLabel("Component");

		JComboBox componentBox = new JComboBox();
		componentBox.setToolTipText("Component Type");
		
		JLabel lblNewLabel_1 = new JLabel("Reference");
		
		reference = new JTextField();
		reference.setToolTipText("e.g. R1, R2, L1");
		reference.setColumns(10);
		
		JLabel lblValue = new JLabel("Value");
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(1), new Double(1), null, new Double(1)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblValue)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(spinner_1)
							.addComponent(reference, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(reference, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblValue)))
						.addComponent(lblNewLabel))
					.addContainerGap(166, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		mainPane.setLayout(gl_mainPane);
	}
}
