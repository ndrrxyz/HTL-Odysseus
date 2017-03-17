package Media;

public class YouTube implements Runnable {

	public void run() {
		LinkOpener.openWebpage("https://www.youtube.com/channel/UCVoKbPU149U9TbcI74fXzLg/videos?view=0&shelf_id=0&sort=dd");
	}
}
