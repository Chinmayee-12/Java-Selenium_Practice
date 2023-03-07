package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindow=driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement tw=driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement fb=driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));

		WebElement li=driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		tw.click();
		fb.click();
		li.click();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		while(it.hasNext()) {
			String windowid=it.next();
			driver.switchTo().window(windowid);
			System.out.println("current url" +driver.getCurrentUrl());
			Thread.sleep(1500);
			if(!windowid.equals(parentWindow)) {
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("parent window"+ parentWindow);
		driver.quit();
		

	}

}
