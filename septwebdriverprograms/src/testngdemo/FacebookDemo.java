package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class FacebookDemo {
	

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

  @Test(priority=1)
  public void setName() throws InterruptedException    {
	  //identify emailorphone edit box
	  driver.findElement(By.id("email")).sendKeys("neerajagoli@yahoo.com");
	  //iddenity password edit box
	  driver.findElement(By.id("pass")).sendKeys("minisha123");
	
	  
	  //click on login
	  driver.findElement(By.id("loginbutton")).click();
	  
	  
	  //click for logout
	  driver.findElement(By.id("userNavigationLabel")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
	  driver.findElement(By.linkText("Log Out")).click();
	 
	  
  }
	
  @Test(priority=0)
  public void surenderLogin(){
	  //identify emailorphone edit box
	  driver.findElement(By.id("email")).sendKeys("nerus123@gmail.com");
	  //iddenity password edit box
	  driver.findElement(By.id("pass")).sendKeys("cherry123");
	  
	  //click on login
	  driver.findElement(By.id("loginbutton")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  //open url
	 driver.get("https://www.facebook.com/");
	 //verify the page title
	 wait.until(ExpectedConditions.titleContains("Facebook - Log In or Sign Up"));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" i am in after method............");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  //@before class executes only once
	  ////set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		 wait=new WebDriverWait(driver,30);
  }

  @AfterClass
  public void afterClass() {
	  
	  //close the browser
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in @beforessuite execution");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in @aftersuite execution");
  }

}
