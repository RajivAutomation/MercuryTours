package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Common {

/*	
	 * ChromeDriver driver = new ChromeDriver(); Here we are creating objects of child
	 * So, when we do "driver.", it will show all the methods that are there in child
	 * Now, we are passing the reference of the Parent i.e. "WebDriver" on the right, then
	 * WebDriver driver = new ChromeDriver();
	 * So now, when we do : "driver." it will show only two methods that are "findElement(By arg0) and findElements(By arg0)"
	 * This is because, Since you have passed parent as reference in the left hand side, there were these two methods that were common and now, since, you have passed
	 * reference of "Parent" on the left, now, it will only show "Those Methods which are common"
	 * 
	 * Note => If we are passing the reference of the Parent on the LHS, then, only those methods
	 * are able to be called which are common in both parent and child
	 * 
	 */



//		public static void main(String[] args) {
		
		public FirefoxDriver driver;
		
		@BeforeMethod
		public void BM(){
			System.setProperty("webdriver.gecko.driver","D://Rajiv//Selenium//geckodriver.exe");
			driver = new FirefoxDriver();	
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
			
		}

	
		@AfterMethod
		public void CM(){
        //driver.close();// It will close only the current browser and if any orphaned browser or not properly closed then 
        //selenium will not close those exe automatically. it will remain alive in task manager and will consume memory. Answer to this is using driver.quit()
			
		driver.quit();	
			
		}
		
}
