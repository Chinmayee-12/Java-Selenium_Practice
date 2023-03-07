package practice;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement tw=driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		tw.click();
		Set<String> id=	driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String parentid=it.next();
		System.out.println(parentid);
		String childid=it.next();
		System.out.println(childid);
		driver.switchTo().window(childid);
		System.out.println("child window id" + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentid);
		System.out.println("parent windowid"+ parentid);
		driver.quit();
	}

}
