package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	List<WebElement> menuLinks=	driver.findElements(By.xpath("//aside[@id='column-right']//a"));
	System.out.println(menuLinks.size());
	for(WebElement e: menuLinks) {
		String s=e.getText();
		System.out.println(s);
	}
	
	By links=	By.xpath("//aside[@id='column-right']//a");
	List<String> el=getelementstextList(links);
	System.out.println(el);
	System.out.println(el.contains("Login"));
	System.out.println(el.contains("Wishlist"));


	}
	
	public static List<String> getelementstextList(By locator) {
		List<String> l= new ArrayList<String>();
		List<WebElement> lb=getElements(locator);
		for(WebElement e: lb) {
		String text=e.getText();
			l.add(text);
		}
		return l;
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
