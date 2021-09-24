package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.About_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class About_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for About$")
    public void initialize_the_driver_with_firefox_browser_for_About() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User navigates on About us  page$")
    public void user_navigates_on_about_us_page() throws Throwable {
    	About_page ap= new About_page(driver);
		ap.clickabout().click();
		Log.info("Click On About Us in footer");
    }

    @Then("^Gets the paragraph present on the page$")
    public void gets_the_paragraph_present_on_the_page() throws Throwable {
    	About_page ap= new About_page(driver);
		System.out.println(ap.getText().getText());
		driver.close();
    }

}