package pom;

import java.util.ResourceBundle;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SignIn {

	ResourceBundle rb;
	FirefoxDriver driver;
	public SignIn(FirefoxDriver driver){
	this.driver=driver;	
	rb = ResourceBundle.getBundle("Element");
	}
	
	public void clickSignIn(){
	System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver | AutomationPractice.com PAGE LAUNCHED");
	
	String expectedTitle = "My Store";
	System.out.println("ExpectedTile = "+expectedTitle );
	System.out.println(driver.getTitle());
	String actualTitle = driver.getTitle();
	System.out.println("The actual Title of the Page is = "+actualTitle);
	Assert.assertEquals(actualTitle, expectedTitle);
	
	System.out.println("Control has reached here");
	driver.findElementByClassName(rb.getString("SignIn_Class")).click();
	
	}
	
	
	public void enterEmailAdd(){
		
		driver.findElementById(rb.getString("Email_Id")).sendKeys("shaan4u73@yahoo.com");
	}
	
	
	public void enterPassword(){
		
		driver.findElementById(rb.getString("Password_Id")).sendKeys("Abc12345");
	}
	
	public void SignInButtonClick(){
		
		driver.findElementById(rb.getString("BTN_SignIn_Id")).click();
	}
	
	
}
