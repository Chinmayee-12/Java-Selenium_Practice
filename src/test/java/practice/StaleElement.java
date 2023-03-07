package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement wb=driver.findElement(By.id("input-firstname"));
				wb.sendKeys("richa");
		driver.navigate().refresh();
		 wb=driver.findElement(By.id("input-firstname"));

		wb.sendKeys("hota");
		
	}

}
