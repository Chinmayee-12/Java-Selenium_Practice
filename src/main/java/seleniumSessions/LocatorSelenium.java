package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSelenium {
	static WebDriver driver;
	public static void main (String [] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.name("email")).sendKeys("chinmayeehota750@gmail.com");
		//By name=By.name("email");
		//driver.findElement(By.className("form-control")).sendKeys("hi@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("hi");
		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Hello12@#");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		//By emailId=By.name("email");
	//By pwd=By.xpath("//*[@id=\"input-password\"]");
	//By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	//doSendKeys(emailId, "chinmayeehota750@gmail.com");
	//doSendKeys(pwd,"Hello12@#");
	//doClick(login);
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("chinmayeehota750@gmail.com");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys("Hello12@#");
		//driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		//driver.findElement(By.linkText("Register")).click();
		
	//	By linktxt= By.linkText("Register");
		//doClick(linktxt);
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//By partlinktxt=By.partialLinkText("Forgotten");
		//doClick(partlinktxt);
		////String headtext=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(headtext);
		
	By linktxt=	By.linkText("Recurring payments");
	String value=dogetText(linktxt);
	System.out.println(value);
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static String dogetText(By locator) {
		return getElement(locator).getText();
	}
}
