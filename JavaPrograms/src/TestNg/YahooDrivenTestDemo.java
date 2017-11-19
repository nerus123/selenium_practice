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

public class YahooDrivenTestDemo {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
  @Test(dataProvider = "yahootestdata")
  public void yahooSearchTest(String s) {
	  //type the search keyowrd in search edit box
	  driver.findElement(By.id("uh-search-box")).sendKeys(s);
	  //click the button
	  driver.findElement(By.id("uh-search-button")).click();
	  //verify the search results page title
	  wait.until(ExpectedConditions.titleContains(s+" - Yahoo Search Results"));
	  //wait for the search resultstext
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),' results')]")));
	  //fetch the result count
	  String restxt=driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
	  System.out.println("results text is:"+restxt);
	  //7,730,000 results
	  String[] str=restxt.split(" ");
	  //str["7,730,000","results"]
	  System.out.println("results count is:"+str[0]);
  }
  @BeforeMethod
  public void openUrl() {
	  //open url
	  driver.get("http://yahoo.com");
	  //verify the page title
	  wait.until(ExpectedConditions.titleContains("Yahoo"));
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in after method block");
  }


  @DataProvider(name="yahootestdata")
  public Object[][] dp() {
	  //declaring and intializing the two d array
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
  public void launchBrowser() {
	  
	  //set the chrome driver path exe path
	 x
	  driver=new ChromeDriver();
	  //maximize the browser
	  driver.manage().window().maximize();
	  wait=new WebDriverWait(driver,10);
  }

  @AfterClass
  public void quitDriver() {
	  //quit the entire webdriver
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in before test block");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in after test block");
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
