package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NorthStreetpage {
	WebDriver driver;
	public NorthStreetpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
		@FindBy(xpath="(//input[@type='submit'])[1]")
		private WebElement yorkshireAddToCart;
		
		@FindBy(xpath="(//input[@type='submit'])[2]")
		private WebElement lobsterAddToCart;
		
		@FindBy(xpath="(//input[@type='submit'])[3]")
		private WebElement stuffedAddToCart;
		
		@FindBy(xpath="//a[text()='Checkout']")
		private WebElement checkOutBtn;
		
		@FindBy(xpath="//i[@class='fa fa-trash pull-right']/parent::a//i")
		private WebElement deleteBtn;
		
		@FindBy(xpath="(//input[@name='quantity'])[position()=2]")
		private WebElement qtyLobsterField;
		
		@FindBy(xpath="(//input[@id='example-number-input']/ancestor::div[@class='widget-body']//input)[position()=1]")
		private WebElement actualquan;
		
		
	
		public WebElement getActualquan() {
			return actualquan;
		}

		public WebElement getYorkshireAddToCart() {
			return yorkshireAddToCart;
		}

		public WebElement getLobsterAddToCart() {
			return lobsterAddToCart;
		}

		public WebElement getStuffedAddToCart() {
			return stuffedAddToCart;
		}

		public WebElement getCheckOutBtn() {
			return checkOutBtn;
		}

		public WebElement getDeleteBtn() {
			return deleteBtn;
		}

		public WebElement getQtyLobsterField() {
			return qtyLobsterField;
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
