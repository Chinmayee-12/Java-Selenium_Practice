package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			
			default:
				System.out.println("fail");
				break;
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public void launchUrl(String url) {
		if(url==null) {
			System.out.println("do not launch");
		}
		
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	public String getPageTitle() {
	String title=driver.getTitle();
	System.out.println("page title"+ title);
	return title;
	}
	
	public String getPageUrl() {
	String pageUrl=	driver.getCurrentUrl();
	System.out.println("page url"+ pageUrl);

	return pageUrl;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
}
