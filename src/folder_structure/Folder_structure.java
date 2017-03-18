package folder_structure;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import data.Application;
import listener.CustomButtonListener;
import main.CustomButton;
import main.HTL_Odysseus;

public class Folder_structure implements Runnable {

	static ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));
	static JFrame fStruct = new JFrame("HTL - Odysseus - Ordner Struktur");

	public void run() {
		setupWindow();
	}

	public void setupWindow() {
		fStruct.setIconImage(imgicon.getImage());
		fStruct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fStruct.setSize(744, 536);
		fStruct.setContentPane(
				new JLabel(new ImageIcon((HTL_Odysseus.class.getResource("/resources/FolderStructGenMenu.jpg")))));

		fStruct.setVisible(true);
		fStruct.setLayout(null);
		fStruct.setResizable(false);

		CustomButton bM = new CustomButton(fStruct, Application.CREATE_MAINPATH, 120, 25, 516, 96);
		bM.changeIcon("/resources/MainSmallButton.png");
		bM.addActionListener(new CustomButtonListener());
		fStruct.add(bM);

		CustomButton bE = new CustomButton(fStruct, Application.CREATE_EAGLEPATH, 120, 25, 449, 390);
		bE.changeIcon("/resources/EagleSmallButton.png");
		bE.addActionListener(new CustomButtonListener());
		fStruct.add(bE);

	}

	public static void folderStructGenerator(String loc, int subFolders) {

		File createDir = new File("");
		String[] mainSubjects = { "FSST", "FTKL", "PBE", "MTRS", "Hauptfaecher", "Mathematik", "Deutsch", "Englisch",
				"GET", "GSK", "GGP", "NW", "SOPK" };

		createDir = new File(loc + "/HTBLuVA/");
		createDir.mkdir();

		for (int i = 0; i <= 4; i++) {
			createDir = new File(loc + "/HTBLuVA/" + mainSubjects[i] + "/");
			createDir.mkdir();

		}

		for (int j = 0; j <= 12; j++) {
			if (j != 4 && j <= 4) {
				for (int i = 0; i <= subFolders; i++) {
					createDir = new File(loc + "/HTBLuVA/" + mainSubjects[j] + "/" + i + "_ProjektOrdner");
					createDir.mkdir();
				}
			}
			if (j != 5 && j <= 5) {
				System.out.println("#Instruction: j != 5 && j<=5");
			} else {
				System.out.println("# Printing in Haupfaecher -> " + mainSubjects[j]);
				createDir = new File(loc + "/HTBLuVA/" + mainSubjects[4] + "/" + (j - 4) + "_" + mainSubjects[j]);
				createDir.mkdir();
			}

		}

	}
}
