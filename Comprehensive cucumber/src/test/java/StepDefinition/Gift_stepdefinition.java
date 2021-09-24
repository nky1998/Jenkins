package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Gift_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Gift_stepdefinition extends Base{

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for Gift$")
    public void initialize_the_driver_with_firefox_browser_for_gift() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User clicks on Gift Cards button$")
    public void user_clicks_on_gift_cards_button() throws Throwable {
    	Gift_page gp= new Gift_page(driver);
		gp.clickgift().click();
    }

    @Then("^Print the text present on the page$")
    public void print_the_text_present_on_the_page() throws Throwable {
    	Gift_page gp= new Gift_page(driver);
		String t=gp.get_text();
		System.out.println("Text on the Gift Cards page is  "+t);
		driver.close();
    }

}