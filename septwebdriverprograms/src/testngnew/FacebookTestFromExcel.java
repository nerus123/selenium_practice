package testngnew;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class FacebookTestFromExcel {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	
  @Test
  public void facebookTestExcel() throws BiffException, IOException, InterruptedException {
	  //create an object for FileInputStream class
	  FileInputStream fi=new FileInputStream("C:\\Users\\Surender\\Desktop\\facebookdata.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet(0);
	int r=s.getRows();
	System.out.println("number of rows in sheet:"+r);
	int c=s.getColumns();
	System.out.println("number of columns in sheet:"+c);
	//open url
	  driver.get("http://www.facebook.com");
	  for(int i=1;i<=s.getRows()-1;i++){
		  
			  //check for the edit box
			  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
			  //idenity the email edit box
			  WebElement email_editbox=driver.findElement(By.id("email"));
			  email_editbox.clear();
			  String username=s.getCell(0, i).getContents();
			  System.out.println(username);
			  email_editbox.sendKeys(s.getCell(0, i).getContents());
			  //check for the password esit box
			  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
			  //idenity email editbox
			  WebElement pass_editbox=driver.findElement(By.id("pass"));
			  pass_editbox.clear();
			  String password=s.getCell(1, i).getContents();
			  System.out.println(password);
			  pass_editbox.sendKeys(s.getCell(1, i).getContents());
			  Thread.sleep(3000);
			 
			  //click on loginbutton
			  driver.findElement(By.id("loginbutton")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("userNavigationLabel")).click();
			  
				//*[@id='js_wi']/div/div/ul/li[18]/a/span/span
				  //driver.findElement(By.xpath("//*[@id='js_wi']/div/div/ul/li[18]/a/span/span")).click();
				  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
				  driver.findElement(By.partialLinkText("Log Out")).click();
				  
			  
			  
		  
	  }
	  
	  
  }
 

  @BeforeClass
  public void beforeClass() {
	//set the gcekodriver path
		//System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		//driver=new FirefoxDriver();
		 
		//set the chromedriver path
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
	  driver.close();
	  
  }

}
