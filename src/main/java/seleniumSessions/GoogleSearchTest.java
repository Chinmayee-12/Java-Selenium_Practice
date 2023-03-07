package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		
		Thread.sleep(2000);
		
		By googleSugglist=By.xpath("//li[@role='presentation']");
		doSearch(googleSugglist,"naveen automation labs github");
	}
	
	
	public static void doSearch(By suggListlocator,String suggvalue) {
		List<WebElement>suggList=driver.findElements(suggListlocator);
		System.out.println(suggList.size());
		for(WebElement e: suggList) {
			String text=e.getText();
			
			if(text.length()>0) {
				System.out.println(text);
			}
			if(text.contains(suggvalue)) {
				e.click();
				break;
			}
		}
	}

}
