

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AddEmployee extends Constants {
	@Test
	public void addEmpoyeeTest()
	{
		Actions action=new Actions(driver);
		WebElement pim=driver.findElement(By.xpath
				         ("//*[@id='menu_pim_viewPimModule']/b"));
		action.moveToElement(pim).build().perform();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Sai");
		driver.findElement(By.id("middleName")).sendKeys("Krishna");
		driver.findElement(By.id("lastName")).sendKeys("g");
		driver.findElement(By.id("employeeId")).sendKeys("111");
		driver.findElement(By.id("btnSave")).click();
		
	}

}

