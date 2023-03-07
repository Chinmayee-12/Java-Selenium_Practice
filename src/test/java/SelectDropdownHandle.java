import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		By link=By.xpath("//div[@id='SIvCob']/a");
		//clickSpecificLangLink(link,"मराठी");
		if(listOfLangLinks(link).contains("বাংলা")){
			System.out.println("right lang");
		}
		/*
		 * System.out.println(lb.size()); for(WebElement e: lb) { String
		 * text=e.getText(); System.out.println(text); if(text.equals("मराठी")) {
		 * e.click(); break; } }
		 */
	}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		public static void clickSpecificLangLink(By locator, String value) {
			List<WebElement> lb=getElements(locator);
			System.out.println(lb.size());
			for(WebElement e: lb) {
				String text=e.getText();
				System.out.println(text);
				if(text.equals(value)) {
				e.click();
				break;
				}
			}
		}
		
		public static List<String> listOfLangLinks(By locator) {
			List<WebElement> le=getElements(locator);
			System.out.println(le.size());
			List<String> l=new ArrayList<String>();
			for(WebElement e: le) {
				String text=e.getText();
				l.add(text);
			}
			return l;
		}
			
	}


