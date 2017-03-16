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

public class Vector_diagram extends JFrame implements Runnable {

	private static final long serialVersionUID = -7525251402309591219L;
	private JPanel mainPane;

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
		components.setBorder(new TitledBorder(null, "Components", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		components.setToolTipText("Component Settings");

		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton = new JButton("Remove");
		
		JButton btnRefresh = new JButton("Refresh");
		
		JButton btnGenerateDiagram = new JButton("Generate Diagram");
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
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRefresh)
							.addPreferredGap(ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
							.addComponent(btnGenerateDiagram)))
					.addContainerGap())
		);
		gl_mainPane.setVerticalGroup(
			gl_mainPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainPane.createSequentialGroup()
					.addGap(61)
					.addComponent(components, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
					.addGap(30)
					.addGroup(gl_mainPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(addButton)
						.addComponent(btnNewButton)
						.addComponent(btnRefresh)
						.addComponent(btnGenerateDiagram))
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		components.addTab("New tab", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("Component");
		
		JComboBox comboBox = new JComboBox();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(430, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(230, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		mainPane.setLayout(gl_mainPane);
	}
}
