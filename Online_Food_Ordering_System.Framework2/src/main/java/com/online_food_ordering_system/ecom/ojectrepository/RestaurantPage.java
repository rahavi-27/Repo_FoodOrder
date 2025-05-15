package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantPage {
	WebDriver driver;
	public RestaurantPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="(//div[@class='bg-gray restaurant-entry']//a[@class='btn btn-purple'])[position()=1]")
	private WebElement northstreetmenu;
	@FindBy(xpath ="(//div[@class='bg-gray restaurant-entry']//a[@class='btn btn-purple'])[position()=2]")
	private WebElement eatalymenu;
	@FindBy(xpath ="(//div[@class='bg-gray restaurant-entry']//a[@class='btn btn-purple'])[position()=4]")
	private WebElement highlandsmenu;
	
	public WebElement getNorthstreetmenu() {
		return northstreetmenu;
	}
	public WebElement getEatalymenu() {
		return eatalymenu;
	}
	public WebElement getHighlandsmenu() {
		return highlandsmenu;
	}
	

}
