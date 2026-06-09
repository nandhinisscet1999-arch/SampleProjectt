package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement productbtn;
	

}
