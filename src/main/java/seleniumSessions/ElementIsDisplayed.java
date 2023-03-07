package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		/*
		 * boolean
		 * flag=driver.findElement(By.className("img-responsive")).isDisplayed();
		 * if(flag)System.out.println("pass"); boolean
		 * flagSearch=driver.findElement(By.name("search")).isDisplayed();
		 * if(flagSearch)System.out.println("pass search"); if(flagSearch) {
		 * driver.findElement(By.name("search")).sendKeys("mac"); }
		 */
		
		By logoImage=By.className("img-responsive");
		By searchn=By.name("search");
		
		if(doisElementDisplayed(logoImage)) {
			System.out.println("image presesnt");
		}
		if(doisElementDisplayed(searchn)) {
			System.out.println("search is preseent");
			doSendKeys(searchn, "macbook");
			doClick(searchn);
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doisElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
