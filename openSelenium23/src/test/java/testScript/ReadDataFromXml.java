package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXml {
	@Test
	public void sampleTest1(XmlTest test)
	{
		String Url = test.getParameter("url");
		System.out.println(Url);
		String user = test.getParameter("username");
		System.out.println(user);
		String pass = test.getParameter("password");
		System.out.println(pass);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Url);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass,Keys.ENTER);
		
		
	}

}
