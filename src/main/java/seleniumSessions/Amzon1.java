package seleniumSessions;

public class Amzon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName= "chrome";

		BrowserUtil3 br= new BrowserUtil3();
		br.initDriver(browserName);
		br.launchUrl("https://www.amazon.com");
		String title=br.getpageTitle();
		if(title.contains("Amazon")) {
			System.out.println("title is checked");
		}
		else {
			System.out.println("title is failed");
		}
		
	}

}
