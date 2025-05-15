package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummaryPage {
	WebDriver driver;
	public CartSummaryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement ordernowbtn;
	
	public WebElement getOrdernowbtn() {
		return ordernowbtn;
	}
}
