package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Help_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
public class Help_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
	
    @Given("^Initialize the driver with firefox browser for help$")
    public void initialize_the_driver_with_firefox_browser_for_help() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User clicks on help button$")
    public void user_clicks_on_help_button() throws Throwable {
    	Help_page hp= new Help_page(driver);
		hp.clickhome().click();
    }
    @Then("^Check for Help keyword in the title$")
    public void check_for_Help_keyword_in_the_title() throws Throwable {
    	Help_page hp= new Help_page(driver);
    	String q=hp.validate();
		if(q.contains("Help"))
		{
			System.out.println("Title validated");
			Log.info("Help is present in the title");
		}
		driver.close();
    }

}