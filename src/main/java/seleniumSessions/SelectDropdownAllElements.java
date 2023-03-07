package seleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllElements {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		//By country=By.id("Form_getForm_Country");
		//Select select= new Select(driver.findElement(country));
		//List<WebElement> countrylist=select.getOptions();
		//System.out.println(countrylist.size()-1);
		//for(WebElement e: countrylist) {
			//String text=e.getText();
			//System.out.println(text);
			//if(text.equals("Brazil")) {
			//	e.click();
				//break;
			//}
		//}
		By country=By.id("Form_getForm_Country");
		selectDropDownValue(country, "Kenya");
		//if(gettotalDropdownOptions(country)-1==232) {
		//	System.out.println("country dropdown count is correct");
		////}
		
	////if(	getDropdownOptionsTextlist(country).contains("India")) {
		//System.out.println("India");
	//}
	
	//List <String> expCountryList=Arrays.asList("India", "Brazil", "Belgium");
	//if(getDropdownOptionsTextlist(country).containsAll(expCountryList)) {
		//System.out.println("pass");
	//}
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select= new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static List<String> getDropdownOptionsTextlist(By locator) {
		List<WebElement> optionList=getDropDownOptionsList(locator);
		List<String> optiontextlist= new ArrayList<String>();
		for(WebElement e: optionList) {
		String text=e.getText();
		optiontextlist.add(text);
		}
		return optiontextlist;
	}
	
	
	public static void selectDropDownValue(By locator, String expectedValue) {
	List<WebElement> optionsList=	getDropDownOptionsList(locator);
	for(WebElement e: optionsList) {
		String text=e.getText();
		System.out.println(text);
		if(text.equals(expectedValue)) {
			e.click();
			break;
		}
	}
	}
	public static int gettotalDropdownOptions(By locator) {
		int optionscount= getDropDownOptionsList(locator).size();
		System.out.println("total options count"+optionscount);	
		return optionscount;

	}

}
