package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Steps to Handle Drag and Drop through Selenium Web Driver
		1.Create Driver for any Browser(Mozilla)
		2.Go to the URL
		3.Create an Action object for Driver
		4.Fetch and create WebElement object for the SOURCE element.
		5.Fetch and create WebElement object for the DESTINATION element.
		6.Perform ACTION
		1.Click and Hold the source WebElement
		2.Move to destination WebElement
		3.Release the Element.
		*/
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			              
					//launch the browser
					WebDriver driver=new ChromeDriver();
			
			  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
					
					//launch the browser
					//WebDriver driver=new FirefoxDriver();
					
					//maximise the window
					driver.manage().window().maximize();
					
					//open the url
					driver.get("http://jqueryui.com/droppable/");
					
					//identify the iframe
					WebElement ifrm=driver.findElement(By.className("demo-frame"));
					
					//switch to internal frame
					driver.switchTo().frame(ifrm);
					
					//create an object for Actions class
					Actions act=new Actions(driver);
					
					//identify the source element
					WebElement src=driver.findElement(By.id("draggable"));
					
					//identify the target element
					
					WebElement trg=driver.findElement(By.id("droppable"));
					
					/*//act.dragAndDrop(src, trg).perform();
					act.clickAndHold(src).perform();
					act.moveToElement(trg).perform();
					act.release(trg).perform();*/
					
					act.dragAndDrop(src, trg).perform();
					
					Thread.sleep(3000);
					
					//close the browser
					driver.quit();
					

	}

}
