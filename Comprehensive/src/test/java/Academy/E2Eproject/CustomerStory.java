package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CustomerStory_page;
import pageObjects.Gift_page;
import resources.Base;

public class CustomerStory extends Base {
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
	public void Customer()throws IOException
	{
		CustomerStory_page cp= new CustomerStory_page(driver);
		cp.clickstory().click();
	}
	
	
	@Test
	public void GiftText()throws IOException, InterruptedException
	{
		CustomerStory_page cp= new CustomerStory_page(driver);

		String t=cp.get_text();
		System.out.println("One of the Customer Story is :   "+t);
		driver.close();
	}
}
