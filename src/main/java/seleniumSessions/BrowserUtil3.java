package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil3 {
	
	/**
	 * this method is used to initialize the driver on the basis of browser name
	 */
	private WebDriver driver;
	public WebDriver initDriver(String browser) {
		System.out.println(browser);
		
	switch(browser.toLowerCase().trim()) {
	case "chrome":
		
		driver= new ChromeDriver();
		break;
	case "firefox":
		driver= new FirefoxDriver();
		break;
		
		default:
			System.out.println("not launched");
			break;
			
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	return driver;
	
	}
	
	public void launchUrl(String url) {
		if(url==null) {
			System.out.println("url can't be null");
		}
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	
	public String getpageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getCurrentUrl() {
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
			System.out.println("closing browser");
		}
	}
}
