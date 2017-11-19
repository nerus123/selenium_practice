package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMoveBetweenTabs {

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
		driver.get("https://www.google.com/");
		
		//identify gmail link
		WebElement gmail_link=driver.findElement(By.linkText("Gmail"));
		
		//createa an object for Actions class
		Actions act=new Actions(driver);
		act.moveToElement(gmail_link).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		//identify signin linkand click
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		
		//identify signin_editbox
		WebElement signin_editbox=driver.findElement(By.id("identifierId"));
		signin_editbox.sendKeys("webdriver");
		
		//close the browser
		driver.quit();

	}

}
