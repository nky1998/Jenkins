package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Bar_page;
import resources.Base;

public class Bar extends Base {
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
	public void AC_storage()throws IOException
	{
		Bar_page bp= new Bar_page(driver);
		bp.clickstorage().click();
		Log.info("Click On Storage");
	}
	
	@Test
	public void C_Bar()throws IOException
	{
		Bar_page bp= new Bar_page(driver);
		bp.clickbar().click();
		Log.info("Click On Bar Cabinets");
	}
	
	@Test
	public void C_check()throws IOException
	{
		Bar_page bp= new Bar_page(driver);
		bp.checkbox().click();
		Log.info("Mark Checkbox");
		driver.close();
	}
}