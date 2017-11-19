package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveBtweenTabs {

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
							
							//identify gmail liknk
							WebElement gmail_link=driver.findElement(By.xpath("//a[text()='Gmail']"));
							//open gmail lik in new tab
							//move to gmail
							//so first we create an object for actions class
							Actions act=new Actions(driver);
							
							act.moveToElement(gmail_link).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
							
							Thread.sleep(3000);
							//identify the sign_link
							WebElement Signin_link=driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
							
							Signin_link.click();
							
							
							//identify the email edit box
						driver.findElement(By.id("identifierId")).sendKeys("webdriver");
						Thread.sleep(3000);
						
						//close the tab with keys
						act.sendKeys(Keys.chord(Keys.CONTROL,Keys.F4)).perform();
						
						//close the browser
						driver.quit();

	}

}
