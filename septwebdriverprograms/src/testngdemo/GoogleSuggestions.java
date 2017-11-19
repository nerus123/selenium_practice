package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSuggestions {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		 wait=new WebDriverWait(driver,30);
	}
  @Test
  public void googleSuggestions() {
	 //open url
	  driver.get("https://www.google.com/");
	  
	  //idenity search edit box
	  driver.findElement(By.id("lst-ib")).sendKeys("java");
	  
	  //fetch all google suggestions into collection
	  List<WebElement>allsugg=driver.findElements(By.className("sbdd_b"));
	  for(WebElement g:allsugg){
		  System.out.println(g.getText());
	  }
	  
  }
  
  @AfterClass
  public void quitBrowser(){
	  driver.quit();
  }
}
