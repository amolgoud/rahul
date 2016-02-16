package com.orangehrm.testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.Screenshots;

public class Constants {
	static RemoteWebDriver driver=null;
	DesiredCapabilities cap=null;
	ExcelOperations eo=new ExcelOperations();
	Screenshots scr=new Screenshots();
	String empList="E:\\Nov9Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String scrPath="E:\\Nov9Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots";
	String dataengine="E:\\Nov9Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}
