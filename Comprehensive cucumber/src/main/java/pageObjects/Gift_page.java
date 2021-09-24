package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;
public class Gift_page extends Base {
	
	public WebDriver driver;
	By Gift= By.cssSelector(".featuredLinksBar__linkContainer > li:nth-child(3) > a:nth-child(1)");
	By Text = By.cssSelector("._1bluI");
	
	//By Click=By.cssSelector(".help-center-search-icon");
	public Gift_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement clickgift()
	{
		System.out.println("Navigated to bulk_page");
		return driver.findElement(Gift);
	}
	public String get_text()
	{
		return driver.findElement(Text).getText();
	}
}
