package Media;

import javax.swing.ImageIcon;
import main.CustomButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import data.Application;
import listener.CustomButtonListener;
import main.HTL_Odysseus;

public class Credits implements Runnable {
	static JFrame fCredits = new JFrame("HTL - Odysseus - Credits");

	public void run() {
		ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));

		fCredits.setIconImage(imgicon.getImage());
		fCredits.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fCredits.setSize(740, 420); // blaze it
		fCredits.setContentPane(
				new JLabel(new ImageIcon((HTL_Odysseus.class.getResource("/resources/CreditsMenu.png")))));
		fCredits.setVisible(true);
		fCredits.setLayout(null);
		fCredits.setResizable(false);
		
		/*Buttons > rest*/
		
		/* [S]team [A]ndi */
		CustomButton bSA = new CustomButton(fCredits, Application.MEDIA_STEAMANDI, 120, 25, 83, 115);
		bSA.changeIcon("/resources/SteamSmallButton.png");
		bSA.addActionListener(new CustomButtonListener());		
		fCredits.add(bSA);	
				
		/* [S]team [F]txre */
		CustomButton bSF = new CustomButton(fCredits, Application.MEDIA_STEAMFXTXRE, 120, 25, 327, 115);
		bSF.changeIcon("/resources/SteamSmallButton.png");
		bSF.addActionListener(new CustomButtonListener());
		fCredits.add(bSF);
		
		/* [S]team [S]chulz */
		CustomButton bSS = new CustomButton(fCredits, Application.MEDIA_STEAMSCHULZ, 120, 25, 573, 115);
		bSS.changeIcon("/resources/SteamSmallButton.png");
		bSS.addActionListener(new CustomButtonListener());
		fCredits.add(bSS);
				
		/* [G]itHub [A]ndi */
		CustomButton bGA = new CustomButton(fCredits, Application.MEDIA_GITHUBANDI, 120, 25, 83, 157);
		bGA.changeIcon("/resources/GitHubSmallButton.png");
		bGA.addActionListener(new CustomButtonListener());		
		fCredits.add(bGA);	
		
		/* [G]itHub [F]xtxre */
		CustomButton bGF = new CustomButton(fCredits, Application.MEDIA_GITHUBFXTXRE, 120, 25, 327, 157);
		bGF.changeIcon("/resources/GitHubSmallButton.png");
		bGF.addActionListener(new CustomButtonListener());		
		fCredits.add(bGF);	
		
		/* [G]itHub [S]chulz */
		CustomButton bGS = new CustomButton(fCredits, Application.MEDIA_GITHUBSCHULZ, 120, 25, 573, 157);
		bGS.changeIcon("/resources/GitHubSmallButton.png");
		bGS.addActionListener(new CustomButtonListener());		
		fCredits.add(bGS);	
				
		/* [W]ebsite [A]ndi */
		CustomButton bWA = new CustomButton(fCredits, Application.MEDIA_WEBSITEANDI, 120, 25, 83, 200);
		bWA.changeIcon("/resources/WebsiteSmallButton.png");
		bWA.addActionListener(new CustomButtonListener());		
		fCredits.add(bWA);	
		
		/* [W]ebsite [F]xtxre */
		CustomButton bWF = new CustomButton(fCredits, Application.MEDIA_WEBSITEFXTXRE, 120, 25, 327, 200);
		bWF.changeIcon("/resources/WebsiteSmallButton.png");
		bWF.addActionListener(new CustomButtonListener());		
		fCredits.add(bWF);	
		
		/* [W]ebsite [S]chulz */
		CustomButton bWS = new CustomButton(fCredits, Application.MEDIA_WEBSITESCHULZ, 120, 25, 573, 200);
		bWS.changeIcon("/resources/WebsiteSmallButton.png");
		bWS.addActionListener(new CustomButtonListener());		
		fCredits.add(bWS);			

		
	
	}


}
