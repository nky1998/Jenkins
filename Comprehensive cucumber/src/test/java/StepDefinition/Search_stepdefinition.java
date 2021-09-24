package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.Search_page;
import resources.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
public class Search_stepdefinition extends Base {

	public static Logger Log= LogManager.getLogger();
    @Given("^Initialize the driver with firefox browser for search$")
    public void initialize_the_driver_with_firefox_browser_for_search() throws Throwable {
    	FileInputStream fis=new FileInputStream("D:\\MINDTREE\\Comprehensive\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage of Urban Ladder");
    }

    @When("^User Enters chair in serach bar and clicks on search button$")
    public void user_enters_chair_in_serach_bar_and_clicks_on_search_button() throws Throwable {
    	Search_page sp= new Search_page(driver);
		excelutils eu=new excelutils();
		eu.main(null);
		String p=eu.s;
		sp.searchbar().sendKeys(p);
		sp.clickb().click();
		driver.close();
    }

    @Then("^navigate to different page$")
    public void navigate_to_different_page() throws Throwable {
        System.out.println("Navigated to different page");
    }

}