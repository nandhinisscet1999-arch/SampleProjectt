package BaseClassExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.LoginPage1;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebUtility;


public class BaseClassUtility {

	
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public WebUtility wlib = new WebUtility();
	 public WebDriver driver = null;
	 public static WebDriver sdriver = null;


	@BeforeSuite
	public void configBS() {
		System.out.println("connect to Db,Report config");
	}

	@BeforeClass
	public void configBC() throws IOException {
		System.out.println("Lanuch the browser");
		String browser = flib.getDataFromProperties("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();

		}
		sdriver = driver;
	}

	@BeforeMethod
	public void configBM() throws IOException {
		System.out.println("Login");
		String Username = flib.getDataFromProperties("username");
		String Password = flib.getDataFromProperties("password");
		LoginPage1 lp = new LoginPage1(driver);
		lp.loginToapp(Username, Password);

	}

	@AfterMethod
	public void configAM() {
		System.out.println("logout");
	}

	@AfterClass
	public void configAC() {
		System.out.println("Close Browser");
		driver.quit();
	}

	@AfterSuite
	public void configAS() {
		System.out.println("Close DB, Report backup");
	}
}
