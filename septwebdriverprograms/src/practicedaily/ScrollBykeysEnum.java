package practicedaily;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBykeysEnum {

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
				driver.get("https://www.linkedin.com/");
				
				for(int i=0;i<10;i++){
					//scroll down
					driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				}
				Thread.sleep(3000);
				//scroll up
				for(int i=0;i<5;i++){
					driver.findElement(By.tagName("body")).sendKeys(Keys.UP);
					
				}
				Thread.sleep(3000);
				
				//close the browser
				driver.quit();
				
				
	}

}
