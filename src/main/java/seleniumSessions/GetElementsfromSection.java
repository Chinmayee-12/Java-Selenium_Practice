package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsfromSection {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//List<WebElement>panelLinks=driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		//System.out.println(panelLinks.size());
		//for(WebElement e: panelLinks) {
		//	String text=e.getText();
			//System.out.println(text);
		//}
		
		By rightpanelLinks=By.xpath("//aside[@id='column-right']//a");
		List<String> rightEleList=getElementTextList(rightpanelLinks);
		System.out.println(rightEleList);
		System.out.println(rightEleList.contains("Login"));
		System.out.println(rightEleList.contains("News Letter"));

	}
	
	public static List<String> getElementTextList(By locator) {
		List<String> eleTextList= new ArrayList<String>();
		List<WebElement> eleList=getElements(locator);
		for(WebElement e: eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
