package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathcreation2 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://eenadu.net");
		driver.findElement(By.xpath("//a[@href='Homeinner.aspx?item=break65']")).click();

	}

}
