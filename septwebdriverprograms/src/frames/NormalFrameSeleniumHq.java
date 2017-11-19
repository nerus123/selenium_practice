package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NormalFrameSeleniumHq {

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
							driver.get("http://www.seleniumhq.org/");

		//1)open seleniumhq.org website
	//2)click on download tab
		driver.findElement(By.linkText("Download")).click();					
	//3)click on javadoc link under webdriver bindings section
		driver.findElement(By.linkText("Javadoc")).click();
	//4)verify the next page title---overview
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Overview"));
		//fetch all frames
		List<WebElement>frms=driver.findElements(By.tagName("frame"));
		System.out.println(frms.size());
		
	//5)switch to All Classes frame.
		driver.switchTo().frame("packageFrame");
	//6)click on WebDriver link in thta frame.
		driver.findElement(By.linkText("WebDriver")).click();
	//7)verify the page title.
		wait.until(ExpectedConditions.titleContains("WebDriver"));
		//switch to original positio
		driver.switchTo().defaultContent();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//switch to rightside frame
		driver.switchTo().frame("classFrame");
	//8)verify the Interface WebDriver text..in another frame.
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("html/body/div[3]/h2"), "Interface WebDriver"));
		
		//close the browser
		driver.quit();
	}

}
