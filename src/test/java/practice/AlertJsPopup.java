package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopup {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();


		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		//String text=alert.getText();
		//System.out.println(text);
		alert.sendKeys("richa");
		alert.accept();
		//alert.dismiss();
	}

}
