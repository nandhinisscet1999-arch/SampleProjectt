package testScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationClass {
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("execute Bs");
	}
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("execute bc");
	}
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("executeBM");
	}
	@Test
	public void CreateContactData()
	{
		System.out.println("execute createContactData");
	}
	@Test
	public void CreateTest()
	{
		System.out.println("execute createContact");
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("execute AM");
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("execute AC");
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("execute AS");
	}

}
