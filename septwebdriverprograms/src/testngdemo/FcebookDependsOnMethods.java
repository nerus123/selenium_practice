package testngdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class FcebookDependsOnMethods {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
  @Test(priority=0)
  public void openBrowser() {
	//set the system variable gecko driver
			System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			//launch the browser
			//interface refvar=new implementing class();\
		 driver=new FirefoxDriver();
	  //System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 //driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 //open url
		 driver.get("https://www.facebook.com/");
  }
		 @Test(dependsOnMethods="openBrowser")
		 public void signIn(){
			 
			 //identify emailorphone edit box
			  driver.findElement(By.id("email")).sendKeys("nerus123@gmail.com");
			  //iddenity password edit box
			  driver.findElement(By.id("pass")).sendKeys("cherry123");
			  
			  //click on login
			  driver.findElement(By.id("loginbutton")).click(); 
			 
		 }
		 @Test(dependsOnMethods={"signIn","openBrowser"})
		 public void logOUT(){
			 
			  driver.findElement(By.id("logoutMenu")).click();
				

				  driver.findElement(By.linkText("Log Out")).click();
		 }
		 
	  
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
