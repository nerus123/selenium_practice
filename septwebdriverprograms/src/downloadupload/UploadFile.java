package downloadupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class UploadFile {
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			              
					//launch the browser
					 driver=new ChromeDriver();
			
			  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
					
					//launch the browser
					//WebDriver driver=new FirefoxDriver();
					
					//maximise the window
					driver.manage().window().maximize();
					
					//specify file location with extension
					StringSelection  sel=new StringSelection("C:\\NEERAJA\\resume-samples.pdf");
					
					//copy to clipboard
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
					
					//open the url
					driver.get("http://my.monsterindia.com/create_account.html");
					
					Thread.sleep(3000);
					//fetch parent window id
					String pid=driver.getWindowHandle();
					
				Set<String>handles=driver.getWindowHandles();
				
				for(String h:handles){
					if(!pid.equals(h)){
						//switch to child window
						driver.switchTo().window(h);
						//close the child winow
						driver.close();
					}
				}
				
				//switch to parent winow
				driver.switchTo().window(pid);
				
				//scrolling down by javascriptexecutor
				JavascriptExecutor jsx=(JavascriptExecutor) driver;
				jsx.executeScript("window.scrollBy(0,350)", " ");
				
				//clicking on browser option
				driver.findElement(By.id("wordresume")).click();
				Thread.sleep(3000);
				
				System.out.println("browse button clicked");
				
				
				//create an object for robot class
				Robot r=new Robot();
				Thread.sleep(3000);
				
				
				//press enter
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				//press CTRL+V;
				
	                   
				//press enter
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				
				r.keyRelease(KeyEvent.VK_V);
				Thread.sleep(3000);
				
				//press enter
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(7000);
			driver.quit();

	}

}
