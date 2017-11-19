package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageDownUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
	

  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://www.amazon.com/");
		
		//verifythe page title
		new WebDriverWait(driver,30).until(ExpectedConditions.titleContains("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
		System.out.println("page titlle is verified");
		
		//type the mobile keyword in search edit box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		//create an object for actions class
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		//page down
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		//page down
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		//close the browser
		driver.quit();
	}

}
