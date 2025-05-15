package com.ecom.food_order.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.online_food_ordering_system.ecom.generic.fileutility.ExcelUtility;
import com.online_food_ordering_system.ecom.generic.fileutility.fileUtility;
import com.online_food_ordering_system.ecom.generic.webdriverutility.WebDriverUtility;
import com.online_food_ordering_system.ecom.ojectrepository.Homepage;
import com.online_food_ordering_system.ecom.ojectrepository.Loginpage;

public class baseClass {
	public fileUtility flib = new fileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public WebDriver driver = null;
	public static WebDriver sDriver = null;
	
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("Connect to dB");
	}

	@BeforeClass
	public void launchBrowser() throws Throwable {
		String BROWSER = flib.getdatafromproperties("browser");
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		sDriver=driver;
		driver.manage().window().maximize();
		
	}

	@BeforeMethod
	public void loginToApplication() throws Throwable {
		String URL = flib.getdatafromproperties("url");
		String USERNAME = flib.getdatafromproperties("username");
		String PASSWORD = flib.getdatafromproperties("password");
		driver.get(URL);
		Homepage hp = new Homepage(driver);
		hp.getLoginlink().click();
		Loginpage lp = new Loginpage(driver);
		lp.loginToApplication(USERNAME, PASSWORD);
		wLib.waitForPageLoad(driver);
	}

	@AfterMethod
	public void logoutFromApplication() {
		Homepage hp = new Homepage(driver);
		hp.getLogoutlink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@AfterSuite
	public void configAfterSuite() {
		System.out.println("Close dB");
	}
}
