package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class Sale_page extends Base {
	
	public WebDriver driver;
	By Sale= By.cssSelector("#topnav_wrapper > ul > li.topnav_item.saleunit > span");
	By All=By.xpath("//*[@id=\'topnav_wrapper\']/ul/li[1]/div/div/ul/li[2]/ul/li[7]/a/span");
	By Text=By.cssSelector("div.results-count");
	//By Click=By.cssSelector(".help-center-search-icon");
	public Sale_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clicksale()
	{
		System.out.println("Navigated to sale_page");
		return driver.findElement(Sale);
	}
	public WebElement Allproducts()
	{
		return driver.findElement(All);
	}
	public WebElement Count()
	{
		return driver.findElement(Text);
	}
}