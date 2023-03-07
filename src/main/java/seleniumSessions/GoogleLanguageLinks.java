package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> langLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langLinks.size());
		for(int i=0; i<langLinks.size();i++) {
			langLinks.get(i).click();
			langLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			
			//if(text.equals("मराठी")) {
				//e.click();
				//break;
			}
			
		}
	}


