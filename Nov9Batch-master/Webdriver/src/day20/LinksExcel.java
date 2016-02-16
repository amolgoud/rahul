package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinksExcel {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	@Test
	public void linksTest() throws IOException
	{
		FileInputStream f=new FileInputStream("c:\\users\\sai\\desktop\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			r=ws.createRow(i);
			if(links.get(i).isDisplayed())
			{
				r.createCell(0).setCellValue(links.get(i).getText());
				links.get(i).click();
				r.createCell(1).setCellValue(driver.getCurrentUrl());
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
		}
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\links.xlsx");
		wb.write(f1);
		wb.close();
		
		
	}

}
