package practicedaily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Scroll {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.get("https://www.linkedin.com/");
				
				//scroll th page by EventFiringWebDriver class
				//create an object for EventFiringWebDriver class and pass value to the object
				EventFiringWebDriver evnt=new EventFiringWebDriver(driver);
				//scroll down
				evnt.executeScript("window.scrollBy(0,4000)", " ");
				Thread.sleep(3000);
				//scroll up
				evnt.executeScript("window.scrollBy(4000,0)", " ");
				Thread.sleep(3000);
				//quit the browser
				driver.quit();
				
				

	}

}
