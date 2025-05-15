package com.ecom.food_order.cart;

import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;

public class viewOrderHistory extends baseClass{
	@Test
	public void view_order_history() throws Throwable {
		Thread.sleep(3000);
		Homepage hp = new Homepage(driver);
		hp.getMyorderlink().click();
		System.out.println("history viewed");
		Thread.sleep(3000);

	}

}
