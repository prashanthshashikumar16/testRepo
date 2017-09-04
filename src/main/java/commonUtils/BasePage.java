package commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage 
{
	public static WebDriver driver = null;
	
	@BeforeMethod
		public void beforeMethod(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium supporters\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	 }
		
		else if (browser.equalsIgnoreCase("ie"))
		{}
		
		else if (browser.equalsIgnoreCase("safari"))
		{}
		
		else if (browser.equalsIgnoreCase("firefox"))
		{}
		
		else if (browser.equalsIgnoreCase("mobileChrome"))
		{}
		
		else if (browser.equalsIgnoreCase("mobileDefault"))
		{}
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
