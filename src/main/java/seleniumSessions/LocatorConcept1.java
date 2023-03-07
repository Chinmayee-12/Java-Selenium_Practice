package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept1 {
	public static void main( String args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By emailId= By.id("input-email");
		By password =By.id("input-password");
		
		ElementUtil1 ut = new ElementUtil1(driver);
		ut.sendKeys(emailId, "chinmayeehota750@gmail.com");
		ut.sendKeys(password, "Hello12@#");
		
	}
}
