package main;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import data.Application;
import listener.CustomButtonListener;

public class Windows {
	static JFrame fLogin = new JFrame("HTL - Odysseus");
	static ImageIcon imgicon = new ImageIcon(HTL_Odysseus.class.getResource("/resources/htl_icon.png"));

	public static void LoginWindow() throws IOException {
		setupLoginWindow();

		int a = 1;
		int b = 1;

		if (b == a) {

			class MainWindow {

				public void SetupMainWindow() throws IOException {

					/* Get Client Version */
					URL clientVersionInput = new URL("http://godndr.comxa.com/versionClient");
					BufferedReader in = new BufferedReader(new InputStreamReader(clientVersionInput.openStream()));
					String clientVersionOutput;
					clientVersionOutput = in.readLine();
					in.close();

					JFrame fMain = new JFrame("HTL - Odysseus  V" + clientVersionOutput);
					/* Main Window Setup */
					fMain.setSize(980, 616);
					fMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					fMain.getContentPane().setBackground(Color.DARK_GRAY);
					fMain.setVisible(true);
					fMain.setLayout(null);
					fMain.setResizable(false);
					fMain.setIconImage(imgicon.getImage());
					fMain.setContentPane(new JLabel(
							new ImageIcon((HTL_Odysseus.class.getResource("/resources/BackgroundMenu.png")))));

					/* Main Menu Buttons */
					/* [V]ector [D]iagram */
					CustomButton bVD = new CustomButton(fMain, Application.VECTOR_DIAGRAM, 250, 100, 10, 140);
					bVD.changeIcon("/resources/VectorDiagramButton.jpg");
					fMain.add(bVD);
					bVD.addActionListener(new CustomButtonListener());

					/* [KV]-Diagramm */
					CustomButton bKV = new CustomButton(fMain, Application.KV_DIAGRAMM, 250, 100, 10 + 260, 140);
					bKV.changeIcon("/resources/KvDiagramButton.jpg");
					fMain.add(bKV);
					bKV.addActionListener(new CustomButtonListener());

					/* [K]omplex-[R]echner */
					CustomButton bKR = new CustomButton(fMain, Application.COMPLEX_CALCULATOR, 250, 100, 270 + 260,
							140);
					bKR.changeIcon("/resources/ComplexCalculatorButton.jpg");
					fMain.add(bKR);
					bKR.addActionListener(new CustomButtonListener());

					/* [O]rdner [S]truktur [C]reator */
					CustomButton bOSC = new CustomButton(fMain, Application.FOLDER_STRUCTURE, 120, 25, 833, 40); 
					bOSC.changeIcon("/resources/FolderStructGenSmallButton.png");
					bOSC.addActionListener(new CustomButtonListener());
					fMain.add(bOSC);
					
					/* [Y]ouTube [S]trasser */
					CustomButton bYS = new CustomButton(fMain, Application.MEDIA_YOUTUBE, 120, 25, 833, 70); 
					bYS.changeIcon("/resources/YouTubeSmallButton.png");
					bYS.addActionListener(new CustomButtonListener());
					fMain.add(bYS);
					
					/* [G]it[H]ub */
					CustomButton bGH = new CustomButton(fMain, Application.MEDIA_GITHUB, 120, 25, 833, 490-11); 
					bGH.changeIcon("/resources/GitHubSmallButton.png");
					bGH.addActionListener(new CustomButtonListener());
					fMain.add(bGH);
					
					/* [A]bout */
					CustomButton bA = new CustomButton(fMain, Application.MEDIA_ABOUT, 120, 25, 833, 520-11); 
					bA.changeIcon("/resources/AboutSmallButton.png");
					bA.addActionListener(new CustomButtonListener());
					fMain.add(bA);
					
					/* [C]redits */
					CustomButton bC = new CustomButton(fMain, Application.MEDIA_CREDITS, 120, 25, 833, 550-11); 
					bC.changeIcon("/resources/CreditsSmallButton.png");
					bC.addActionListener(new CustomButtonListener());
					fMain.add(bC);
				}
			}

			MainWindow main = new MainWindow();
			main.SetupMainWindow();
			fLogin.dispose();
		}

	}

	public static void setupLoginWindow() {
		fLogin.setSize(980, 616);
		fLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fLogin.getContentPane().setBackground(Color.DARK_GRAY);
		fLogin.setVisible(true);
		fLogin.setLayout(null);
		fLogin.setResizable(false);
		fLogin.setIconImage(imgicon.getImage());
		fLogin.setContentPane(
				new JLabel(new ImageIcon((HTL_Odysseus.class.getResource("/resources/BackgroundMenu.png")))));
	}
}
