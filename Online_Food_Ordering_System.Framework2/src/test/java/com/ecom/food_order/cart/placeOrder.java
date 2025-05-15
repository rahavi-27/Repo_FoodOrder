package com.ecom.food_order.cart;

import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.HighLandsPagee;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;

public class placeOrder extends baseClass{
	@Test
	public void place_order() throws Throwable {
		Homepage hp = new Homepage(driver);
		Thread.sleep(3000);
		wLib.scrollByAmount(driver);
		hp.getchickendishLink().click();
		HighLandsPagee hlp = new HighLandsPagee(driver);
		wLib.scrollByAmount(driver, hlp.getCheckOutBtn());
		hlp.getAddToCartBtn().click();
	}

}
