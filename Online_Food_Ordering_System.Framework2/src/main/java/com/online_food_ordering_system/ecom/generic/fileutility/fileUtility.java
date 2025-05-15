package com.online_food_ordering_system.ecom.generic.fileutility;

import java.io.FileInputStream;
import java.util.Properties;

public class fileUtility {
	public String getdatafromproperties(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\Online_Food_Ordering_System.Framework\\configAppData\\Online_foodapp.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
	
}
