package practicedaily;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEbaypage {

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
							driver.get("https://www.ebay.in/");
							
							//create a variable for JavascriptExecutor and assign it to driver variable
							JavascriptExecutor jsx=(JavascriptExecutor) driver;
							//scroll down by java script executor
							jsx.executeScript("window.scrollBy(0,6000)"," ");
							Thread.sleep(3000);
							
							//scroll up bykeys enum
							for(int i=0;i<10;i++){
								driver.findElement(By.tagName("body")).sendKeys(Keys.UP);
							}
							Thread.sleep(3000);
							//closse the browser
							driver.quit();
							

	}

}
