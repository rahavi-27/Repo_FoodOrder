package com.online_food_ordering_system.ecom.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

		public String getdatafromexcel(String sheet,int row,int cell) throws Throwable, IOException {
			FileInputStream fis1=new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\Online_Food_Ordering_System.Framework\\configAppData\\TestScriptData.xlsx");
		    Workbook wb = WorkbookFactory.create(fis1);
		    Sheet sh= wb.getSheet(sheet);
		    Row rw = sh.getRow(row);
		    String data =rw.getCell(cell).toString();
		    return data;
		   
		}
}
