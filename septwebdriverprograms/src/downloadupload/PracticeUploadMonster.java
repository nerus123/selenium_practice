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

public class PracticeUploadMonster {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		

		  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				WebDriver driver=new ChromeDriver();
		  //WebDriver driver=new FirefoxDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//set path to upload file
				StringSelection sel=new StringSelection("C:\\NEERAJA\\resume-samples.pdf");
				
				//copy to clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				
				
				//implict wait
		
				
				//open the url
				driver.get("http://my.monsterindia.com/create_account.html");
				
				//fetch winow id
				String pid=driver.getWindowHandle();
				System.out.println("window id is:"+pid);
				
				//fetch all window ids
				Set<String>handles=driver.getWindowHandles();
				System.out.println(handles.size());
				for(String h:handles){
					if(!pid.equals(h)){
						//switch to child window
						driver.switchTo().window(h);
						
						//close the child window
						driver.close();
					}
				}
//switch to parent window
				driver.switchTo().window(pid);
				
				//scroll down
				JavascriptExecutor jsx=(JavascriptExecutor) driver;
				jsx.executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(3000);
				
				//identify browse button element
				driver.findElement(By.id("wordresume")).click();
				
				//cretae an object for robot class
				Robot r=new Robot();
				Thread.sleep(3000);
				
				//press enter
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				//press contro and v
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);
				Thread.sleep(3000);
				
				//press enter
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(7000);
				
				//close the browser
				driver.quit();
	}

}
