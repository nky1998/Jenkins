package Academy.E2Eproject;

import static org.testng.Assert.assertTrue;

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

import pageObjects.Help_page;
import resources.Base;

public class Help extends Base{
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
	public void Help_U()throws IOException
	{
		Help_page hp= new Help_page(driver);
		hp.clickhome().click();
		String q=hp.validate();
		if(q.contains("Help"))
		{
			System.out.println("Title validated");
		}
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	

}

