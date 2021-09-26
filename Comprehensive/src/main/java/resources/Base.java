package resources;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.*;
public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver initializeDriver() throws IOException
	{
		//Chrome
		//Firefox
		//IE
		prop= new Properties();
		FileInputStream fis= new FileInputStream("D:\\MINDTREE\\E2Eproject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\DRIVERS\\geckodriver.exe");
			driver= new FirefoxDriver();
			
			return driver;
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			//CHROME CODE
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			//IE CODE
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	public static void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://SCREENSHOTS//"+result+"screenshot.png"));
	}
}