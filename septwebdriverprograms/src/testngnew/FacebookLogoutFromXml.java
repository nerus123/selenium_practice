package testngnew;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class FacebookLogoutFromXml {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
 @Parameters( {"username", "password"})	
  @Test(invocationCount=1)
  public void facebookTest(String username,String password) throws InterruptedException {
	  //check for the edit box
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	  //idenity the email edit box
	  WebElement email_editbox=driver.findElement(By.id("email"));
	  email_editbox.clear();
	  email_editbox.sendKeys(username);
	  //check for the password esit box
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
	  //idenity email editbox
	  WebElement pass_editbox=driver.findElement(By.id("pass"));
	  pass_editbox.clear();
	  pass_editbox.sendKeys(password);
	  Thread.sleep(3000);
	 
	  //click on loginbutton
	  driver.findElement(By.id("loginbutton")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("userNavigationLabel")).click();
	  
		//*[@id='js_wi']/div/div/ul/li[18]/a/span/span
		  //driver.findElement(By.xpath("//*[@id='js_wi']/div/div/ul/li[18]/a/span/span")).click();
		  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
		  driver.findElement(By.partialLinkText("Log Out")).click();
		  
	   
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  //open url
	  driver.get("http://www.facebook.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

  @BeforeTest
  public void beforeTest() {
	//set the gcekodriver path
			//System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			
			//launch the browser
			 //driver=new FirefoxDriver();
			//set the chromedriver path
	  System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32_2\\chromedriver.exe");
      
				//launch the browser
			 driver=new ChromeDriver();
				
			 //maximise the window
			 driver.manage().window().maximize();
			 //create object for WebDriverWait class
			 wait=new WebDriverWait(driver,30);  
	  
  }

  @AfterTest
  public void afterTest() {
	  //close the browser
	  driver.close();
	  
  }

}
