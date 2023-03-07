package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil1 {
	private WebDriver driver;
	
	public ElementUtil1(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public void sendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}
