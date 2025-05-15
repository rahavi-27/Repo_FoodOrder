package com.ecom.foodorder_system.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.HighLandsPagee;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.NorthStreetpage;
import com.online_food_ordering_system.ecom.ojectrepository.CartSummaryPage;
import com.online_food_ordering_system.ecom.ojectrepository.EatalyPage;
import com.online_food_ordering_system.ecom.ojectrepository.MyOrdersPage;
import com.online_food_ordering_system.ecom.ojectrepository.RestaurantPage;
@Listeners(com.online_food_ordering_system.ecom.generic.listenerutility.ListImpClass.class)
public class Food_ordering_systemTest extends baseClass {
	@Test
	public void add_MultipleItem() throws Throwable {
		wLib.waitForPageLoad(driver);
		Thread.sleep(2000);
		Homepage hp = new Homepage(driver);
		wLib.scrollByAmount(driver);
		hp.getLobsterdishLink().click();
		NorthStreetpage np = new NorthStreetpage(driver);
		wLib.scrollByAmount(driver, np.getStuffedAddToCart());
		np.getQtyLobsterField().clear();
		String quan = elib.getdatafromexcel("food", 1, 1);
		np.getQtyLobsterField().sendKeys(quan);
		np.getLobsterAddToCart().click();

	}
	@Test
	public void cancel_the_order() throws Throwable {
		wLib.waitForPageLoad(driver);
		Thread.sleep(2000);
		Homepage hp = new Homepage(driver);
		hp.getMyorderlink().click();
		MyOrdersPage mp = new MyOrdersPage(driver);
		mp.getDeleteicon().click();
		driver.switchTo().alert().accept();
		System.out.println("order cancelled");
	}
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
	@Test
	public void view_menu_by_restaurant() throws Throwable {
		Homepage hp = new Homepage(driver);
		Thread.sleep(3000);
		wLib.scrollByAmount(driver);
		hp.getchickendishLink().click();
		System.out.println("menu displayed");
	}
	@Test
	public void view_order_history() throws Throwable {
		Thread.sleep(3000);
		Homepage hp = new Homepage(driver);
		hp.getMyorderlink().click();
		System.out.println("history viewed");
		Thread.sleep(3000);

	}

	

	

	

	

	

	

}