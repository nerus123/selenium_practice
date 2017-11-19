package actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BetweenWindow {

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
					driver.get("https://www.google.com/");
					String pid=driver.getWindowHandle();
					System.out.println(pid);
					
					//identify the about link
					WebElement c=driver.findElement(By.linkText("About"));
					
					//create an object for Actions class
					Actions act=new Actions(driver);
					act.moveToElement(c).perform();
					
					Action seriesofActions=act.contextClick(c).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
					seriesofActions.perform();
					
					Thread.sleep(3000);
					
					//click on our products link
					driver.findElement(By.linkText("Our products")).click();
					
					//navigate back twice
					driver.navigate().back();
					
					driver.navigate().back();
					
					//identify the textbox and type webdriver
				driver.findElement(By.id("lst-ib")).sendKeys("webdriver");
				driver.findElement(By.id("lst-ib")).submit();
				Thread.sleep(3000);
				
				//close the browser
				driver.quit();
				
				
				
					
					
					

	}

}
