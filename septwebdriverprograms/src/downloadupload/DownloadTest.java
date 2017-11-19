package downloadupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		

		  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				WebDriver driver=new ChromeDriver();
		//  WebDriver driver=new FirefoxDriver();
				
				//maximise the window
				driver.manage().window().maximize();

				//open the url
				driver.get("https://www.google.com/?gws_rd=ssl");
				
				//type the java download in search editbox
				driver.findElement(By.id("lst-ib")).sendKeys("java download");
				
				driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
				
				WebDriverWait wait=new WebDriverWait(driver,30);
				
				wait.until(ExpectedConditions.titleContains("java download - Google Search"));
				Thread.sleep(3000);
				//click on Feedback
				//Download Free Java Software
				
				driver.findElement(By.linkText("Download Free Java Software")).click();

				
				//verify the page title
				//WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.titleContains("Download Free Java Software"));
				
				//click on free download java
				driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
				
				Thread.sleep(3000);
				
				//click on agree and free download software
				driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();
				
				Thread.sleep(5000);
				
				//create an object for Robot class
				Robot r=new Robot();
				//press tab
				r.keyPress(KeyEvent.VK_TAB);
				//r.keyRelease(KeyEvent.VK_TAB);
				
				//press enter
				
				r.keyPress(KeyEvent.VK_ENTER);
				//r.keyRelease(KeyEvent.VK_ENTER);
				//close the browser
				//driver.quit();

	}

}
