package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class Help_page extends Base {
	
	public WebDriver driver;
	By Help= By.cssSelector("li.featuredLinksBar__contact-link:nth-child(1) > a:nth-child(1)");
	By Search_h=By.name("q");
	//By Click=By.cssSelector(".help-center-search-icon");
	public Help_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickhome()
	{
		System.out.println("Navigated to help_page");
		return driver.findElement(Help);
	}
	public String validate() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}
