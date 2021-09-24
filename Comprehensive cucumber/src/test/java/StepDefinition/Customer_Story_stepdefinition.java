package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.CustomerStory_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Customer_Story_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for Customer Stories$")
    public void initialize_the_driver_with_firefox_browser_for_customer_stories() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User clicks on View All Customer Stories button$")
    public void user_clicks_on_view_all_customer_stories_button() throws Throwable {
    	CustomerStory_page cp= new CustomerStory_page(driver);
		cp.clickstory().click();
    }

    @Then("^Print the testimonial present on the page$")
    public void print_the_testimonial_present_on_the_page() throws Throwable {
    	CustomerStory_page cp= new CustomerStory_page(driver);

		String t=cp.get_text();
		System.out.println("One of the Customer Story is :   "+t);
		driver.close();
    }

}