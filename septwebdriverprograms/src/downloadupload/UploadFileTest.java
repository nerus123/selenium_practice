package downloadupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFileTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		

		  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				WebDriver driver=new ChromeDriver();
		  //WebDriver driver=new FirefoxDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//set file fromupload
				StringSelection sel=new StringSelection("C:\\NEERAJA\\resume-samples.pdf");
				
				//copy to system clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				//open the url
				driver.get("https://www.google.com/");
				String pid=driver.getWindowHandle();
				System.out.println("window id is:"+pid);
				
				//click on gmail limk
				driver.findElement(By.linkText("Gmail")).click();
				
				//click on signin link
				driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
				
				//verify the page title
				WebDriverWait wait=new WebDriverWait(driver,50);
				wait.until(ExpectedConditions.titleContains("Gmail"));
				System.out.println("title is verified");
				
				//identify emailedit box
				driver.findElement(By.id("identifierId")).sendKeys("nerus123@gmail.com");
				
				//click on next button
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				//verify the page title
				wait.until(ExpectedConditions.titleContains("Gmail"));
				Thread.sleep(3000);
				
				//identify password editbox
				driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Cherry123$");
				
				//click on next button
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				Thread.sleep(3000);
				
				//T-I J-J5-Ji T-I-KE L3
				//T-I J-J5-Ji T-I-KE L3
				
				//idenity compose element
				driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
				Set<String>handles=driver.getWindowHandles();
				System.out.println(handles.size());
				for(String h:handles){
					if(pid.equals(h)){
						//switch to child window
						driver.switchTo().window(h);
						//idenity to editbox
						//:13t
						//:11m
						//identify base node
						driver.findElement(By.xpath("//span[text()='To']/following::textarea")).sendKeys("surenderr@gmail.com");
					
						//Thread.sleep(5000);
						//:11h
						//:11h


						//idenity attach file element
						driver.findElement(By.xpath("//div[text()='Send']/following::div[10]")).click();
						
						//creatr an object for Robot class
						Robot r=new Robot();
						Thread.sleep(3000);
						
						//press enter
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
						
						//press control+v
						r.keyPress(KeyEvent.VK_CONTROL);
						r.keyPress(KeyEvent.VK_V);
						r.keyRelease(KeyEvent.VK_CONTROL);
						r.keyRelease(KeyEvent.VK_V);
						Thread.sleep(3000);
						
						//press enter
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
						
						//driver.findElement(By.xpath("//*[@id=':k2']")).sendKeys("hii");
						
						
						
						
						
						
						//driver.findElement(By.xpath("//*[@id=':6p']")).click();
						driver.findElement(By.xpath("//div[text()='Send']")).click();
						
						//
						//handle the alert
						Alert alt=driver.switchTo().alert();
						alt.accept();
						
						//close the browser
						//driver.quit();
					}
				}
				
				

	}

}
