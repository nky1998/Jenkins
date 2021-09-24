

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Search_page;
import pageObjects.Stores_page;
import resources.Base;

public class excelutils extends Base {
	
	public static String s;
	public static void main(String args[])
	{
		getCellData(0,0);
	}

	public static void getCellData(int rownum , int colnum)
	{
		String projectpath;
		XSSFWorkbook workbook;
		try {
			projectpath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"\\Excel\\Excel_Read.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			s= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.print(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
