package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMouseOverSalesForce {

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
		driver.get("https://www.salesforce.com/");
		
		//identify product elemnt to mouse over
		WebElement products=driver.findElement(By.linkText("Products"));
		
		//create an object for c class
		Actions act=new Actions(driver);
		act.moveToElement( products).perform();
		Thread.sleep(3000);
		
		//identify product overview and click
	
		WebElement product_overview=driver.findElement(By.xpath("//*[@id='products_menu_item']/div/div/div/div/div/div/div[1]/div[1]/div/div/ul/li[1]/a/span"));
		product_overview.click();
		
		//close the browser
		driver.quit();
	}
	
	

}
