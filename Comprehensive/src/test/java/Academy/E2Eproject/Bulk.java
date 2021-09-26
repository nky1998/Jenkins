package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Bulk_page;
import resources.Base;

public class Bulk extends Base {
public static Logger Log= LogManager.getLogger(validatetitle.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
	}
	
	@Test
	public void A_Bulk()throws IOException
	{
		Bulk_page bp= new Bulk_page(driver);
		bp.clickbulk().click();
		Log.info("Click On Bulk orders");
	}
	
	
	@Test
	public void BulkText()throws IOException, InterruptedException
	{
		Bulk_page bp= new Bulk_page(driver);
		String t=bp.get_title();
		System.out.println("Title of the Bulk orders page is"+t);
		Log.info("Printed the title of the page");
		driver.close();
	}
}
