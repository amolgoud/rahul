package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderAutomation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/flights/international/results?from=HYD&to=ISB&depart_date=18/12/2015&adults=1&childs=0&infants=0&class=Economy&airline=&carrier=&intl=y&sd=1449196230088&domain=www.cleartrip.com&countryCode=in&channel=B2C&tripType=OneWay&price=76572-134641&tripDuration=7-43&layoverDuration=0-24");
	}
	@Test
	public void sliderTest()
	{
		Actions action=new Actions(driver);
		Sleeper.sleepTightInSeconds(7);
		WebElement slider=driver.findElement(By.xpath("//*[@id='ResultContainer_1_1']/section[2]/section/aside[1]/div[1]/form/div/div[2]/div/div/a[1]"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"--"+y);
		action.dragAndDropBy(slider, x, 45).build().perform();
		//action.doubleClick(Webelement).build().perform();
	}

}
