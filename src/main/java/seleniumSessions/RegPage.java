package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browsername = "chrome";
		BrowserUtilone b = new BrowserUtilone();
		WebDriver driver =b.initDriver(browsername);
		b.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title =b.getPageTitle();
		System.out.println(title);
		By Firstname =By.id("input-firstname");
		By lastName =By.id("input-lastname");
		By email =By.id("input-email");
		By phone =By.id("input-telephone");
		By password =By.id("input-password");
		By confirmPass =By.id("input-confirm");
		
		ElementUtil1 i = new ElementUtil1(driver);
		i.sendKeys(Firstname, "richa");
		i.sendKeys(lastName, "hota");
		i.sendKeys(email, "chinmayeehota750@gmail.com");
		
		
	}

}
