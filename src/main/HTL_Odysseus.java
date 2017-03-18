package main;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UnsupportedLookAndFeelException;

public class HTL_Odysseus {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, LineUnavailableException, UnsupportedAudioFileException{		
		
		try {
			Windows.LoginWindow();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
