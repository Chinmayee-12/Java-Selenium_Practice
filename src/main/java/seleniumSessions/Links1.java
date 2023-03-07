package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links1 {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElements(By.tagName("a"));
		
		By links=By.tagName("a");
		By images=By.tagName("img");
		List<WebElement>list=getElements(links);
		for(WebElement e: list) {
		String value=	e.getAttribute("href");
		String text=e.getText();
		System.out.println(value+ ""+ text);
		}
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
