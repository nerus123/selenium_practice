package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class IMDBTestPrioritazation {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
  @Test(timeOut=2000)
  public void checkBoxTest() throws InterruptedException {
	  //idenity the checkboxes and fetch into collection
	  List<WebElement>cb=driver.findElements(By.name("genres"));
	  System.out.println(cb.size());
	  for(WebElement c:cb){
		 
		  if(!c.isSelected()){
			  //check the checkbox
			 
			  c.click();
			  //wait for the spinner to be invisible
			  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("center-spinner")));
			  
		  }
	  }
	  
	  
	  Thread.sleep(3000);
  }
  @Test
  public void top35InspirationalMovies() {
	  
	  ////*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a
	  ////*[@id='main']/div/div[7]/div[3]/div[3]/b/a
	  //fetch all elements into collection
	  List<WebElement>alllinks=driver.findElements(By.xpath("//*[@id='main']/div/div[7]/div"));
	  System.out.println(alllinks.size());
	  for(int i=1;i<=alllinks.size();i++){
		  System.out.println("****************************************************8");
		  //fetch the link text
		  String txt=driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).getText();
		  System.out.println(txt);
		  //fetch the url of tthe link
		  String url=driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).getAttribute("href");
		  System.out.println(url);
		  //click on each link
		  driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).click();
		  driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).click();
			if(driver.getTitle().contains(txt)){
				System.out.println("correct page is dispalyed:"+driver.getTitle());
			}else{
				System.out.println("correct page is not dispalyed:"+driver.getTitle());
			}
		  //goback to previous page
		  driver.navigate().back();
		  
	  }
	  
  }

  @BeforeMethod
  public void beforeMethod(){
	  //open url
	  driver.get("http://www.imdb.com/list/ls000632473/");
	  wait.until(ExpectedConditions.titleContains("IMDb: Top 35 inspirational movies - a list by K_kugelis"));

	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" i am in @aftermethod class");
	  
  }
  @BeforeClass
  public void launchBrowser(){
	//set the ie path
		//System.setProperty("webdriver.ie.driver", "C:\\NEERAJA\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
            
		//launch the browser
		 //driver=new InternetExplorerDriver();
	  
	//@before class executes only once
	  
	//set the system variable gecko driver
		System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//launch the browser
		//interface refvar=new implementing class();\
	 driver=new FirefoxDriver();
	  ////set the chromedriver path
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 //driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		 wait=new WebDriverWait(driver,70);
  }
  @AfterClass
  public void quitBrowser(){
	  //close the browser
	  driver.quit();
  }

}
