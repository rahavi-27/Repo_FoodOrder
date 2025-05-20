package com.ecom.food_order.cart;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ecom.food_order.baseclass.baseClass;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.NorthStreetpage;

public class addMultipleItem extends baseClass{
	@Test
	public void add_MultipleItem() throws Throwable {
		wLib.waitForPageLoad(driver);
		Homepage hp = new Homepage(driver);
		Reporter.log("Home page is displayed",true);
		wLib.scrollByAmount(driver,hp.getGamberonidishLink());
		hp.getLobsterdishLink().click();
		Reporter.log("gamberoni dish is clicked",true);
		NorthStreetpage np = new NorthStreetpage(driver);
		Reporter.log("Navigated to north street restaurant page",true);
		wLib.scrollByAmount(driver,np.getStuffedAddToCart());
		String qty = elib.getdatafromexcel("food", 1, 1);
		np.getQtyLobsterField().clear();
		Reporter.log("lobster quantity field is cleared",true);
		np.getQtyLobsterField().sendKeys(qty);
		Reporter.log("qty is added",true);
		wLib.scrollByAmount(driver,np.getLobsterAddToCart());
		Reporter.log("dish added to cart",true);
		np.getLobsterAddToCart().click();
		wLib.scrollByAmount(driver, np.getStuffedAddToCart());
	    String actQty=np.getActualquan().getText();
		System.out.println("Actual Quantity added"+actQty);
		Assert.assertEquals(actQty,qty);
		
	   }
	}
