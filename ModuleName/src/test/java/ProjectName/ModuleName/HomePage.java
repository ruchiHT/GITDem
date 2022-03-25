package ProjectName.ModuleName;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;

public class HomePage extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(dataProvider="getData")
	public void pageNavigation(String username, String password) throws IOException
	{
		System.out.println("hello");
		LandingPage lp=new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		lp.getNoThanks().click();
		lp.getLogin().click();
		LoginPage lop=new LoginPage(driver);
		lop.getUsername().sendKeys(username);
		lop.getPassword().sendKeys(password);
		lop.getLogin().click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object[1][2];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		//data[1][0]=
		//data[1][1]=
		return data;	
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
