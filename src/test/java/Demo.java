import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='productinfo text-center']/a[@data-product-id='1']/i"))).build().perform();
	}

}
