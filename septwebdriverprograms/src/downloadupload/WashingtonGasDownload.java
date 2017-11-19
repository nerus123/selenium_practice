package downloadupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WashingtonGasDownload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		

		  System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				//WebDriver driver=new ChromeDriver();
		  WebDriver driver=new FirefoxDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open url
				driver.get("https://eservice.washgas.com/Pages/Login.aspx");
				
				
				//identify email
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surenderr@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cherry123$");
				
				//click on signin button
driver.findElement(By.id("ctl00_SPWebPartManager1_g_778d3a08_260c_4a12_808d_a051c9581a61_ctl00_btnSignIn")).click();
//explicit wait
//WebDriverWait wait=new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.titleContains(" 	      Account Summary - Washington Gas eService Center  "));
				
				//click on billing and payemts
driver.findElement(By.xpath("//*[@id='zz2_CurrentNav']/div/ul/li[2]/a/span/span[1]")).click();
			
//click on bill and payment history
driver.findElement(By.xpath("//*[@id='zz3_CurrentNav2']/div/ul/li[2]")).click();

//idenity the dropdown
WebElement drp=driver.findElement(By.xpath("//*[@id='ctl00_SPWebPartManager1_g_bed3be53_cfc8_4589_ae53_958f96e4a203_ctl00_ddlBillDate']"));
//create an object for select class
Select sel=new Select(drp);
//select an option by index
sel.selectByIndex(1);

Thread.sleep(3000);

//click on view printable bill
driver.findElement(By.xpath("//*[@id='ctl00_SPWebPartManager1_g_bed3be53_cfc8_4589_ae53_958f96e4a203_ctl00_ucViewBill_btnViewBill']")).click();


/*//create an object for Robot class			
Robot r=new Robot ();
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);*/

Thread.sleep(8000);

//close the browser
driver.quit();

	}

}
