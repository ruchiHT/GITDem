package ProjectName.ModuleName;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;

public class ValidateTitle extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void ValidateTitleQA() throws IOException
	{
		LandingPage lp=new LandingPage(driver);
		
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
				
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
