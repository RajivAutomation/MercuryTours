package testing;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.SignIn;
import pom.SignOut;
import base.Common;



public class TC_01 extends Common{ // extending so that it can get driver


	//public FirefoxDriver driver;
	@Test
	public void TM(){
//		driver.get("http://automationpractice.com/index.php");
		
		//driver.get("http://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
		//System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver | AutomationPractice.com PAGE LAUNCHED");
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
		

		SignIn obj = new SignIn(driver);
		obj.clickSignIn();
		obj.enterEmailAdd();
		obj.enterPassword();
		obj.SignInButtonClick();
		
		
		SignOut obj1 = new SignOut(driver);
		obj1.clickSignOutLink();
		
		
		
		
		
		
	}


}