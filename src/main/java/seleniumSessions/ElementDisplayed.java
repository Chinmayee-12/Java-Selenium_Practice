package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//boolean flagimg =driver.findElement(By.className("img-responsive")).isDisplayed();
		//if(flagimg)System.out.println("pass");
		
	By img=	By.className("img-responsive");
	if(doIsdisplayed(img)) {
		System.out.println("yes pass");
	}
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doIsdisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
}
