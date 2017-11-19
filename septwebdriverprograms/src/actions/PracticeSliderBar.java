package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSliderBar {

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
		driver.get("http://jqueryui.com/slider/");
		
		//identify the internal frame
		WebElement ifrm=driver.findElement(By.className("demo-frame"));
		
		//switch to iframe
		driver.switchTo().frame(ifrm);
		
		//idenity the slider bar
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		//create an object for Actions class
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider,120,0).perform();
		
		Thread.sleep(3000);
		
		//quit the browser
		driver.quit();

	}

}

