package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class Search_page extends Base {
	
	public WebDriver driver;
	By Search= By.id("search");
	By Search_b= By.cssSelector(".search-icon");
	//By Click=By.cssSelector(".help-center-search-icon");
	public Search_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement searchbar()
	{
		return driver.findElement(Search);
	}
	public WebElement clickb()
	{
		return driver.findElement(Search_b);
	}
}