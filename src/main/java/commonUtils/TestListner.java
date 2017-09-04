package commonUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class TestListner implements ITestListener
{

	public void onFinish(ITestContext result) {
		String fileName = ((ITestResult) result).getMethod().getMethodName();
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver); 
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./Vtiger/ScreenShots/OnTestFinish/"+fileName+".png");
		try 
		{
			FileUtils.copyDirectory(src, des);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext result) 
	{
		String fileName = ((ITestResult) result).getMethod().getMethodName();
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver); 
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./Vtiger/ScreenShots/OnTestStart/"+fileName+".png");
		try 
		{
			FileUtils.copyDirectory(src, des);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) 
	{
		String fileName = ((ITestResult) result).getMethod().getMethodName();
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver); 
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./Vtiger/ScreenShots/FailedScreenShot/"+fileName+".png");
		try 
		{
			FileUtils.copyDirectory(src, des);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result)
	{
		String fileName = ((ITestResult) result).getMethod().getMethodName();
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver); 
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./Vtiger/ScreenShots/TestSkipped/"+fileName+".png");
		try 
		{
			FileUtils.copyDirectory(src, des);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult result) 
	{
		String fileName = ((ITestResult) result).getMethod().getMethodName();
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver); 
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./Vtiger/ScreenShots/OnTestStart/"+fileName+".png");
		try 
		{
			FileUtils.copyDirectory(src, des);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		String fileName = ((ITestResult) result).getMethod().getMethodName();
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver); 
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./Vtiger/ScreenShots/PassedScreenShot/"+fileName+".png");
		try 
		{
			FileUtils.copyDirectory(src, des);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
