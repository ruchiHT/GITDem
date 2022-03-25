package ProjectName.ModuleName;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;

public class ValidateNavigation extends base {
    
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		LandingPage lpe=new LandingPage(driver);
		lpe.getNoThanks().click();
		Assert.assertTrue(lpe.getNaviBar().isDisplayed());
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
