package seleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class ElelemntUtil {
	 private WebDriver driver;
	 
	 public ElelemntUtil(WebDriver driver) {
		 this.driver= driver;
	 }
	 
	 public  WebElement getElement(By locator) {
		 return presenceOfElementVisible(locator,10);
			//return driver.findElement(locator);
		}
	 
	 public List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
	 
	
	public void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
		
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	public void dogetText(By locator) {
		getElement(locator).getText();
	}
	
	public boolean doIsdisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String getElementAttrs(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	public void getElementAttr(By locator, String attrname) {
		List<WebElement> elelist=getElements(locator);
		for(WebElement e: elelist) {
		String attrvalue=e.getAttribute(attrname);
		System.out.println(attrvalue);
		}
	}
	public int getTotalElementsCount(By locator) {
		int elecount= getElements(locator).size();
		System.out.println("link is" +locator + elecount);
		return elecount;
	}
	
	public List<String> getElementTextList(By locator) {
		List<String> eleTextList= new ArrayList<String>();
		List<WebElement> eleList=getElements(locator);
		for(WebElement e: eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;

}
	//dropdown ----------------select-------------
	
	public  void doSelectDropByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public  void doSelectDropByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public  void doSelectDropByVisisbleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public  List<WebElement> getDropDownOptionsList(By locator) {
		Select select= new Select(getElement(locator));
		return select.getOptions();
	}
	
	public  List<String> getDropdownOptionsTextlist(By locator) {
		List<WebElement> optionList=getDropDownOptionsList(locator);
		List<String> optiontextlist= new ArrayList<String>();
		for(WebElement e: optionList) {
		String text=e.getText();
		optiontextlist.add(text);
		}
		return optiontextlist;
	}
	
	
	public  void selectDropDownValue(By locator, String expectedValue) {
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
	public int gettotalDropdownOptions(By locator) {
		int optionscount= getDropDownOptionsList(locator).size();
		System.out.println("total options count"+optionscount);	
		return optionscount;

	}
	
	public void doSearch(By suggListlocator,String suggvalue) {
		List<WebElement>suggList=getElements(suggListlocator);
		System.out.println(suggList.size());
		for(WebElement e: suggList) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains(suggvalue)) {
				e.click();
				break;
			}
		}
	}
	
	//...............--------wait....................
	
	public  WebElement presenceOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**An expectation for checking that an element is present 
	 * on the DOM of a page and visible.Visibility means 
	 * that the element is not only displayed but also has a height and width that isgreater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return 
	 */
	
	public  WebElement presenceOfElementVisible(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public Alert waitForAlertPresence(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return	wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public  String getAlertText(int timeout) {
			return waitForAlertPresence(timeout).getText();
		}
		public  void getAcceptAlert(int timeout) {
			waitForAlertPresence(timeout).accept();
		}
		public  void getDismissAlert(int timeout) {
			waitForAlertPresence(timeout).dismiss();
		}
		
		public  void alertSendkeys(int timeout, String value) {
			waitForAlertPresence(timeout).sendKeys(value);
		}
		
		
		public String waitForTitleIsandFetch(int timeout, String value) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.titleIs(value));
			return driver.getTitle();

 }
 }
