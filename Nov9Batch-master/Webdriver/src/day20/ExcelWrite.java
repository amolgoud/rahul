package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		r=ws.getRow(0);
		c=r.getCell(2);
		c.setCellValue("day");
		
		
		r=ws.getRow(2);
		c=r.createCell(2);
		c.setCellValue("abc");
		
		
		r=ws.createRow(3);
		c=r.createCell(0);
		c.setCellValue("xyz");
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		wb.write(f1);
		wb.close();
		

	}

}
