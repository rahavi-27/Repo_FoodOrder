package com.online_food_ordering_system.ecom.ojectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {
	 WebDriver driver;
		public MyOrdersPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath ="(//table[@class='table table-bordered table-hover']//a[@class='btn btn-danger btn-flat btn-addon btn-xs m-b-10'])[position()=1]")
		private WebElement deleteicon;
		
		public WebElement getDeleteicon() {
			return deleteicon;
		}
		

}
