package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttribute {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//String ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");
		//System.out.println(ph);
		//String srcValue=driver.findElement(By.className("img-responsive")).getAttribute("src");
		//String title=driver.findElement(By.className("img-responsive")).getAttribute("title");
		//System.out.println(srcValue +"---"+ title);
		By fn=By.name("firstname");
		By logo=By.className("img-responsive");
		By img=By.className("img-responsive");
		
		String ph=getElementAttrs(fn,"placeholder");
		String srcValue=getElementAttrs(logo,"src");
		System.out.println(ph);
		System.out.println(srcValue);

	}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}
public static String getElementAttrs(By locator, String attributeName) {
	return getElement(locator).getAttribute(attributeName);
}
}
