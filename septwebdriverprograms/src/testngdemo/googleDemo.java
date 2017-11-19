package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class googleDemo {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
  @Test
  public void f() {
	  //identify search edit box
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  driver.findElement(By.id("lst-ib")).submit();
	  //verify page title
	  wait.until(ExpectedConditions.titleContains("selenium - Google Search"));
	  
	  
  }
  @Test
  public void g(){
	  driver.findElement(By.id("lst-ib")).sendKeys("java");
	  driver.findElement(By.id("lst-ib")).submit();
	  //verify page title
	  wait.until(ExpectedConditions.titleContains("java - Google Search"));
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("executing the before method");
	  //open url
	  driver.get("http://google.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in @aftermethod");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in @BeforeTest annotation...");
	  //@beforetest executes only once before all tests
	//set the chromedriver path
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		
		//launch the browser
		// driver=new ChromeDriver();
	//set the gcekodriver path
			System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			
			//launch the browser
		 driver=new FirefoxDriver();
		 
		 //maximise the window
		 driver.manage().window().maximize();
		 //cretae object for webdriverwait class
		 wait=new WebDriverWait(driver,30);
	  
  }

  @BeforeClass
  public void beforeClass() {
	  //3
	System.out.println("executing @beforeClass annoatation");
	
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("executing @afterclass annotation...........");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in @AfterTest annotation...");
	  
	  //@afetr test exeucte only once after all test executin done
	  //close the browser
	  driver.quit();
	  
	  
	  }
	  
  }


