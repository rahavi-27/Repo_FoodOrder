package com.ecom.food_order.cart;

import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.CartSummaryPage;
import com.online_food_ordering_system.ecom.ojectrepository.EatalyPage;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.RestaurantPage;

public class placeOrderByRestaurant extends baseClass{
	@Test
	public void place_orderBy_restaurant() throws Throwable {
		Thread.sleep(2000);
		Homepage hp = new Homepage(driver);
		hp.getRestaurantslink().click();
		RestaurantPage rp = new RestaurantPage(driver);
		rp.getEatalymenu().click();
		wLib.scrollByAmount(driver);
		EatalyPage ep = new EatalyPage(driver);
		ep.getCheeshypotatoaddToCart().click();
		wLib.scrollByAmount(driver);
		ep.getCheckoutbtn().click();
		CartSummaryPage cp = new CartSummaryPage(driver);
		cp.getOrdernowbtn().click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		System.out.println("order  placed");

	}

}
