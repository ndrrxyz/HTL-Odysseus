package main;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.*;

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
		String appdata = System.getenv("APPDATA");
		String iconPath = appdata + "\\HTL-Tools\\htl_icon.png";
		File icon = new File(iconPath);
		ImageIcon imgicon = new ImageIcon(iconPath);

		/* Main Window Setup */
		JFrame f = new JFrame("HTL - Odysseus  V" + clientVersionOutput);
		f.setSize(980, 620);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
		f.setIconImage(imgicon.getImage());
		
		CustomButton button = new CustomButton(f, 200, 100, 390, 310);
		button.changeIcon("/resources/circuit.jpg");
		
		
	}
}
