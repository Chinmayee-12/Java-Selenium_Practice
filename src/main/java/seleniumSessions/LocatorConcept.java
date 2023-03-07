package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1st type
		//driver.findElement(By.id("input-email")).sendKeys("chinmayeehota750@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Hello12@#");
		
		// 2nd approach
		
		//WebElement emailId =driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));
		
	//	emailId.sendKeys("chinmayeehota750@gmail.com");
		//password.sendKeys("Hello12@#");
	//	3rd approach
		
		//By emailId =By.id("input-email");
	//////By password=By.id("input-password");
	
	//WebElement eId=driver.findElement(emailId);
	////WebElement pass =driver.findElement(password);
	
	//eId.sendKeys("chinmayeehota750@gmail.com");
	//pass.sendKeys("Hello12@#");
	
	//4th approach
	
	
		
	//	eId.sendKeys("chinmayeehota750@gmail.com");
	//	pwd.sendKeys("Hello12@#");
		
		//By emailId =By.id("input-email");
	//	By password =By.id("input-password");
		
		//getElement(emailId).sendKeys("chinmayeehota750@gmail.com");
	//	getElement(password).sendKeys("Hello12@#");
		
		
		//5th approach by locator+ generic method for webwlwmnt and action
		//By emailId =By.id("input-email");
		//By password =By.id("input-password");
		
		//doSendKeys(emailId, "chinmayeehota750@gmail.com");
		//doSendKeys(password, "Hello12@#");
	//By emailId =By.id("input-email");
	////By password=By.id("input-password");
		//getElement(emailId).sendKeys("chinmayeehota750@gmail.com");
		//By emailId =By.id("input-email");
		//By password=By.id("input-password");
		//doSendKeys(emailId, "chinmayeehota750@gmail.com");
		//doSendKeys(password, "Hello12@#");
		//6th approach
		By emailId =By.id("input-email");
		By password=By.id("input-password");
		
		ElelemntUtil e = new ElelemntUtil(driver);
		e.doSendKeys(emailId, "chinmayeehota750@gmail.com");
		e.doSendKeys(password, "Hello12@#");
	}
	
	//public static WebElement getElement(By locator) {
	////	return driver.findElement(locator);
	//}
	//public static void doSendKeys(By locator, String value) {
		//getElement(locator).sendKeys(value);
	
	
	
	
	}


