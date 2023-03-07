package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		By country=By.id("Form_getForm_Country");
		By option=By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> op=driver.findElements(option);
		System.out.println(op.size());
		for(WebElement e: op) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Aruba")) {
				e.click();
				break;
			}
		}
		

	}

}
