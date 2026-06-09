package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Rule-1 create a seperate java class
//Rule-2 object Creation

public class LoginPage1 {
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username1;//Rule-3 oject Initialization
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password1;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement LoginBtn;
	
	//creating constructor
	//this==>current object
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4 Object Encapsulation
	public WebElement getUsername1() {
		return username1;
	}


	public WebElement getPassword1() {
		return password1;
	}


	public WebElement getLogin() {
		return LoginBtn;
	}
//Rule-5 provide Action
	public void loginToapp(String username, String password)
	{
		username1.sendKeys(username);
		password1.sendKeys(password);
		LoginBtn.click();
	}

	
}
