package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Bulk_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Bulk_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for Bulk$")
    public void initialize_the_driver_with_firefox_browser_for_Bulk() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User clicks on Bulk Orders button$")
    public void user_clicks_on_bulk_orders_button() throws Throwable {
    	Bulk_page bp= new Bulk_page(driver);
		bp.clickbulk().click();
    }

    @Then("^Print the title$")
    public void print_the_title() throws Throwable {
    	Bulk_page bp= new Bulk_page(driver);
		String t=bp.get_title();
		System.out.println("Title of the Bulk orders page is"+t);
		driver.close();
    }

}
