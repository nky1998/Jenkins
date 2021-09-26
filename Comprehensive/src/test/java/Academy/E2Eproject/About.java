package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.About_page;
import resources.Base;

public class About extends Base {
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
	public void AboutUs()throws IOException
	{
		About_page ap= new About_page(driver);
		ap.clickabout().click();
		Log.info("Click On About Us in footer");
	}
	
	@Test
	public void get_text()throws IOException
	{
		About_page ap= new About_page(driver);
		System.out.println(ap.getText().getText());
		driver.close();
	}
}
