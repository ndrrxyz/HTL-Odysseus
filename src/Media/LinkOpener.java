package Media;

import java.awt.Desktop;
import java.net.URL;

public class LinkOpener {

	public static void openWebpage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}