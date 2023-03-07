package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtilone {

	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser is:" + browserName);
		switch (browserName.toLowerCase().trim()){
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;	
			
		case "safari":
			driver = new SafariDriver();
			break;
			
			default:
				System.out.println("wrong browser eneterd");
		}
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public void launchUrl(String url) {
		if(url==null) {
			System.out.println("wrong url");
		}
		
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
		
		public String getPageTitle() {
			String title =driver.getTitle();
			System.out.println("title is:" + title);
			return title;
		}
	
	public String getPageUrl() {
	String currentUrl =driver.getCurrentUrl();
	System.out.println("current url is:" + currentUrl);
	return currentUrl;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	
		
		
	
	}
}
