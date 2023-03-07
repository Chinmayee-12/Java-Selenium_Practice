package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footersection {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List <WebElement> list=driver.findElements(By.xpath("//h5[text()='Information']/following-sibling::ul//a"));
		for(WebElement e: list) {
			String text=e.getText();
			System.out.println(text);
		}
		List<String> info=footersection("Customer Service");
		System.out.println(info);
		
	}
	
	
	public static List<String> footersection(String sectionName) {
		List <WebElement> list
		=driver.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling::ul//a"));
		System.out.println(list.size());
		List<String> l=new ArrayList<String>();
		for(WebElement e: list) {
			String text=e.getText();
			l.add(text);
			//System.out.println(text);
		}
		return l;

	}

}
