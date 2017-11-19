package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException {
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
		driver.navigate().to("https://www.google.com");
		
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

		//2:type the keyword selenium in serach edit box in google home page
		 driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		 
		 //3:submit on editbox
		 driver.findElement(By.id("lst-ib")).submit();
		 //verify wheteher results text is displayed or not and page title also
		 //verify the page title
		 //create an object for a WebDriverWait class
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.titleIs("selenium - Google Search"));
		 //verify results text is displayed or not
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		 
		 //4:fetch the results count text and extract only number from it
		 String txt=driver.findElement(By.cssSelector("div#resultStats")).getText();
		 System.out.println("text is:"+txt);
		 
		 //extract number from it--About 26,500,000 results (0.74 seconds)
		 String[] str=txt.split(" ");
		 System.out.println("result count is:"+str[1]);
		
		 //5:click on selenium linkin results page
		 driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		 
		 //6:verify the next page title
		 wait.until(ExpectedConditions.titleContains("Selenium - Web Browser Automation"));
		 Thread.sleep(3000);
		 
		 //7:click on download tab
		 driver.findElement(By.cssSelector("#menu_download > a")).click();
		
		
		//close the browser
		driver.quit();

	}

}
