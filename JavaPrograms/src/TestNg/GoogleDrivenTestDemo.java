package TestNg;

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

public class GoogleDrivenTestDemo {
	
	public WebDriver driver=null;
	public WebDriverWait wait=null;
  @Test(dataProvider = "googletestdata")
  public void GoogleSearchTest(String s) {
	  //type the search keyowrd in search edit box
	  driver.findElement(By.id("lst-ib")).sendKeys(s);
	  //click the search button
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  //verify te search results page title
	  wait.until(ExpectedConditions.titleContains(s+" - Google Search"));
	  //wait for the search results txt
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(text(),' results')]")));
	  //fetch the result count
	  String restxt=driver.findElement(By.id("resultStats")).getText();
	  System.out.println("results text is:"+restxt);
	  String[] str=restxt.split(" ");
	  //str["7,730,000","results"]
	  System.out.println("results count is:"+str[0]);
	  
	  	  
  }
  
@BeforeMethod
  public void beforeMethod() {
	  //open url
	  driver.get("http://google.com");
	  //verify the page title
	  wait.until(ExpectedConditions.titleContains("Google"));
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider(name="googletestdata")
  public Object[][] dp() {
  //declaring and intialising the two d array
	  Object[][] data=new Object[3][1];
	  //1st row
	  data[0][0]="selenium";
	  //2nd row
	  data[1][0]="webdriver";
	  //3rd row
	  data[2][0]="cucumber";
	  return data;
 

}


@BeforeClass
  public void beforeClass() {
	  //set the chromedriver path
	 System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
	  //launch the browser
	  //launch the browser
	  driver=new ChromeDriver();
	  //maximise the browser
	  driver.manage().window().maximize();
	  wait=new WebDriverWait(driver,30);
	  
  }

  @AfterClass
  public void quitWebDriver() {
	  //close the webdriver
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in beforetest block");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in aftertest block");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in before suite block");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in after suite block");
  }

}
