package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();
		br.initDriver(browser);
		br.launchUrl("https://www.amazon.in");
		String pagetitle =br.getPageTitle();
		if(pagetitle.contains("Amazon.in")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		String pageurl=	br.getPageUrl();
		if(pageurl.contains("amazon")) {
			System.out.println("valid");
		}
		else {
			System.out.println("not correct url");
		}
		}
	}


