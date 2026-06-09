package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassExample.BaseClass1;
import genericUtility.listerner;
@Listeners(listerner.class)
public class pratice1  extends BaseClass1{
	
	@Test(groups= {"smokeTest","RegressionTest"})
	public void t1()
	{
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("washingmachine",Keys.ENTER);
	}
	
	@Test(groups= {"SmokeTest","RegressionTest"})
	public void t2()
	{
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones",Keys.ENTER);
	}

}
