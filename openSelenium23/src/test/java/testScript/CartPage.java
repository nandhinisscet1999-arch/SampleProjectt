package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ObjectRepository.LoginPage1;
import ObjectRepository.productPage;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebUtility;

public class CartPage {


		public static void main(String[] args) throws IOException, AWTException, InterruptedException {
			FileUtility flib = new FileUtility();
			WebUtility wlib = new WebUtility();
			ExcelUtility elib = new ExcelUtility();

			String browser = flib.getDataFromProperties("browser");
			System.out.println(browser);
			String url = flib.getDataFromProperties("url");
			System.out.println(url);
			String user = flib.getDataFromProperties("username");
			System.out.println(user);
			String pass = flib.getDataFromProperties("password");
			System.out.println(pass);
			
			String firstname = elib.getDataFromExcel("org2", 1, 1);
			System.out.println(firstname);
			String lastname = elib.getDataFromExcel("org2", 1, 2);
			System.out.println(lastname);
			String postal = elib.getDataFromExcel("org2", 1, 3);
			System.out.println(postal);
			
			WebDriver driver = null;
			if(browser.equals("chrome")) {
				driver = new ChromeDriver();
				
			}else if(browser.equals("FireFox")) {
				driver = new FirefoxDriver();
				
			}else if(browser.equals("Edge")) {
				driver = new EdgeDriver();
			}else
			{
				driver = new ChromeDriver();
			}
			
			wlib.maximize(driver);
			wlib.waitForPageToLoad(driver);
			driver.get(url);
			
			LoginPage1 lp = new LoginPage1(driver);
			lp.loginToapp(user, pass);
			
			driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]/../..//button[text()='Add to cart']")).click();


			

		//Handling the popups
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			//creating the object
			productPage pg = new productPage(driver);
			pg.shopping();
			pg.check();
			pg.createName(firstname, lastname, postal);
			
			
			
			driver.findElement(By.xpath("//input[@id='continue']")).click();
		}

	}


