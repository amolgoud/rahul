package com.orangehrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pageobjects.Menu;

public class Logout extends Constants {
	
	@Test
	public void logoutTest() throws IOException
	{
		String runMode=eo.getCellData(dataengine,0,4,2);
		if(runMode.equals("N"))
			throw new SkipException("Logout test case skipped");
		Menu menu=PageFactory.initElements(driver,Menu.class);
		Sleeper.sleepTightInSeconds(4);
		menu.logout();
	}

}
