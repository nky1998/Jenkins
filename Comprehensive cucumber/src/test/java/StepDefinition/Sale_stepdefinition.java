package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Sale_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
public class Sale_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for sale$")
    public void initialize_the_driver_with_firefox_browser_for_sale() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User clicks on sale button followed by all products$")
    public void user_clicks_on_sale_button_followed_by_all_products() throws Throwable {
    	Sale_page sp= new Sale_page(driver);
		sp.clicksale().click();
		sp.Allproducts().click();
		
    }
    @Then("^Check for all products available on sale and print its count$")
    public void check_for_all_products_available_on_sale_and_print_its_count() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Sale_page sp= new Sale_page(driver);
    	System.out.println("Total number of products available on discount are:  "+sp.Count().getText());
		driver.close();
    }


}