package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;



import resources.Base;

public class validatetitle extends Base{
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
	public void basePageNavigation()throws IOException
	{
		String p=driver.getTitle();
		if(p.endsWith("Urban Ladder"))
		{
			Assert.assertTrue(p.contains("Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder"));
			System.out.println("Successfully validated title of Urban Ladder");
			Log.info("Successfully validated title of Urban Ladder");
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	

}
