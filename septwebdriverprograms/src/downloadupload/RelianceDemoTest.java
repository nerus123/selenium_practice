package downloadupload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RelianceDemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		

		  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				WebDriver driver=new ChromeDriver();
		  //WebDriver driver=new FirefoxDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.get("https://myservices.relianceada.com/ImplStoreUserDetailsAction.do;jsessionid=ps07ZpJbzCnQFPJ1Q4Rpg4FG2kRBLZt7rnKY4Kv7HblGBLMJcQqD!656051667");
				
		//scroll down
				JavascriptExecutor jsx=(JavascriptExecutor) driver;
				jsx.executeScript("window.scrollBy(0,350)", "");
				
				//identify username
				driver.findElement(By.xpath("//input[@class='TxtBoxBig']")).sendKeys("rednerus");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nerus123");
				Thread.sleep(3000);
						
	//click on login
						driver.findElement(By.xpath("//span[text()='Login']")).click();
		//click on view bill
						driver.findElement(By.linkText("View Bill")).click();
	
		
		//close the browser
		//driver.close();
				
				

	}

	

}
