package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
public class Title_stepdefinition {

	WebDriver driver;
    @Given("^Initialize the driver with firefox browser$")
    public void initialize_the_driver_with_firefox_browser() throws Throwable {
    	System.setProperty("webdriver.gecko.driver", "D:\\MINDTREE\\Comprehensive cucum\\Drivers\\geckodriver.exe");
    	driver= new FirefoxDriver();
		driver.get("https://www.urbanladder.com/");
    }

    @Then("^validate the title of the page$")
    public void validate_the_title_of_the_page() throws Throwable {
		String p=driver.getTitle();
		if(p.endsWith("Urban Ladder"))
		{
			Assert.assertTrue(true);
		}
		driver.close();
    }


}