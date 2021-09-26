package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class Bar_page extends Base {
	
	public WebDriver driver;
	By Storage= By.cssSelector("li.topnav_item:nth-child(5) > span:nth-child(1)");
	By Bar= By.cssSelector(".\\32 401 > a:nth-child(1) > span:nth-child(1)");
	By check=By.cssSelector("#filters_availability_In_Stock_Only");
	
	//By Click=By.cssSelector(".help-center-search-icon");
	public Bar_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickstorage()
	{
		System.out.println("Navigated to Storage dropdown");
		return driver.findElement(Storage);
	}
	public WebElement clickbar()
	{
		System.out.println("Navigated to Bar Cabinets dropdown");
		return driver.findElement(Bar);
	}
	public WebElement checkbox()
	{
		System.out.println("Click on checkbox");
		return driver.findElement(check);
	}
	
}
