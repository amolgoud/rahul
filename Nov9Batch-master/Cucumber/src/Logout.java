

import org.junit.Test;
import org.openqa.selenium.By;


public class Logout  extends Constants{
	@Test
	public void logoutTest()
	{
		driver.findElement(By.id("welcome")).click();
		//xpath of logout
		driver.findElement(By.xpath
				("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
	}

}







