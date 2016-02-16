package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathCreation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		String x=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
		System.out.println(x);
	}

}
