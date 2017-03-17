package Media;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.HTL_Odysseus;

public class Credits implements Runnable {

	public void run(){
		ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));		
		JFrame fCredits = new JFrame("HTL - Odysseus - Credits");
		
		fCredits.setIconImage(imgicon.getImage());
		fCredits.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fCredits.setSize(740, 420); //blaze it
		fCredits.setContentPane(new JLabel(
				new ImageIcon((HTL_Odysseus.class.getResource("/resources/CreditsMenu.png")))));
		fCredits.setVisible(true);
		fCredits.setLayout(null);
		fCredits.setResizable(false);
	}
}
