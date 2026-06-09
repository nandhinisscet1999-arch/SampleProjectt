package genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtility {
	
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void fullscreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToWindows(WebDriver driver, String url) {
		Set<String> allWindowIds = driver.getWindowHandles();

		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains(url))
				break;
		}
	}

	public void switchToWindows(String title, WebDriver driver) {
		Set<String> allWindows = driver.getWindowHandles();

		for (String id : allWindows) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains(title))
				break;

		}
	}

	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	public void scroll(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}

	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();

	}

	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void SelectDropdown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void SelectDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectDropdown(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameorId) {
		driver.switchTo().frame(nameorId);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void handleDropDown(WebDriver driver, WebElement element, String value) {
		Select ele = new Select(element);
		ele.selectByValue(value);
	}


}
