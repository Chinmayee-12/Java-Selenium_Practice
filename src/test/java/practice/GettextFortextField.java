package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextFortextField {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement wb=driver.findElement(By.id("input-firstname"));
		wb.sendKeys("richahota");
	String name=wb.getAttribute("value");
		System.out.println(name);
		WebElement wb1=driver.findElement(By.id("input-lastname"));
		wb1.sendKeys(null);
		String val=wb1.getAttribute("value");
		System.out.println(val);
		

		
	}

}
