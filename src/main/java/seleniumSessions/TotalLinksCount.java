package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksCount {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int linkSize=list.size();
		System.out.println(linkSize);
		/*
		 * for(int i=0; i<linkSize; i++) { String s=list.get(i).getText();
		 * if(s.length()>0) { System.out.println(s); }
		 */
			
		//}
		int count =0;
		for(WebElement e: list) {
			String text=e.getText();
			if(text.length()>0) {
				System.out.println(count+text);
			}
			count++;
		}
	}

}
