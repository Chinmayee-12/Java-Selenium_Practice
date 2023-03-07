package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		String browser = "chrome";
		WebDriver driver= null;
		switch(browser) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
		break;
		default:
			System.out.println("no browser");
		}
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("pass");
		}
		
		driver.navigate().to("https://www.amazon.com");
		String s= driver.getTitle();
		System.out.println(s);
		String r= driver.getPageSource();
		System.out.println(r);
		driver.quit();
	}

}
