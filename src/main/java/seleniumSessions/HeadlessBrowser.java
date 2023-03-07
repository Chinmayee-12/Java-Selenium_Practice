package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
