package Academy.E2Eproject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
public class App {
	public static void main(String args[]) throws IOException
	{
		initializeDriver();
	}
	public static void initializeDriver() throws IOException
	{
		//Chrome
		//Firefox
		//IE
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("D:\\MINDTREE\\E2Eproject\\src\\main\\java\\Academy\\E2Eproject\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\MINDTREE\\Training\\SDET'\\SELENIUM\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("http://facebook.com");
		}
	}

}