package testScript;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
	
	
	
	ExtentReports report;
		@BeforeSuite
		public void configBs()
		{
			//spark report config
			ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
			spark.config().setDocumentTitle("crm Test Suite Results");
			spark.config().setReportName("crm Report");
			spark.config().setTheme(Theme.DARK);
			
			//add Env information & create test
			 report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("os", "windows-10");
			report.setSystemInfo("browser", "chrome-100");
		}
		
		@AfterSuite
		public void configAs()
		{
			report.flush();
		}
		
		@Test
		public void createcontactWithORG()
		{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://49.249.29.4:8888/");
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 String filepath = ts.getScreenshotAs(OutputType.BASE64);
		 
			
        ExtentTest test = report.createTest("createcontactTest");
		test.log(Status.INFO, "login into app");
		test.log(Status.INFO, "navigate to app");
		test.log(Status.INFO, "create contact");
		
		if("hddfc".equals("hdfc"))
		{
			test.log(Status.PASS, "contact is created");
		}
		else
		{
			test.log(Status.FAIL,"contact is not created");
			test.addScreenCaptureFromBase64String(filepath,"ErrorFile");
			
		}
	}

		@Test
		public void createcontactWithPhoneNumber()
		{
			
        ExtentTest test = report.createTest("createcontactwithPhoneNumber");
		test.log(Status.INFO, "login into app");
		test.log(Status.INFO, "navigate to app");
		test.log(Status.INFO, "create contact");
		
		if("hdfc".equals("hdfc"))
		{
			test.log(Status.PASS, "contact is created");
		}
		else
		{
			test.log(Status.FAIL,"contact is not created");
		}
	}

}
