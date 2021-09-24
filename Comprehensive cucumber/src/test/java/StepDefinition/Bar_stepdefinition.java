package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Bar_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Bar_stepdefinition extends Base {
	
	public static Logger Log= LogManager.getLogger();

    @Given("^Initialize the driver with firefox browser for Bar$")
    public void initialize_the_driver_with_firefox_browser_for_bar() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User navigates on Bar cabinets  page$")
    public void user_navigates_on_bar_cabinets_page() throws Throwable {
    	Bar_page bp= new Bar_page(driver);
		bp.clickstorage().click();
		Log.info("Click On Storage");
		bp.clickbar().click();
		Log.info("Click On Bar Cabinets");
    }

    @Then("^Selects the checkbox Exclude Out of Stock$")
    public void selects_the_checkbox_exclude_out_of_stock() throws Throwable {
    	Bar_page bp= new Bar_page(driver);
		bp.checkbox().click();
		Log.info("Mark Checkbox");
		driver.close();
    }

}