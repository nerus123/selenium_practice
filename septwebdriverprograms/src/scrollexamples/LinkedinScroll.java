package scrollexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LinkedinScroll {

	public static void main(String[] args) throws InterruptedException {
	///set the chromedriver path
			System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
	              
			//launch the browser
			WebDriver driver=new ChromeDriver();
			
			//maximise the window
			driver.manage().window().maximize();
			
			//open the url
			driver.get("https://www.linkedin.com/");
			
			//fetch the page title
			String txt=driver.getTitle();
			System.out.println("page title is:"+txt);

			//fetch the current page url
			String url=driver.getCurrentUrl();
			System.out.println("current page absolute url is:"+url);
			
			
			//fetch page source
			String src=driver.getPageSource();
			
			//get window handle
			String pid=driver.getWindowHandle();
			System.out.println("page id is:"+pid);
			
			//create an object for the eventFiringwebdriver class
			EventFiringWebDriver evnt=new  EventFiringWebDriver(driver);
			evnt.executeScript("window.scrollBy(0,4000)", " ");
			Thread.sleep(3000);
			//quit the browser
			driver.quit();
			
			
			

	}

}
