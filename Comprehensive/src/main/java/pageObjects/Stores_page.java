package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stores_page {
	public WebDriver driver;
	By Stores= By.cssSelector(".featuredLinksBar__linkContainer > li:nth-child(1) > a:nth-child(1)");
	By Text = By.cssSelector("._2GAh1");
	
	//By Click=By.cssSelector(".help-center-search-icon");
	public Stores_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickstore()
	{
		System.out.println("Navigated to Stores_page");
		return driver.findElement(Stores);
	}
	public WebElement storetext()
	{
		return driver.findElement(Text);
	}
}
