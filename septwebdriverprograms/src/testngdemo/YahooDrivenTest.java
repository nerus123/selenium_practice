package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class YahooDrivenTest {
	public static WebDriver driver=null;
	private static WebDriverWait wait=null;
	
  @Test(dataProvider = "dp")
  public void yahooSearchTest(String s){
	  //wait for the search editbox element
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("uh-search-box")));
	  //type the search keyword in search editbox
	  driver.findElement(By.id("uh-search-box")).sendKeys(s);
	  //click on search button
	  driver.findElement(By.id("uh-search-button")).click();
	  //verify the page title
	  wait.until(ExpectedConditions.titleContains(s));
	  //wait for the search results
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'results')]")));
	  
	  //fetch the results text
	  String txt=driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
	  System.out.println("search results text is:"+txt);
	  //23,200,000 reults
	  String[] str=txt.split(" ");
	  //str[]={"223,200,00,""results"
  	  System.out.println("search results count is:"+str[0]);
  	  System.out.println("sucessfully exextracred the result count");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  //open the url
	  driver.get("http://yahoo.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("navigate back to previous page");
	  driver.navigate().back();
	  wait.until(ExpectedConditions.titleContains("Yahoo"));
	  
  }


  @DataProvider
  public Object[][] dp() {
	  Object[][] data=new Object[3][1];
	  data[0][0]="selenium";
	  data[1][0]="uft";
	  data[2][0]="cucumber";
	  return data;
	  
	  
	  
   
    }
  
  
  @BeforeClass
  public void beforeClass() {
	  //3
	  //create an object for webdriverwait class
		 wait=new WebDriverWait(driver,30);
	
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("executing @afterclass annotation...........");
  }

  @BeforeTest
  public void beforeTest() {
	  //2
	//set the chromedriver path
			System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			//launch the browser
			 driver=new ChromeDriver();
			 //maximise the window
			 driver.manage().window().maximize();
			
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in @aftertest annotation.........");
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  //1
	  System.out.println("i am in @before suite annotation..........");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in @afetr suite annotation..................");
  }

}
