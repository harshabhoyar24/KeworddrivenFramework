package com.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Keyword {
	
	/**
	 * Opens Specified web browser.
	 * @param browserName.Browser name should includ Chrome,Firefox,IE,Safari.
	 *  no browsername apart from mentioned is allowed
	 */
	public static void openBrowser(String browserName) {
		
		switch(browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver=new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			 Constant.driver=new FirefoxDriver();
			break;
		case "IE":
			break;
		case "Safari":
			break;
			default:
System.out.println("Invalid browser name:"+browserName);


		}
		
	}
	/**
	 * It opens the specified url in web Browser recently opened by
	 * driver instance.
	 * 
	 * @param url{@code String} url to open
	 * return void
	 * @throws InterruptedException 
	 */
	/*public static void implicitWait(long seconds) {
		Constant.driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
		
	}*/
	public static void openURL(String url) throws InterruptedException {
		Constant.driver.get(url);
	Thread.sleep(10);
	}
	public static WebElement getWebelement(String locatorType,String locatorValue) {
		WebElement element=null;
		switch(locatorType){
		case "XPATH":
			element=Constant.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element=Constant.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element=Constant.driver.findElement(By.id(locatorValue));
			break;
		case "LINKTEXT":
			element=Constant.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIALLINKTEXT":
			element=Constant.driver.findElement(By.partialLinkText(locatorValue));
			break;
			
		case "CLASS":
			element=Constant.driver.findElement(By.className(locatorValue));
			break;
			default:
				System.out.println("Invalid Locator Type" );
				break;
				
		}
		return element;
	} 
	
	public static void enterText(String locatorType,String locatorValue,String textToEnter ) throws InterruptedException {
		
		getWebelement(locatorType, locatorValue).sendKeys(textToEnter);
	
		Thread.sleep(10);	
		}
	public static void clickOnElement(String locatorType,String locatorValue) throws InterruptedException {
		
		getWebelement(locatorType,locatorValue).click();
		Thread.sleep(10);
	}
		
	public static void selectValueFromDropdown(String locatorType,String locatorValue,String textToSelect) throws InterruptedException {
		WebElement element=getWebelement(locatorType, locatorValue);
		Select select=new Select(element);
		select.selectByVisibleText(textToSelect);
		Thread.sleep(10);
	}
	
	public static void maximizeBrowser() throws InterruptedException {
		Constant.driver.manage().window().maximize();
		Thread.sleep(10);
	}
	public static void closeBrowser() throws InterruptedException {
		Constant.driver.close();
		Thread.sleep(10);
	}
	public static void closeAllBrowser() throws InterruptedException {
		Constant.driver.quit();
		Thread.sleep(10);
	}
}
	
	
	
	
	

























			
		
		
		
	


