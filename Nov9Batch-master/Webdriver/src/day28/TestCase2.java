package day28;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day28.pom.Menu;
import day28.pom.RegisterMercuryTours;
import day28.pom.WelcomeMercuryTours;

public class TestCase2 {
	@Test
	public void registrationTest()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		RegisterMercuryTours rm=PageFactory.initElements(driver,RegisterMercuryTours.class);
		wm.register();
		rm.contactInformation();
		Menu menu=PageFactory.initElements(driver,Menu.class);
		menu.home();
		wm.findAFight("tutorial","tutorial");
		
	}

}
