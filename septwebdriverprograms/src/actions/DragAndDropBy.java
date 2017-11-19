package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
							driver.get("http://jqueryui.com/draggable/");
							
							//identify the internal frame
							WebElement ifrm=driver.findElement(By.className("demo-frame"));
							
							//switch to the internal frame
							driver.switchTo().frame(ifrm);
							
							//create an object for Actions class
							Actions act=new Actions(driver);
							
							//identify the source
							WebElement src=driver.findElement(By.id("draggable"));
							
							//drag and drop by x and  coordinates
							act.dragAndDropBy(src, 50, 50).perform();
							
							Thread.sleep(3000);
							
							//close the browser
							driver.quit();

	}

}
