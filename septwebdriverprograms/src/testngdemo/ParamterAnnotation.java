package testngdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterAnnotation {
@Parameters({"uname","pss"})
  @Test
  public void facebookParameter(String uname,String pss) {
	//set the chromedriver path
			//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			//launch the browser
			//WebDriver driver=new ChromeDriver();
	//set the gcekodriver path
			System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			
			//launch the browser
			WebDriver driver=new FirefoxDriver();
			
			 //maximise the window
			 driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,30);
			
			  //open url
			 driver.get("https://www.facebook.com/");
			 //verify the page title
			 wait.until(ExpectedConditions.titleContains("Facebook - Log In or Sign Up"));
			 
			 //identify emailorphone edit box
			  driver.findElement(By.id("email")).sendKeys(uname);
			  //iddenity password edit box
			  driver.findElement(By.id("pass")).sendKeys(pss);
			
			  
			  //click on login
			  driver.findElement(By.id("loginbutton")).click();
			  
			  
			  //click for logout
			  driver.findElement(By.id("userNavigationLabel")).click();
			  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
			  driver.findElement(By.linkText("Log Out")).click();
			  
			  //close the browser
			  driver.quit();
			 
	
	
  }
}
