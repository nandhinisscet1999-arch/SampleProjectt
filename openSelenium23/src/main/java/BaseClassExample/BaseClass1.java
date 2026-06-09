package BaseClassExample;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass1 {
	
	@BeforeSuite(groups= {"smokeTest","RegressionTest"})
	public void bs()
	{
		System.out.println("beforeSuite");
	}
	
	@BeforeClass(groups= {"smokeTest","RegressionTest"})
	public void Bc()
	{
		System.out.println("beforeClass");
	}
	
	@BeforeTest(groups= {"smokeTest","RegressionTest"})
	public void BT()
	{
		System.out.println("beforeTest");
	}
	
	@BeforeMethod(groups= {"smokeTest","RegressionTest"})
	public void BM()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterMethod(groups= {"smokeTest","RegressionTest"})
	public void Am()
	{
		System.out.println("AfterMethod");
	}
	@AfterTest(groups= {"smokeTest","RegressionTest"})
	public void AT()
	{
		System.out.println("AfterTest");
	}
	@AfterClass(groups= {"smokeTest","RegressionTest"})
	public void Ac()
	{
		System.out.println("After class");
	}
	
	@AfterSuite(groups= {"smokeTest","RegressionTest"})
	public void As()
	{
		System.out.println("AfteSuite");
	}

}
