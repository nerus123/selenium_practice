package rajesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		 
		 //maximise the window
		 driver.manage().window().maximize();
		 
		 //add implicit wait
		 
		
		//open the url
		driver.get("https://www.flipkart.com/"); 
		
		List<WebElement>tables=driver.findElements(By.tagName("table"));
		System.out.println(tables.size());
		
		//identify electronics menu
		WebElement ele_menu=driver.findElement(By.xpath("//span[text()='Electronics']"));
		//create an object for actions class
		Actions act=new Actions(driver);
		act.moveToElement(ele_menu).perform();
		Thread.sleep(3000);
		
		//click on samsung
		driver.findElement(By.xpath("//span[text()='Routers']")).click();
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
		
		

	}

}
