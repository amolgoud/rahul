package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownTesting4 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://expedia.in");
		driver.findElement(By.id("hotel-1-children")).sendKeys("4");
		driver.findElement(By.id("hotel-destination")).click();
		WebElement block=driver.findElement(By.id("hotel-1-children-ages"));
		List<WebElement> dropdown=block.findElements(By.tagName("select"));
		System.out.println(dropdown.size());
	}

}
