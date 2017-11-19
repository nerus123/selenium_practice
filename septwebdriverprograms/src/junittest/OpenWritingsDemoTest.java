package junittest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenWritingsDemoTest {
	public static WebDriver driver=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
				//launch the browser
				 driver=new ChromeDriver();
				
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//close the browser
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//open the url
		driver.get("http://openwritings.net/sites/default/files/radio_checkbox.html");
			//verify the page title
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Test Page: Radio buttons / Check boxes"));
		
		//click
		driver.findElement(By.xpath("//input[@value='tue']")).click();
		Thread.sleep(3000);
		
	}

}
