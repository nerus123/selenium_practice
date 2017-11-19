package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		
		//identify the internalfrqme
		WebElement ifrm=driver.findElement(By.className("demo-frame"));
		
		//switch to iframe
		driver.switchTo().frame(ifrm);
		
		//identify the source
		WebElement src=driver.findElement(By.id("draggable"));
		
		//identify the target*
		WebElement trg=driver.findElement(By.id("droppable"));
		
		//cretae an object for Actions class
		Actions act=new Actions(driver);
		
		
		//act.dragAndDrop(src, trg).perform();
		
		act.clickAndHold(src).perform();
		act.moveToElement(trg).perform();
		act.release(trg).perform();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		

	}

}
