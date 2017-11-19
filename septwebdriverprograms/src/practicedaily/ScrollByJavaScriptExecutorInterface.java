package practicedaily;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollByJavaScriptExecutorInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		//WebDriver driver=new ChromeDriver();
		
  System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		WebDriver driver=new FirefoxDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://www.flipkart.com/");
		
		//create a variable to the JavascriptExecutor INterfcae and assign it to the driver variable
		//scroll down
		 JavascriptExecutor jsx=(JavascriptExecutor) driver;
		 jsx.executeScript("window.scrollBy(0,10000)", " ");
		 //scroll up
		 Thread.sleep(3000);
		 jsx.executeScript("window.scrollBy(10000,0)", " ");
		 Thread.sleep(3000);
		 //quit the browser
		 //driver.quit();
	}

}
