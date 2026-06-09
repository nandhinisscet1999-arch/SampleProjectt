package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage {
	//consturctor
	public productPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement productbtn;
	
	public WebElement getProductbtn() {
		return productbtn;
	}
	@FindBy(xpath="//a[@class='shopping_cart_link']")
     private WebElement  shoppingcart;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;

	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname1;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement  lastname1;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalCoast;
	//creating the Encapsulation
	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getFirstname() {
		return firstname1;
	}

	public WebElement getLastname() {
		return lastname1;
	}

	public WebElement getPostalCoast() {
		return postalCoast;
	}
	//Action
	
	public void shopping()
	{
		shoppingcart.click();
	}
	
	public void check()
	{
		checkout.click();
	}
	
	public void createName(String firstname, String lastname ,String postal)
	{


		firstname1.sendKeys(firstname);
	    lastname1.sendKeys(lastname);
	    postalCoast.sendKeys(postal);
	    
	}
	
}
