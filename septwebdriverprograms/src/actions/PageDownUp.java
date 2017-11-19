package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PageDownUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
									driver.get("https://www.amazon.com/");
									
									//identify the search edit box
									WebElement searchedit_box=driver.findElement(By.id("twotabsearchtextbox"));
									searchedit_box.sendKeys("bonnie jean dresess");
									
									//cretae an object for Action class
									 Actions act=new  Actions(driver);
									 act.sendKeys(Keys.ENTER).perform();
									 
									 //one step move page down
									 act.sendKeys(Keys.PAGE_DOWN).perform();
									
									 
									 //page up
									 act.sendKeys(Keys.PAGE_UP).perform();
	}

}
