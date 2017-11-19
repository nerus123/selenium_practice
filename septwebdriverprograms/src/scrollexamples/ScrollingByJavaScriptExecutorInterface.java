package scrollexamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollingByJavaScriptExecutorInterface {



		public static void main(String[] args) throws InterruptedException {
		///set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.get("https://www.flipkart.com/");
				
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
				
				//
				JavascriptExecutor jsx=(JavascriptExecutor) driver;
	jsx.executeScript("window.scrollBy(0,4000)", " ");
	Thread.sleep(3000);
//scrolling up
	jsx.executeScript("window.scrollBy(4000,0)", " ");
	Thread.sleep(3000);
	}

}
