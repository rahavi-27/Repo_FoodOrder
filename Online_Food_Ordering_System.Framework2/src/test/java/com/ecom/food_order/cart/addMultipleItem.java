package com.ecom.food_order.cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.NorthStreetpage;

public class addMultipleItem extends baseClass{
	@Test
	public void add_MultipleItem() throws Throwable {
		wLib.waitForPageLoad(driver);
		Homepage hp = new Homepage(driver);
		wLib.scrollByAmount(driver,hp.getGamberonidishLink());
		hp.getLobsterdishLink().click();
		NorthStreetpage np = new NorthStreetpage(driver);
		wLib.scrollByAmount(driver,np.getStuffedAddToCart());
		String qty = elib.getdatafromexcel("food", 1, 1);
		np.getQtyLobsterField().clear();
		np.getQtyLobsterField().sendKeys(qty);
		wLib.scrollByAmount(driver,np.getLobsterAddToCart());
		np.getLobsterAddToCart().click();
		wLib.scrollByAmount(driver, np.getStuffedAddToCart());
	    String actQty=np.getActualquan().getText();
		System.out.println("Actual Quantity added"+actQty);
		Assert.assertEquals(actQty,qty);
		
	   }
	}
