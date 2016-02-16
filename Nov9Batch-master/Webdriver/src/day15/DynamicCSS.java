package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicCSS {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/index.php/pim/addEmployee");
	}
	@Test
	public void CSSTest()
	{
		driver.findElement(By.cssSelector("input[id^='txtUser']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id$='ssword']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='nLog']")).click();
	}

}
