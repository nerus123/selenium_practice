package rizwaana;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ReadDataFromExcel {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
  @Test
  public void googleTest() throws IOException, BiffException, InterruptedException {
	  FileInputStream fi=new FileInputStream("C:\\NEERAJA\\search.xls");
	  
	  //get the workbook from file
	  Workbook w=Workbook.getWorkbook(fi);
	  
	  //get the sheet from workbook
	  Sheet s=w.getSheet(0);
	  
	//open url
	  driver.get("https://www.google.com/");
	  
	  for(int i=1;i<s.getRows()-1;i++){
		  
		  //find the search edit box
		  WebElement src_edit=driver.findElement(By.id("lst-ib"));
		  src_edit.clear();
		  src_edit.sendKeys(s.getCell(0, i).getContents());
		  
		  Thread.sleep(3000);
		  
		  //submit
		  driver.findElement(By.id("lst-ib")).submit();
		  
		  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("resultStats")));
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
	  
	  //close the browser
	  driver.quit();
  }

}
