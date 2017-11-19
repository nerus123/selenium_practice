package testngnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class GoogleDataDriven {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
  @Test(dataProvider = "ggt")
  public void googleSeach( String s) throws InterruptedException {
	//check for the search edit box is present or not
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
	 driver.findElement(By.id("lst-ib")).sendKeys(s);
	 driver.findElement(By.id("lst-ib")).submit();
	 Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  //open url
	  driver.get("https://www.google.com/");
	  //verify the page title
	  //wait.until(ExpectedConditions.titleContains("Google"));
	 
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //go back to previous page
	  driver.navigate().back();
	//verify the page title
	  wait.until(ExpectedConditions.titleContains("Google"));
	 
	  
	  
  }


  @DataProvider(name="ggt")
  public Object[][] dp() {
   //create object for Object class
	  Object[][] data=new Object[3][1];
	  data[0][0]="youngland dresess";
	  data[1][0]="bonnie jean";
	  data[2][0]="bonny billy";
	  return data;
  }
  @BeforeClass
  public void beforeClass() {
	  
	//set the chrome driver path
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

  @AfterClass
  public void afterClass() {
	  //close the browser
	  driver.quit();
  }

}
