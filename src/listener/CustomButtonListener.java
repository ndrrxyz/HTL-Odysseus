package listener;

import java.awt.event.*;

import Media.*;
import complex_calculator.Complex_calculator;
import folder_structure.Folder_structure;
import main.CustomButton;
import vector_diagram.Start_VD;
import vector_diagram.Vector_diagram;
import kv_diagram.Kv_diagram;

public class CustomButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		CustomButton b = (CustomButton) e.getSource();
		switch (b.getApp()) {
		
		case VECTOR_DIAGRAM:	
			(new Thread(new Start_VD())).start();	
			break;
			
		case KV_DIAGRAMM:			
			(new Thread(new Kv_diagram())).start();	
			break;
				
		case COMPLEX_CALCULATOR:
			(new Thread(new Complex_calculator())).start();
			break;
			
		case FOLDER_STRUCTURE:
			(new Thread(new Folder_structure())).start();
			break;
			
		case MEDIA_ABOUT:
			(new Thread(new About())).start();
			break;
			
		case MEDIA_CREDITS:
			(new Thread(new Credits())).start();
			break;
		
		case MEDIA_YOUTUBE:
			Media.startYoutubeMAIN();
			break;
			
		case MEDIA_GITHUBMAIN:
			Media.startGitHubMAIN();
			break;
			
		case MEDIA_GITHUBFXTXRE:
			Media.startGitHubFXTXRE();
			break;	
			
		case MEDIA_GITHUBANDI:
			Media.startGitHubANDI();
			break;
			
		case MEDIA_GITHUBSCHULZ:
			Media.startGitHubSCHULZ();
			break;	
			
		case MEDIA_STEAMFXTXRE:
			Media.startSteamFXTXRE();
			break;
			
		case MEDIA_STEAMANDI:
			Media.startSteamANDI();
			break;	
			
		case MEDIA_STEAMSCHULZ:
			Media.startSteamSCHULZ();
			break;	
		
		case MEDIA_WEBSITEFXTXRE:
			Media.startWebsiteFXTXRE();
			break;
		
		case MEDIA_WEBSITEANDI:
			Media.startWebsiteANDI();
			break;
			
		case MEDIA_WEBSITESCHULZ:
			Media.startWebsiteSCHULZ();
			break;	
			
		default:
			break;
		}
	}

}
