/**
 * 
 */
package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author User
 *
 */
public class LandingPage {
	
	WebDriver driver;
	
	
	By SignIn=By.cssSelector("a[href*='sign_in']");
	By NoThanks=By.xpath("//button[normalize-space()='NO THANKS']");
	By Title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector("div[class='container']");

	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	public WebElement getNoThanks()
	{
		return driver.findElement(NoThanks);
	}

	public WebElement getLogin()
	{
		return driver.findElement(SignIn);
	}
	public WebElement getNaviBar()
	{
		return driver.findElement(NavBar);
	}

	

}
