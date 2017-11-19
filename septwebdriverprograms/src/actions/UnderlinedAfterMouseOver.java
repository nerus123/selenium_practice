package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderlinedAfterMouseOver {

	public static void main(String[] args) {
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
					
					//identify gmail liknk
					WebElement gmail_link=driver.findElement(By.xpath("//a[text()='Gmail']"));
					String css=gmail_link.getCssValue("text-decoration");
					System.out.println("before mouser on gmail link :"+css);
					
					//create an object foe Actions class
					Actions act=new Actions(driver);
					
					act.moveToElement(gmail_link).perform();
					String css1=gmail_link.getCssValue("text-decoration");
					
					System.out.println("after mouser on gmail link :"+css1);
					//quit the browser
					driver.quit();
					
					
					

	}

}
