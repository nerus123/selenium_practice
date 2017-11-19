package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		

		  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.get("https://www.google.com/");
				
				//open new tb
				driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"T");
				
				driver.get("https://www.yahoo.com/");
				
				//close the open tab
				//driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"w");
				
				Thread.sleep(3000);
				driver.findElement(By.id("yschsp")).sendKeys("cucumber");
				

	}

}
