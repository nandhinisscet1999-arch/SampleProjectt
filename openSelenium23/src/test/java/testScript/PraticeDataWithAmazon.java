package testScript;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PraticeDataWithAmazon {
	@Test
	public void getProductInfoTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		//capture product info
		driver.findElement(By.xpath("//span[text()='Apple iPhone 16 Plus, 128GB, Pink - Unlocked (Renewed)']")).click();
		
		}


}
