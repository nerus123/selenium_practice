package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BuildingASeriesOfActions {

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
					
					//identify the emailedit box
					WebElement email_editbox=driver.findElement(By.id("login-email"));
					
					
					//create an object for Actions class
					Actions act=new Actions(driver);
					
				Action seriesofactions=act.moveToElement(email_editbox).click()
						                    .keyDown(email_editbox, Keys.SHIFT)
                                              .sendKeys(email_editbox, "webdriver")
                                              .keyUp(email_editbox, Keys.SHIFT)
                                              .doubleClick(email_editbox)
                                              .contextClick(email_editbox)
                                              .build();
				
				
				seriesofactions.perform();
				
				Thread.sleep(3000);
				
				//close the browser
				driver.quit();
				
	}

}
