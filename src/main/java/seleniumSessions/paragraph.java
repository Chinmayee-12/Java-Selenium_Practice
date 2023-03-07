package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paragraph {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
	List<WebElement>para=driver.findElements(By.tagName("p"));
	int parasize=para.size();
	System.out.println(parasize);
	for(WebElement e: para) {
		String paratext=e.getText();
		System.out.println(paratext);
	}
	}

}
