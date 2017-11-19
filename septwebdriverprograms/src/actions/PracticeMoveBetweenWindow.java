package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PracticeMoveBetweenWindow {

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
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		//idenity the about element
		WebElement about=driver.findElement(By.linkText("About"));
		
		//right click on about link
		//create an object for Actions class
		Actions act=new Actions(driver);
		
		Action seriesofactions=act.contextClick(about).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
		seriesofactions.perform();
		
		//click on products link
		driver.findElement(By.linkText("Our products")).click();
		//go back to previous page  2 times
		driver.navigate().back();
		driver.navigate().back();
		
		//idenify the editbox and webdriver keyword
		driver.findElement(By.id("lst-ib")).sendKeys("webdriver");
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();

	}

}
