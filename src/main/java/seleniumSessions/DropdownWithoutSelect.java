package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		By country=By.id("Form_getForm_Country");
		By options=By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> optionslist=driver.findElements(options);
		System.out.println(optionslist.size());
		for(WebElement e: optionslist) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
	}

}
