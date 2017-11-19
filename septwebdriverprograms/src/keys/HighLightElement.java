package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement {
	public static WebDriver driver=null;
	
	public static void highLightElement(WebDriver driver,WebElement element) throws InterruptedException{
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		jsx.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 5px red')", element);
		Thread.sleep(3000);
		jsx.executeScript("arguments[0].setAttribute('style','border:2px white')", element);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		//launch the browser
 driver=new ChromeDriver();

  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		//WebDriver driver=new FirefoxDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://www.linkedin.com/");
		
		//identify username editbox;
		WebElement username_editbox=driver.findElement(By.id("login-email"));
		highLightElement(driver,username_editbox);
		
		Thread.sleep(3000);
		//close the browser
		driver.quit();

	}

}
