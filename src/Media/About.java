package Media;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import main.HTL_Odysseus;

public class About implements Runnable{

	public void run() {		
		ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));	
		JFrame fAbout = new JFrame("HTL - Odysseus - About");
		
		fAbout.setIconImage(imgicon.getImage());
		fAbout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fAbout.setSize(640, 480);
		fAbout.getContentPane().setBackground(Color.DARK_GRAY);
		fAbout.setVisible(true);
		fAbout.setLayout(null);
		fAbout.setResizable(false);		
}
}
