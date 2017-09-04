package commonUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class Browser {
	public static WebDriver driver=null;

	public void getBrowser(String browser) throws MalformedURLException
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Vtiger/src/test/resources/driverExecutable/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(Constants.url);
		}
		else if (browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./Vtiger/src/test/resources/driverExecutable/IEDriverServer.exe");
			Browser.driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Vtiger/src/test/resources/driverExecutable/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else if (browser.equalsIgnoreCase("mobileChrome"))
		{
			DesiredCapabilities capabilities = DesiredCapabilities.android();	
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
			capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Lenovo");
			capabilities.setCapability(MobileCapabilityType.VERSION,"5.1.1");
			URL url = new URL(Constants.mobileUrl);
			
			System.setProperty("webdriver.chrome.driver", "./Vtiger/src/test/resources/driverExecutable/chromedriver.exe");
			driver = new AndroidDriver(url,capabilities);
		}
		else if (browser.equalsIgnoreCase("mobileDefault"))
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.IE);
			//set the platform version
			caps.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
			//set your Device name. My device name was Charan007
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Lenovo");
			caps.setCapability(MobileCapabilityType.VERSION, "5.1.1");			
			URL url = new URL(Constants.mobileUrl);
			
			System.setProperty("webdriver.chrome.driver", "./Vtiger/src/test/resources/driverExecutable/IEDriverServer.exe");
			driver = new AndroidDriver(url,caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
}




