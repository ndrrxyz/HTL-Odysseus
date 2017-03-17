package Media;

import java.awt.Desktop;
import java.net.URL;

public class Media {

	public static void openWebpage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void startYoutubeMAIN() {
		openWebpage("https://www.youtube.com/channel/UCVoKbPU149U9TbcI74fXzLg/videos?view=0&shelf_id=0&sort=dd");
	}
	
	public static void startSteamFXTXRE() {
		openWebpage("http://steamcommunity.com/id/fxtxre/");
	}
	
	public static void startSteamANDI() {
		openWebpage("http://steamcommunity.com/id/Andi1603/");
	}
	
	public static void startSteamSCHULZ() {
		openWebpage("http://steamcommunity.com/id/GenTexX/");
	}
	
	public static void startWebsiteFXTXRE() {
		openWebpage("http://fxtxre.cf");
	}
	
	public static void startWebsiteANDI() {
		openWebpage("http://steamcommunity.com/id/Andi1603/");
	}
	
	public static void startWebsiteSCHULZ() {
		openWebpage("http://steamcommunity.com/id/GenTexX/");
	}
	
	public static void startGitHubMAIN(){
		openWebpage("https://github.com/fxtxre/HTL-Odysseus");
	}
	
	public static void startGitHubFXTXRE(){
		openWebpage("https://github.com/fxtxre");
	}
	
	public static void startGitHubANDI(){
		openWebpage("https://github.com/PandaForce1603");
	}
	
	public static void startGitHubSCHULZ(){
		openWebpage("https://github.com/GenTexX");
	}
	
}
