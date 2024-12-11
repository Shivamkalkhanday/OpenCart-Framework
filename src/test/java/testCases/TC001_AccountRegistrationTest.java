package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass{

	
	
	@Test
	public  void verify_account_registration()
	{
		
		// homepage object create krna and methods call krna 
		HomePage hp =new HomePage(driver);
		
		hp.clickMyAccount();
		hp.clickRegister();
		
		//regsiration page ke methods call krna
		
	 AccountRegistrationPage regpage =new AccountRegistrationPage(driver);
	 
	 regpage.setFirstName(randomeString().toUpperCase());
	 regpage.setLastName(randomeString().toUpperCase());
	 regpage.setEmail(randomeString() +"@gmail.com");
	 regpage.setTelephone(randomeNumber());
	 
	 String password=randomeAlphaNumeric();
	 
	 regpage.setPassword(password);
	 regpage.setConfirmPassword(password);
	 
	 regpage.setPrivacyPolicy();
	 regpage.clickContinue();
	}
	 
	
	
	
	
	
	 
	
	
	}
	
	
	/* regpage.setFirstName("john");
	 regpage.setLastName("David");
	 regpage.setEmail("johndavid00123@gmail.com");
	 regpage.setTelephone("232322332");
	 
	 
	 regpage.setPassword("xyz123456");
	 regpage.setConfirmPassword("xyz123456");
	 
	 regpage.setPrivacyPolicy();
	 

	 regpage.clickContinue();
	 
	 String Confmsg = regpage.ConfirmationMsg();
	 Assert.assertEquals(Confmsg, "Your Account Has Been Created!");
	}  */
