package rizwaana;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlipkartTablesTestng {
  @Test
  public void TablesDemo() {
		//set the chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		
		//launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		 //maximise the window
		 driver.manage().window().maximize();
		 
		 //open the url
		 driver.get("https://www.flipkart.com/");
		 
		 //verify the page title
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.titleContains("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));
		 
		 
		//fetch all links into collection
		 List<WebElement>tot_tables=driver.findElements(By.tagName("table"));
		 System.out.println("total number of tables in flipkart page:"+tot_tables.size());
		
		 
		 
		 //close the broswer
		 driver.quit();

	  
	  
  }
}
