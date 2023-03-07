package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(args);
		
		
		//(//a[contains(text(), 'Ali khan')])[2]/../preceding-sibling::td/input[@type='checkbox']// xpath for crmpro contact
	}

}
