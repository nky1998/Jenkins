package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class Bulk_page extends Base {
	
	public WebDriver driver;
	By Bulk= By.cssSelector(".featuredLinksBar__linkContainer > li:nth-child(2) > a:nth-child(1)");
	By Text = By.xpath("//*[@id=\'mG61Hd\']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input");
	
	//By Click=By.cssSelector(".help-center-search-icon");
	public Bulk_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickbulk()
	{
		System.out.println("Navigated to bulk_page");
		return driver.findElement(Bulk);
	}
	public String get_title()
	{
		return driver.getTitle();
	}
}
