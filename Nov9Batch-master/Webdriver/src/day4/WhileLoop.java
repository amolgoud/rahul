package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WhileLoop {

	static FirefoxDriver driver;
	public static void main(String[] args) {
		
		int i=1;
		while(i<=5)
		{
			 driver=new FirefoxDriver();
			 
			 i=i+1;
		}
		driver.get("http://google.com");
		
		
	}

}


















