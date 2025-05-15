package com.ecom.food_order.cart;

import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.NorthStreetpage;

public class removeItemFromCart extends baseClass{
	@Test
	public void remove_item_from_cart() throws Throwable {

		wLib.waitForPageLoad(driver);
		Thread.sleep(1000);
		Homepage hp = new Homepage(driver);
		wLib.scrollByAmount(driver);
		hp.getYorkshiredishLink().click();
		Thread.sleep(3000);
		NorthStreetpage np = new NorthStreetpage(driver);
		wLib.scrollByAmount(driver, np.getLobsterAddToCart());
		np.getYorkshireAddToCart().click();
		Thread.sleep(2000);
		wLib.scrollByAmount(driver, np.getLobsterAddToCart());
		np.getDeleteBtn().click();
		System.out.println("item removed from cart");

	}

}
