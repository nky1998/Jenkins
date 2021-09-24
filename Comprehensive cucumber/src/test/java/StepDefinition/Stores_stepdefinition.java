package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Stores_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Stores_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for stores$")
    public void initialize_the_driver_with_firefox_browser_for_stores() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User clicks on stores button$")
    public void user_clicks_on_stores_button() throws Throwable {
    	Stores_page sp= new Stores_page(driver);
		sp.clickstore().click();
    }
    @Then("^print text present on the page$")
    public void print_text_present_on_the_page() throws Throwable {
    	Stores_page sp= new Stores_page(driver);
		String text=sp.storetext().getText();
		System.out.println(text);
		driver.close();
    }

}
