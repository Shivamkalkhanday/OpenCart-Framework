package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement InkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement InkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement InkLogin;
	
	public void clickMyAccount()
	{
		InkMyAccount.click();
	}
	
	public void clickRegister()
	{
		InkRegister.click();
	}
	
	public void clickLogin()
	{
		InkLogin.click();
	}

}
