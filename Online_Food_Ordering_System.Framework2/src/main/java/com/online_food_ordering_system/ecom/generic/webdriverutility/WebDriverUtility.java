package com.online_food_ordering_system.ecom.generic.webdriverutility;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void select(WebElement element,String text){
		Select sel=new Select(element);
	    sel.selectByVisibleText(text);
	    sel.selectByValue(text);
	}
	public void select(WebElement element,int index){
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
		public void moveToElement(WebDriver driver, WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void waitForPageLoad (WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * author: wait statement
	 */
	public void waitForElementToLoad(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void waitForElementToClick(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public void alertsAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertsDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void scrollByAmount(WebDriver driver) {
		Actions action = new Actions(driver);
		action.scrollByAmount(0,700).perform();
	}
	public void scrollByAmount(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
	}
	
	public void swtichToTabByUrl(WebDriver driver, String partialUrl) {
		Set<String> allWindows =driver.getWindowHandles();
		for(String value:allWindows) {
			driver.switchTo().window(value);
			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains(partialUrl)) {
				break;
			}
		}
		
	}
		
		public void swtichToTabByTitle(WebDriver driver, String partialTitle) {
			Set<String> allWindows =driver.getWindowHandles();
			for(String value:allWindows) {
				driver.switchTo().window(value);
				String title = driver.getTitle();
				if(title.contains(partialTitle)) {
					break;
				}
			}
	}
}
