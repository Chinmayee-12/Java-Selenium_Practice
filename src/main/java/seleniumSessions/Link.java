package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> lw=driver.findElements(By.tagName("a"));
		
		
		By tag=By.tagName("a");
		By imgage=By.tagName("img");
		if(getElementCount(tag)>250) {
			System.out.println("test is pass");
		}
		
		/*
		 * List<WebElement> lws=getElements(tag); System.out.println(lws.size());
		 * 
		 * for(WebElement e: lws) { String hr= e.getAttribute("href"); String
		 * text=e.getText(); System.out.println(hr+ " "+ text); }
		 * 
		 * List<WebElement> lwr=getElements(imgage); System.out.println(lwr.size());
		 * for(WebElement e: lwr) { String srcvalue=e.getAttribute("src");
		 * System.out.println(srcvalue); }
		 */
		
	}
	
	public static int getElementCount(By locator) {
		int size=getElements(locator).size();
		System.out.println(size);
		return size;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
