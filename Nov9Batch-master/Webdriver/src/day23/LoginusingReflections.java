package day23;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginusingReflections {
	LoginKeywords keys=new LoginKeywords();
	Method [] mymethods=keys.getClass().getMethods();
	
	@Test
	public void loginTest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
		FileInputStream f=new FileInputStream("E:\\Nov9Batch\\Webdriver\\src\\com\\qedge\\keywords\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			invokeMethods(action);
	    }
	}
	public void invokeMethods(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<mymethods.length;i++)
		{
			if(mymethods[i].getName().equals(action))
			{
				mymethods[i].invoke(keys);
				break;
			}
		}
	}

}
