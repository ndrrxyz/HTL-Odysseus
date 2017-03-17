package listener;

import java.awt.event.*;

import Media.*;
import complex_calculator.Complex_calculator;
import folder_structure.Folder_structure;
import main.CustomButton;
import vector_diagram.Vector_diagram;
import kv_diagram.Kv_diagram;

public class CustomButtonListener implements ActionListener {

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
			
		case FOLDER_STRUCTURE:
			(new Thread(new Folder_structure())).start();
			break;
			
		case MEDIA_YOUTUBE:
			(new Thread(new YouTube())).start();
			break;
			
		case MEDIA_ABOUT:
			(new Thread(new About())).start();
			break;
			
		case MEDIA_CREDITS:
			(new Thread(new Credits())).start();
			break;
			
		case MEDIA_GITHUB:
			(new Thread(new GitHub())).start();
			break;
			
		default:
			break;
		}
	}

}
