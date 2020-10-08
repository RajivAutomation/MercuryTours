package pom;

import java.util.ResourceBundle;

import org.openqa.selenium.firefox.FirefoxDriver;



public class SignOut {

	ResourceBundle rb;
	public FirefoxDriver driver; //Global
	public SignOut(FirefoxDriver driver){
		this.driver=driver;//On LHS, driver is whatever driver will come from calling method, it will put into Global Driver denoted by RHS i.e. this.driver. "this" point to Global Variable
//ResourceBundle is the Class which works to fetch the element i.e KEY and its value stored in Element.Properties file
		
		 rb = ResourceBundle.getBundle("Element");
		
	}
	
	public void clickSignOutLink(){
		
		driver.findElementByClassName(rb.getString("SignOut_Class")).click();
		System.out.println("Sucessfully Logout from the Application");
	}
}
