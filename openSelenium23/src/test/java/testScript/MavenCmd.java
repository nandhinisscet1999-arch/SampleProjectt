package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenCmd {
	@Test
	 public void maven_Test()
	 {
		
		String url = System.getProperty("url");
		String user = System.getProperty("username");
		String pass = System.getProperty("password");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get(url);
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pass,Keys.ENTER);
		 
		
		
	}

}
