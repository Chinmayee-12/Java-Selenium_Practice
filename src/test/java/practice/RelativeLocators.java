package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		
		WebElement w=driver.findElement(By.linkText("Estevan, Canada"));
		
		String rightindexValue=driver.findElement(with(By.tagName("p")).toRightOf(w)).getText();
		System.out.println(rightindexValue);// not getting exact index value
		String left=driver.findElement(with(By.tagName("p")).toLeftOf(w)).getText();
		System.out.println(left);
		String above=driver.findElement(with(By.tagName("p")).above(w)).getText();
		System.out.println(above);
		
	}
	

	

}
