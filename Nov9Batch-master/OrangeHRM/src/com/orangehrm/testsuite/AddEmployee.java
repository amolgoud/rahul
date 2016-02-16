package com.orangehrm.testsuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pageobjects.AddEmployeePage;
import com.orangehrm.pageobjects.Menu;

public class AddEmployee  extends Constants{
	@Test
	public void addEmployeeTest() throws IOException
	{
		Menu menu=PageFactory.initElements(driver,Menu.class);
		AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
		int rowCount=eo.getRowCount(empList,0);
		String runMode=eo.getCellData(dataengine,0,2,2);
		if(runMode.equals("N"))
			throw new SkipException("AddEmpl test case skipped");
		for(int i=1;i<=rowCount;i++)
		{
			Row r=eo.getRowData(empList, 0,i);
			menu.pim();
			aep.addEmployee(r);
		}
	}
		
	

}
