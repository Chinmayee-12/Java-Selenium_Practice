package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		/*
		 * By country=By.id("Form_getForm_Country"); WebElement
		 * country1=driver.findElement(country); Select select= new Select(country1);
		 * //select.selectByIndex(4); select.selectByValue("Belgium");
		 */
		By country=By.id("Form_getForm_Country");
		doSelectByIndex(country,3);
		Thread.sleep(2000);
		doSelectByVisible(country, "India");
		
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	
	public static void doSelectByVisible(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);

	}
}

