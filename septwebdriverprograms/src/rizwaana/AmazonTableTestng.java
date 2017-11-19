package rizwaana;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.Table;


public class AmazonTableTestng {
  @Test
  public void clickLinkInTable() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		WebDriver driver=new FirefoxDriver();
	  
	  //System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		//WebDriver driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		  //open url
		driver.get("https://www.amazon.com/");

		WebElement table = driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']"));
		
		//fetch no of rows
		List<WebElement>rows=table.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr"));
		System.out.println("number of rows:"+rows.size());
		
		//fetch no of columns
		List<WebElement>columns=table.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[1]/td"));
		System.out.println("number of columns:"+columns.size());
		
		
		//click the first row 3nd column link
		WebElement element=table.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[1]/td[3]"));
		element.click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		}
  
  
  
  
		
		
  
}
