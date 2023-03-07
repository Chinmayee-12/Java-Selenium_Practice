package seleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allelements {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
	By country=	By.id("Form_getForm_Country");
	/*
	 * Select select= new Select(driver.findElement(country)); List<WebElement>
	 * lb=select.getOptions(); System.out.println(lb.size()-1); for(WebElement e:
	 * lb) { String text=e.getText(); System.out.println(text);
	 * if(text.equals("Brazil")) { e.click(); break; } }
	 */
	if(getTotaldropoptions(country)-1==232) {
		System.out.println("dropdown count is correct");
	}
	if(getdropdownOptionsTextlist(country).contains("India")) {
		System.out.println("india is preseent");
	}
	List<String> c=Arrays.asList("India", "Brazil", "Belgium");
	if(getdropdownOptionsTextlist(country).containsAll(c)) {
		System.out.println("pass country");
	}
	selectDropValue(country, "North Korea");
	
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getDropdownOptionsList(By locator) {
		Select select= new Select(getElement(locator));
		return select.getOptions();
	}
	
	
	public static List<String> getdropdownOptionsTextlist(By locator) {
		List<WebElement> b=getDropdownOptionsList(locator);
		List<String> options= new ArrayList<String>();
		for(WebElement e: b) {
			String text=e.getText();
			options.add(text);
		}
		return options;
		
	}
	
	
	public static void selectDropValue(By locator, String expvalue) {// without select by value we can use it
		List<WebElement> l=getDropdownOptionsList(locator);
		for(WebElement e: l) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(expvalue)) {
				e.click();
				break;
			}
		}
	}
	public static int getTotaldropoptions(By locator) {
		
		int siz=getDropdownOptionsList(locator).size();
		System.out.println(siz);
		return siz;
}
}
