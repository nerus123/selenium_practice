package rizwaana;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ReadDataForFacebook {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
  @Test
  public void f() throws BiffException, IOException, InterruptedException {
	  FileInputStream fi=new FileInputStream("C:\\NEERAJA\\facebookdetails.xls");
	  
	  Workbook w=Workbook.getWorkbook(fi);
	  
	  Sheet s=w.getSheet(0);
	  
	  //open url
	  driver.get("https://www.facebook.com/");
	  
	  for(int i=1;i<s.getRows();i++){
		 WebElement edit_box= driver.findElement(By.id("email"));
		 edit_box.clear();
		
		edit_box.sendKeys(s.getCell(0, i).getContents());
		  //iddenity password edit box
		  driver.findElement(By.id("pass")).sendKeys(s.getCell(1, i).getContents());
		  
		  //click on login
		  driver.findElement(By.id("loginbutton")).click();
		  Thread.sleep(3000);
		  //click for logout
		  driver.findElement(By.id("userNavigationLabel")).click();
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
		  driver.findElement(By.linkText("Log Out")).click();
		  
		  Thread.sleep(3000);
	  }
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
	  driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		 wait=new WebDriverWait(driver,60);	    
	  
  }

  @AfterClass
  public void afterClass() {
	  //close the browse
	  driver.quit();
	  
  }

}
