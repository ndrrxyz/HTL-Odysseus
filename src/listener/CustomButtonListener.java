package listener;

import java.awt.event.*;

import complex_calculator.Complex_calculator;
import main.CustomButton;
import vector_diagram.Vector_diagram;
import kv_diagram.Kv_diagram;

public class CustomButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		CustomButton b = (CustomButton) e.getSource();
		switch (b.getApp()) {
		case VECTOR_DIAGRAMM:
			(new Thread(new Vector_diagram())).start();
			break;
		case KV_DIAGRAMM:
			(new Thread(new Kv_diagram())).start();
			break;
		case COMPLEX_CALCULATOR:
			(new Thread(new Complex_calculator())).start();
			break;
		default:
			break;
		}
	}

}
