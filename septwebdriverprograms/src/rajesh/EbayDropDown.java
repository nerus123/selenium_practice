package rajesh;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class EbayDropDown {
	public static WebDriver driver=null;
  @Test
  public void SelectDropDown(){
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	//set the chromedriver path
			System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
	              
			//launch the browser
			 driver=new ChromeDriver();
			 
			 //maximise the window
			 driver.manage().window().maximize();
			 
			 //add implicit wait
			 
			
			//open the url
			driver.get("https://www.ebay.in/"); 
			
			//identify the all catagories dropdown
			WebElement allcat_drp=driver.findElement(By.id("gh-cat"));
			
			//create an object for select class
			Select sel=new Select (allcat_drp);
			//select an option by visibletext
			sel.selectByVisibleText("Automotive");
			Thread.sleep(3000);
  }

  @AfterClass
  public void afterClass() {
	  //close the browser
	  driver.quit();
	  
  }

}
