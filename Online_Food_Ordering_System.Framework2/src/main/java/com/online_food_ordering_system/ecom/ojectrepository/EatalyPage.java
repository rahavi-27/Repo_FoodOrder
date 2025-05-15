package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EatalyPage {
	 WebDriver driver;
		public EatalyPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath ="(//div[@class='food-item']//input[@type='submit'])[position()=1]")
		private WebElement gamberoniAddtoCart;
		@FindBy(xpath ="(//div[@class='food-item']//input[@type='submit'])[position()=2]")
		private WebElement cheeshypotatoaddToCart;
		@FindBy(xpath ="//div[@class='widget widget-cart']//a[text()='Checkout']")
		private WebElement checkoutbtn;
		
		public WebElement getGamberoniAddtoCart() {
			return gamberoniAddtoCart;
		}
		public WebElement getCheeshypotatoaddToCart() {
			return cheeshypotatoaddToCart;
		}
		public WebElement getCheckoutbtn() {
			return checkoutbtn;
		}
		
		

}
