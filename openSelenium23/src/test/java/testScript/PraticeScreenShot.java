package testScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class PraticeScreenShot {
	
	@Test
	public void amazonTest() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		TakesScreenshot ts =(TakesScreenshot)driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/img.png");
		FileHandler.copy(temp, dest);
	}

}
