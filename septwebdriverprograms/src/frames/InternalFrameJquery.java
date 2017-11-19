package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InternalFrameJquery {

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
					driver.get("http://jqueryui.com/");
					List<WebElement>frms=driver.findElements(By.tagName("iframe"));
					System.out.println(frms.size());
		
			//2)click on autocomplete link under widget section
					//create an object for WebDriverWait class
					WebDriverWait wait=new WebDriverWait(driver,30);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[2]/a")));
					driver.findElement(By.linkText("Autocomplete")).click();
			//3)verify the page title--Autocomplete|JqueryUi
					//WebDriverWait wait=new WebDriverWait(driver,30);
					wait.until(ExpectedConditions.titleContains("Autocomplete | jQuery UI"));
					List<WebElement>ifrms=driver.findElements(By.tagName("iframe"));
					System.out.println(ifrms.size());
			//4)handle the iframe
					WebElement ifrm=driver.findElement(By.className("demo-frame"));
					
					//switch to the iframe
					driver.switchTo().frame(ifrm);
			//5)type the keyword -webdriver in tags editbox..
					driver.findElement(By.id("tags")).sendKeys("webdriver");
			//6)navigate back to previous page
					driver.switchTo().defaultContent();
			//7)click on accordion link under widget section.
					wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accordion")));
					driver.findElement(By.linkText("Accordion")).click();
			//8)verify the page title..
					wait.until(ExpectedConditions.titleContains("Accordion | jQuery UI"));
					
					//quit the browser
					driver.close();

	}

}
