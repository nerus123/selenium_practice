package testngnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class FacebookDataDrivenTest {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
  @Test(dataProvider = "dp")
  public void facebookTest( String username,String password) throws InterruptedException {
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
	  
	  //chech for the element is present or not
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Groups')]")));
	 // driver.findElement(By.xpath("//div[contains(text(),'Groups')]")).click();
	  
	  driver.findElement(By.id("userNavigationLabel")).click();
	  
	//*[@id='js_wi']/div/div/ul/li[18]/a/span/span
	  //driver.findElement(By.xpath("//*[@id='js_wi']/div/div/ul/li[18]/a/span/span")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
	  driver.findElement(By.linkText("Log Out")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@beformethod annotation executes before each test method");
	  //open url
	  driver.get("http://www.facebook.com/");
	  //verify the page title
	  wait.until(ExpectedConditions.titleContains("Facebook - Log In or Sign Up"));
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@aftermethod annotation executes after each test method");
  }


  @DataProvider
  public Object[][] dp() {
    Object[][] data=new Object[2][2];
    data[0][0]="nerus123@gmail.com";
    data[0][1]="cherry123";
    data[1][0]="neerajagoli@yhaoo.com";
    data[1][1]="minisha123";
    return data;
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class executes only once");
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
		 //implicit wait
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //create object for WebDriverWait class
		 wait=new WebDriverWait(driver,30);
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after ecexutes only once");
	  //close the browser
	  driver.close();;
  }

}
