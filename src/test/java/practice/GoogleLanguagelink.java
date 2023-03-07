package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguagelink {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		Thread.sleep(3000);
		/*
		 * List<WebElement> wb=driver.findElements(By.xpath(
		 * "//li[@role='presentation']//div[@class='wM6W7d']/span")); int l=wb.size();
		 * System.out.println(l); for(WebElement e: wb) { String s= e.getText();
		 * System.out.println(s); if(s.contains("naveen automationlabs youtube")) {
		 * e.click(); break;
		 */
	//	}
		
		
		
		//}
		By googlesugglist=By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		doSearch(googlesugglist,"naveen automationlabs github");
	}
	
		
		
		public static void doSearch(By sugglist, String sugname) {
			List<WebElement> sug=driver.findElements(sugglist);
			System.out.println(sug.size());
			for(WebElement e: sug) {
				String s=e.getText();
				System.out.println(s);
				
				if(s.contains(sugname)) {
					e.click();
					break;
			
		}
	}

		}}
