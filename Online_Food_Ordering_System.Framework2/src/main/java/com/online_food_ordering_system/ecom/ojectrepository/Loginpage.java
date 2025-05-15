package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	private WebElement usernametext;
	@FindBy(name = "password")
	private WebElement passwordtext;
	@FindBy(name = "submit")
	private WebElement loginbtn;

	public WebElement getUsernametext() {
		return usernametext;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void loginToApplication(String username,String password) {
        
		usernametext.sendKeys(username);
		passwordtext.sendKeys(password);
		loginbtn.click();
	}
}
