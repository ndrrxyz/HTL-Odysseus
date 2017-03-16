package listener;

import java.awt.event.*;
import main.CustomButton;
import vector_diagram.Vector_diagram;

public class CustomButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		CustomButton b = (CustomButton) e.getSource();
		switch (b.getApp()) {
		case VECTOR_DIAGRAM:
			(new Thread(new Vector_diagram())).start();;
			break;
		default:
			break;
		}
	}

}
