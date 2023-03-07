package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElements(By.tagName("a"));
		
		By links=By.tagName("a");
		By imgage=By.tagName("img");
		
	//List<WebElement>link=getElements(links);
	//System.out.println(link.size());
	//for(WebElement e: link) {
		//String hrefvalue=e.getAttribute("href");
		//String text=e.getText();
		//System.out.println(hrefvalue + "---->" +  text);
		
		getElementAttr(imgage, "src");
		getElementAttr(links, "href");
	//}
		List<WebElement> img=getElements(imgage);
		System.out.println(img.size());
		for(WebElement e:img) {
			String srcvalue=e.getAttribute("src");
			System.out.println(srcvalue);
		}
		
	
	}
	
	public static void getElementAttr(By locator, String attrname) {
		List<WebElement> elelist=getElements(locator);
		for(WebElement e: elelist) {
		String attrvalue=e.getAttribute(attrname);
		System.out.println(attrvalue);
		}
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
