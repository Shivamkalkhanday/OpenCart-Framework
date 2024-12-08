package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="")
	WebElement InkMyAccount;
	
	@FindBy(xpath="")
	WebElement InkRegister;
	
	public void clickMyAccount()
	{
		InkMyAccount.click();
	}
	
	public void clickRegister()
	{
		InkRegister.click();
	}

}
