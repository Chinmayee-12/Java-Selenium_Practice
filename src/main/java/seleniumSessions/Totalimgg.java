package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalimgg {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//String ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");
		//System.out.println(ph);	
		
		//String s=driver.findElement(By.className("img-responsive")).getAttribute("src");
		//System.out.println(s);
		
		By nm=By.name("firstname");
		By im=By.className("img-responsive");
		
	String phs=	getElementAttribute(nm,"placeholder");
	String j=getElementAttribute(im,"src");
	
	System.out.println(phs);
	System.out.println(j);
		
		}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	
	}
	
	
	public static String getElementAttribute(By locator, String atName) {
		return getElement(locator).getAttribute(atName);
	}
		
	}


