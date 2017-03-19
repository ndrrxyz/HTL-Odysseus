package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Media.About;
import Media.Credits;
import Media.Media;
import folder_structure.Folder_structure;
import complex_calculator.Complex_calculator;
import kv_diagram.Kv_diagram;
import main.CustomButton;
import vector_diagram.Vector_diagram;

public class CustomButtonListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		CustomButton b = (CustomButton) e.getSource();
		switch (b.getApp()) {
		
		case VECTOR_DIAGRAM:	
			(new Thread(new Vector_diagram())).start();
			break;
			
		case KV_DIAGRAMM:			
			(new Thread(new Kv_diagram())).start();	
			break;
				
		case COMPLEX_CALCULATOR:
			(new Thread(new Complex_calculator())).start();
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
			
		case FOLDER_STRUCTURE:
			(new Thread(new Folder_structure())).start();
			break;
		
		case CREATE_MAINPATH:
			Folder_structure.folderStructGenerator("C:\\", 10);
		
		case DELETE_MAINPATH:
				Folder_structure.deleteFolderStructure("C:\\");
			break;
		
		default:
			break;
		}
	}

}
