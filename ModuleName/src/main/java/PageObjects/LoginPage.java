package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	
	By Username=By.id("user_email");
	By Password=By.id("user_password");
	By LoginB=By.name("commit");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(Username);
	}

	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(LoginB);
	}

	


}
