package com.ecom.food_order.cart;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.MyOrdersPage;

@Listeners(com.online_food_ordering_system.ecom.generic.listenerutility.ListImpClass.class)
public class cancelTheOrder extends baseClass {
	@Test
	public void cancel_the_order() throws Throwable {
		wLib.waitForPageLoad(driver);
		Thread.sleep(2000);
		Homepage hp = new Homepage(driver);
		hp.getMyorderlink().click();
		MyOrdersPage mp = new MyOrdersPage(driver);
        mp.getDeleteicon().click();
		driver.switchTo().alert().accept();
		
	}

}
