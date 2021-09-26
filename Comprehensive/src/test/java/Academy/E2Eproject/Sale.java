package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Sale_page;

import resources.Base;

public class Sale extends Base {
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
	public void Sale_f()throws IOException
	{
		Sale_page sp= new Sale_page(driver);
		sp.clicksale().click();
		sp.Allproducts().click();
		System.out.println("Total number of products available on discount are:  "+sp.Count().getText());
		driver.close();
	}
}