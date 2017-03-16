package main;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.*;

import data.Application;

import listener.CustomButtonListener;

public class HTL_Odysseus {
	
	public static void main(String[] args) throws IOException {
		setupMainWindow();

		
	}

	public static void setupMainWindow() throws IOException {
		/* Getting Client Version */
		URL clientVersionInput = new URL("http://godndr.comxa.com/versionClient"); // Change
																					// server
																					// location
		BufferedReader in = new BufferedReader(new InputStreamReader(clientVersionInput.openStream()));
		String clientVersionOutput;
		clientVersionOutput = in.readLine();
		in.close();

		/* Getting Client Icon */
		ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));


		/* Main Window Setup */
		JFrame f = new JFrame("HTL - Odysseus  V" + clientVersionOutput);
		f.setSize(980, 616);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
		f.setIconImage(imgicon.getImage());	
		f.setContentPane(new JLabel(new ImageIcon((HTL_Odysseus.class.getResource("/resources/BackgroundMenu.png")))));

		/*Main Menu Buttons*/
		/*[V]ector [D]iagram*/
		CustomButton bVD = new CustomButton(f, Application.VECTOR_DIAGRAM, 250, 100, 10, 140);
		bVD.changeIcon("/resources/VectorDiagramButton.jpg");
		f.add(bVD);
		bVD.addActionListener(new CustomButtonListener());
		
		/*[KV]-Diagramm*/
		CustomButton bKV = new CustomButton(f, Application.KV_DIAGRAMM, 250, 100, 10+260, 140);
		bKV.changeIcon("/resources/KvDiagramButton.jpg");
		f.add(bKV);
		bKV.addActionListener(new CustomButtonListener());
		
		/*[K]omplex-[R]echner*/
		CustomButton bKR = new CustomButton(f, Application.COMPLEX_CALCULATOR, 250, 100, 270+260, 140);
		bKR.changeIcon("/resources/ComplexCalculatorButton.jpg");
		f.add(bKR);
		bKR.addActionListener(new CustomButtonListener());
	}

}
