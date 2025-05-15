package com.online_food_ordering_system.ecom.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class DatabaseUtility {
    Connection conn;
	public void getDbConnection() throws Exception 
	{
			try
			{
		    Driver driref=new Driver();
		    DriverManager.registerDriver(driref);
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			}catch(Exception e) {
				
			}
			
	}
		
	public void getCloseDbConnection() 
	{
			try{
				conn.close();
			}catch(Exception e) {
				
			}
	}
		
	public ResultSet executeSelectQuery(String query) 
	{
	    	ResultSet result=null;
	    	try{Statement stat = conn.createStatement();
			result = stat.executeQuery(query);
	    	}catch(Exception e) {
	    	}
		    return result;
	}
	    	
     public int executeNonSelectQuery(String query) 
     {
	    	int result=0;
	    	try{
	    	Statement stat = conn.createStatement();
			result = stat.executeUpdate(query);
	    	}catch(Exception e) {
	    	}
		    return result;
	  }
		
		

	}



