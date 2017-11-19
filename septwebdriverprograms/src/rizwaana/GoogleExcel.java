package rizwaana;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class GoogleExcel {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	public static  FileInputStream fi=null;
  @Test
  public void f() throws BiffException, IOException, InterruptedException {
	  //read file from excel
	   fi=new FileInputStream("C:\\NEERAJA\\google.xls");
	  
	  
	  //get workbook form file
	  Workbook w=Workbook.getWorkbook(fi);
	  
	  //get sheet from workbook
	  Sheet s=w.getSheet(0);
	  
	  Properties prop=new Properties();
	  fi=new  FileInputStream("C:\\NEERAJA\\workspace\\septwebdriverprograms\\google.properties");
	  prop.load(fi);
	  
	 //open url
	  driver.get("https://www.google.com/");
	  
	  //verify the page title
	  wait.until(ExpectedConditions.titleContains("Google"));
	  for(int i=1;i<=s.getRows()-1;i++){
	  //idenity the search edit box
	  WebElement src_editbox=driver.findElement(By.id(prop.getProperty("src_editbox")));
	  src_editbox.clear();
	  src_editbox.sendKeys(s.getCell(0, i).getContents());
	  
	  src_editbox.submit();
	  Thread.sleep(3000);
	  
	  
  }
  }	  
  @BeforeClass
  public void beforeClass() {
	  
	////set the chromedriver path
			System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			//launch the browser
			 driver=new ChromeDriver();
			 //maximise the window
			 driver.manage().window().maximize();
			 wait=new WebDriverWait(driver,30);
  }

  @AfterClass
  public void afterClass() {
	  
	  //close the browser
	  driver.close();
  }

}
