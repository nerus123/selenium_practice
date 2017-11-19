package testngnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class YahooDataDrivenTest {
	private WebDriver driver=null;
	private WebDriverWait wait=null;//explicit wait command
  @Test(dataProvider = "dp")
  public void yahooSearch(String s) {
	  //wait for the search edit box
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("uh-search-box")));
	  //type the search keyword
	  driver.findElement(By.id("uh-search-box")).sendKeys(s);
	  //click on search button
	  driver.findElement(By.id("uh-search-button")).click();
	  //wait for the next page title
	  wait.until(ExpectedConditions.titleContains(s));
	  //wait for the page results
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),' results')]")));
	  //fetch the enire search results text
	  String txt=driver.findElement(By.xpath("//span[contains(text(),' results')]")).getText();
	  System.out.println("search results txt for keyword  "+s+"is:"+txt);
	  String[] str=txt.split(" ");
	  System.out.println(str[1]);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in before method");
	  //open url
	  driver.get("http://www.yahoo.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in after method"); 
	  System.out.println("naviagte back to previous page");
	  //goback to previous page
	  driver.navigate().back();
	  //verify page title
	  wait.until(ExpectedConditions.titleContains("Yahoo"));
  }


  @DataProvider
  public Object[][] dp() {
    //create object for Object class
	  Object[][] data=new Object[3][1];
	  data[0][0]="selenium";
	  data[1][0]="java";
	  data[2][0]="phyton";
	  return data;
      
    }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in before class anotation.....");
	//create object for WebDriverWait class
		 wait=new WebDriverWait(driver,30);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in after class anotation.....");
	 
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" i am in before test annottaion...");
	        //set the chrome driver path
	        //set the gcekodriver path
			System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			
			//launch the browser
			 driver=new FirefoxDriver();
			 
			 //maximise the window
			 driver.manage().window().maximize();
			 
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" i am in after test annottaion...");
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in before suite annotation method......"); 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in after suite annotation method......."); 
  }

}
