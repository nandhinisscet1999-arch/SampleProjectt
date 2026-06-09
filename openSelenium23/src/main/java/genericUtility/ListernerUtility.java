package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClassExample.BaseClassUtility;

public class ListernerUtility  implements ITestListener,ISuiteListener {
	
	
	public void onStart(ISuite suite)
	{
		System.out.println("Report Configuration");
	}
	
	public void onFinish(ISuite suite)
	{
		System.out.println("Report backup");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(""+result.getMethod().getMethodName()+"start");
	}
	
	public void onTestSucess(ITestResult result)
	{
		System.out.println(""+result.getMethod().getMethodName()+"End");
	}
	public void OnTestFailure(ITestResult result) throws IOException
	{
		String testname = result.getMethod().getMethodName();
		TakesScreenshot ts =(TakesScreenshot)BaseClassUtility.sdriver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 try {
		File dest = new File("./screenshot/"+testname+"img.png");
		FileHandler.copy(temp, dest);
		 }
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}


