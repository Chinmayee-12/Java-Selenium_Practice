package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int count=getStatictablecount();
		System.out.println(count);
		
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[5]/td[1]
		
		String beforeXpath= "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath= "]/td[1]";
		for(int row=2; row<=5; row++) {
			String xpath= beforeXpath + row + afterXpath;
			System.out.println(xpath);
		String value=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(value);

		}
	}
	
	public static int getStatictablecount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	public static int getRowcount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size()-1;
		
	}
}

