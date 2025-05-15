package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HighLandsPagee {
	WebDriver driver;

	public HighLandsPagee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement addToCartBtn;
	
	@FindBy(linkText="Checkout")
	private WebElement checkOutBtn;
	
	@FindBy(name="quantity")
	private WebElement qtyBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

	public WebElement getQtyBtn() {
		return qtyBtn;
	}
	
	
}
