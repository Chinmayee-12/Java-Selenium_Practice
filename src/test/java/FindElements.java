import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//By tagName=By.tagName("a");
		//getElementAttribute(tagName, "href");
		By rightList=By.xpath("//aside[@id='column-right']//a");
		List<String> l=getElementTextList(rightList);
		System.out.println(l);
		if(l.contains("Login")) {
			System.out.println("pass");
		}
		
		
	}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		
		
		public static List<String> getElementTextList(By locator) {
			List<String> li= new ArrayList<String>();
			List<WebElement> lb=getElements(locator);
			for(WebElement e: lb) {
				String text=e.getText();
				//System.out.println(text);
				li.add(text);
			}
			return li;
		}
		
}
