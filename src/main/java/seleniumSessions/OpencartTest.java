package seleniumSessions;

public class OpencartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "chrome";
		BrowserUtilone br = new BrowserUtilone();
		br.initDriver( browserName);
		br.launchUrl("https://naveenautomationlabs.com/opencart/");
		String title= br.getPageTitle();
		if(title.contains("Your Store")) {
			System.out.println("pass");
		}
		else {
			System.out.println("title is failed");
		}
		
		String url =br.getPageUrl();
		if(url.contains("naveenautomationlabs.com")) {
			
		
		System.out.println("url is pass");
		}
		else {
			System.out.println("fail url");
		}
	}

}
