package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementUsecases {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		By links=By.tagName("a");
		if(getTotalElementsCount(links)>250) {
			System.out.println("test is pass");
		}
	}
	
	public static int getTotalElementsCount(By locator) {
		int elecount= getElements(locator).size();
		System.out.println("link is" +locator + elecount);
		return elecount;
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
