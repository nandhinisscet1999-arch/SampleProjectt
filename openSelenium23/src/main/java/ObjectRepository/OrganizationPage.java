package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage {
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement productbtn;
	
	@FindBy(name="search")
	private WebElement ele1;
	
	@FindBy(name="products")
	private WebElement prod;

}
