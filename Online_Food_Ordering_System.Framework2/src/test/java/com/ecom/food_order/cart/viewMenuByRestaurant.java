package com.ecom.food_order.cart;

import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;

public class viewMenuByRestaurant extends baseClass{
	@Test
	public void view_menu_by_restaurant() throws Throwable {
		Homepage hp = new Homepage(driver);
		Thread.sleep(3000);
		wLib.scrollByAmount(driver);
		hp.getchickendishLink().click();
		System.out.println("menu displayed");
	}

}
