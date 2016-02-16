package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class DropdownTesting4 {

	
	public static void main(String[] args) {
		/*ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);*/
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://goair.in");
		WebElement fromdrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		Sleeper.sleepTightInSeconds(3);
		List<WebElement> dropdown=fromdrop.findElements(By.tagName("option"));
		
		Sleeper.sleepTightInSeconds(3);
		for(int i=0;i<dropdown.size();i++)
		{
			String city=dropdown.get(i).getText();
			dropdown.get(i).click();
			Sleeper.sleepTightInSeconds(1);
			WebElement todrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			if(todrop.getText().contains(city))
			{
				System.out.println(city+" is not working correectly");
			}
			else
			{
				System.out.println(city+" is  working correectly");
			}
		}
		System.out.println("abc");
	}

}
