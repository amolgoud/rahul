package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakingScreenshot  extends Constants{
	
	@Test
	public void takeScreenshot() throws IOException
	{
		String runMode=eo.getCellData(dataengine,0,3,2);
		if(runMode.equals("N"))
			throw new SkipException("Screenshot test case skipped");
		scr.capturingScreenshot(driver,scrPath+"\\AddEmployee.png");
		
	}

}
