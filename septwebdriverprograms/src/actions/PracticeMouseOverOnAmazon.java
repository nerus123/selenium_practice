package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeMouseOverOnAmazon {

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
		driver.get("https://www.flipkart.com/");
		
		//identify electronic element and mouse over
		WebElement electronics=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		
		//create an object for Actions class
		Actions act=new Actions(driver);
		
		//mouseover on electronics
		act.moveToElement(electronics).perform();
		
		Thread.sleep(3000);
		
		//identify samsung link and clik
		WebElement samsun_link=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));
		samsun_link.click();
		
		//verify the page title
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Samsung Mobile Phones | Buy Samsung Mobile Phones at Best Price in India | Flipkart.com"));
		System.out.println("page title is verified");
		
		//fetch the text
		String txt=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div[1]/div/h1")).getText();
		System.out.println(txt);
		
		//close the brower
		driver.quit();
		
	}

}
