package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		//WebElement country=driver.findElement(countryid);
		//Select select= new Select(country);
	//	select.selectByIndex(5);
		//select.selectByValue("Albania");
		//select.selectByVisibleText("Bhutan");
		By countryid =By.id("Form_getForm_Country");

		doSelectDropByIndex(countryid,7);
		Thread.sleep(2000);
		doSelectDropByValue(countryid,"Belgium");
		doSelectDropByVisisbleText(countryid, "India");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropByVisisbleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
