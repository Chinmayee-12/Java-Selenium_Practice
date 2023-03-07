import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium. support.locators.RelativeLocator.with;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Frame {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pId=driver.getWindowHandle();
		
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		WebElement w1=driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement w2=driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		w.click();
		w1.click();
		w2.click();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		while(it.hasNext()) {
			String wId=it.next();
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			if(!wId.equals(pId)) {
			driver.close();
			}
		}
		driver.switchTo().window(pId);
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
		
			
		}
		
		
		
	}


