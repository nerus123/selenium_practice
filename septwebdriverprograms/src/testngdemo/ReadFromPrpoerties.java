package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ReadFromPrpoerties {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
  @Test
  public void f() throws IOException, InterruptedException {
	  Properties prop=new Properties();
	 //read file
	  FileInputStream fi=new FileInputStream("C:\\NEERAJA\\workspace\\septwebdriverprograms\\facebookdata.properties");
	prop.load(fi);
	System.out.println("read all properties");
	  //open url
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id(prop.getProperty("email_editbox"))).sendKeys(prop.getProperty("email_val"));
	  
	  driver.findElement(By.id(prop.getProperty("pass_editbox"))).sendKeys(prop.getProperty("pass_val"));
	  Thread.sleep(3000);
	  //click on login
	  driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
	  Thread.sleep(3000);
	  //wait.until(ExpectedConditions.titleContains("Facebook"));
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		 driver=new FirefoxDriver();
		
	  //System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
	  //driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		 wait=new WebDriverWait(driver,60);	    
	    
	  
  }

  @AfterClass
  public void afterClass() {
	//close the browse
	  //driver.quit();
	  
  }

}
