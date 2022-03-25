package ProjectName.ModuleName;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	private static final TimeUnit Seconds = null;
	public WebDriver driver;
	Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\JavaWorkspace\\ModuleName\\src\\main\\java\\ProjectName\\ModuleName\\Data.properties");
	    prop.load(fis);
	    
	    String browserName=prop.getProperty("browser");
	    System.out.println(browserName);
	 
	    if(browserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	 driver=new ChromeDriver();
	    }
	    /*
	    else if(browserName=="Mozilla")
	    {
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	WebDriver driver=new FirefoxDriver();	
	    }
	    */
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    return driver;
	}

}
