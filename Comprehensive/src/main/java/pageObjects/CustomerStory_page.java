package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class CustomerStory_page extends Base {
	
	public WebDriver driver;
	By Customer= By.cssSelector("a.button");
	By Text = By.cssSelector("div.testiblock:nth-child(1) > div:nth-child(3)");
	
	//By Click=By.cssSelector(".help-center-search-icon");
	public	CustomerStory_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickstory()
	{
		System.out.println("Navigated to Customer Stories page");
		return driver.findElement(Customer);
	}
	public String get_text()
	{
		return driver.findElement(Text).getText();
	}
}
