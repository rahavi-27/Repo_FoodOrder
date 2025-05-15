package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
  WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="(//a[@class='nav-link active'])[position()=1]")
	private WebElement homelink;
	@FindBy(xpath ="(//a[@class='nav-link active'])[position()=2]")
	private WebElement restaurantslink;
	@FindBy(xpath ="(//a[@class='nav-link active'])[position()=3]")
	private WebElement loginlink;
	@FindBy(xpath ="(//a[@class='nav-link active'])[position()=4]")
	private WebElement registerlink;
	@FindBy(xpath="(//a[@class='nav-link active'])[position()=3]")
	private WebElement myorderlink;
	
	@FindBy(xpath ="(//a[@class='nav-link active'])[position()=4]")
	private WebElement logoutlink;
	
	@FindBy(xpath ="(//div[@class='container']//a[@class='btn theme-btn-dash pull-right'])[3]")
	private WebElement chickendishLink;
	
	@FindBy(xpath ="(//div[@class='container']//a[@class='btn theme-btn-dash pull-right'])[2]")
	private WebElement LobsterdishLink;
	@FindBy(xpath ="(//div[@class='container']//a[@class='btn theme-btn-dash pull-right'])[1]")
	private WebElement YorkshiredishLink;
	@FindBy(xpath ="(//div[@class='container']//a[@class='btn theme-btn-dash pull-right'])[4]")
	private WebElement StuffedpotatodishLink;
	@FindBy(xpath ="(//div[@class='container']//a[@class='btn theme-btn-dash pull-right'])[5]")
	private WebElement GamberonidishLink;
	@FindBy(xpath ="(//div[@class='container']//a[@class='btn theme-btn-dash pull-right'])[6]")
	private WebElement cheesypotatodishLink;
	
	
	public WebElement getHomelink() {
		return homelink;
	}
    public WebElement getRestaurantslink() {
		return restaurantslink;
	}
    public WebElement getLoginlink() {
		return loginlink;
	}
    public WebElement getRegisterlink() {
		return registerlink;
	}
    
	
    public WebElement getMyorderlink() {
		return myorderlink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
    public WebElement getchickendishLink() {
		return chickendishLink;
	}
	public WebElement getLobsterdishLink() {
		return LobsterdishLink;
	}
	public WebElement getYorkshiredishLink() {
		return YorkshiredishLink;
	}
	public WebElement getStuffedpotatodishLink() {
		return StuffedpotatodishLink;
	}
	public WebElement getGamberonidishLink() {
		return GamberonidishLink;
	}
	public WebElement getCheesypotatodishLink() {
		return cheesypotatodishLink;
	}
	public WebDriver getDriver() {
		return driver;
	}
    

	
	
	
}
