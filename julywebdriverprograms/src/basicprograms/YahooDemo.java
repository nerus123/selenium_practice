package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooDemo {

	public static void main(String[] args) {
		// set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
				
				// launch the browser
				// interface refvar=new implementing class();
				WebDriver driver = new ChromeDriver();
				
				// maximize the window
				driver.manage().window().maximize();
				
				// add implict wait
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
				
				// open url
				driver.navigate().to("https://www.yahoo.com");
				
				// fetch the title of the page
				String t = driver.getTitle();
				System.out.println("cureent page title is:" + t);
				
				// fetch the absurl of the page
				String absurl = driver.getCurrentUrl();
				System.out.println("current page of absolute url is:" + absurl);
				
				// fetch the currenrt page html source code
				String src = driver.getPageSource();
				
				// fetch th winow id
				String pid = driver.getWindowHandle();
				System.out.println("current page window id is:"+pid);
				
				//2.type the selenium keyword in serach edit box
				driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
				
				//3:click on searchbutton
				driver.findElement(By.id("uh-search-box")).submit();
				
				//4:verify the page title-selenium yahoo india search results
				//create an object for WebDriverWait class
				WebDriverWait wait=new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.titleContains("selenium - Yahoo Search Results"));
				
				//5:verify the results text --    22,800,000 results

			   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='left']/div/ol[2]/li/div/div/span")));
			   
			   
			   //6:fetch the resulr text and extarct number from it
			   String txt=driver.findElement(By.xpath("//*[@id='left']/div/ol[2]/li/div/div/span")).getText();
			   System.out.println("text is:"+txt);
			   
			   //extract number
			   String[]  str=txt.split(" ");
			   System.out.println("result count is:"+str[0]);
			   
			   //7:fetch the text
			   String txt1=driver.findElement(By.xpath("//a[contains(text(),' - Web Browser Automation')]")).getText();
			   System.out.println("text is:"+txt1);
			   
			   
				
				
				//close the browser
				driver.quit();

	}

}
