package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class About_page extends Base {
	
	public WebDriver driver;
	By About= By.cssSelector("div.col-md-3:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
	By Text=By.cssSelector("p.answer:nth-child(2)");
	
	//By Click=By.cssSelector(".help-center-search-icon");
	public About_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickabout()
	{
		System.out.println("Clicked on About link");
		return driver.findElement(About);
	}
	public WebElement getText()
	{
		return driver.findElement(Text);
	}
	
	
}