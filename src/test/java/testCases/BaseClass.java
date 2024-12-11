package testCases;

import java.time.Duration;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	
public WebDriver driver;
	
	
	
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.get("https://tutorialsninja.com/demo/");
	//	driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	
	
	public String randomeString() {
        // Use RandomStringGenerator to generate a random alphabetic string of 5 characters
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('a', 'z') // Only lowercase alphabetic characters
            .build();
        return generator.generate(5);
    }

    public String randomeNumber() {
        // Generate a random numeric string of 10 digits using RandomStringGenerator
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('0', '9') // Only numeric characters
            .build();
        return generator.generate(10);
    }

    public String randomeAlphaNumeric() {
        // Combine a random alphabetic string and numeric string
        RandomStringGenerator alphabeticGenerator = new RandomStringGenerator.Builder()
            .withinRange('a', 'z') // Alphabetic characters
            .build();

        RandomStringGenerator numericGenerator = new RandomStringGenerator.Builder()
            .withinRange('0', '9') // Numeric characters
            .build();

        String generatedString = alphabeticGenerator.generate(5);
        String generatedNumber = numericGenerator.generate(10);

        return generatedString + "@" + generatedNumber;
    }
    
    @AfterClass
	public void tearDown()
	{
		driver.quit();
	} 
}
