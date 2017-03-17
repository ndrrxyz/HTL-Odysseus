package folder_structure;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import main.HTL_Odysseus;

public class Folder_structure implements Runnable {

	public void run() {
		ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));	
		JFrame fStruct = new JFrame("HTL - Odysseus - Ordner Struktur");

		fStruct.setIconImage(imgicon.getImage());
		fStruct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fStruct.setSize(740, 510);
		fStruct.getContentPane().setBackground(Color.DARK_GRAY);
		fStruct.setVisible(true);
		fStruct.setLayout(null);
		fStruct.setResizable(false);
	}
}
