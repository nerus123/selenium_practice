package practicedaily;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
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
					driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
					
            //create a variable for JavascriptExecutor and assign it  to driver variable
					 JavascriptExecutor jsx=(JavascriptExecutor) driver;
					 
					 
					 //identify the elemnt
					 WebElement element=driver.findElement(By.xpath("//*[@id='mCSB_4_container']/p[11]"));
					 jsx.executeScript("arguments[0].scrollIntoView(true);", element);
					 
					 //extract the text
					 System.out.println(element.getText());
					 Thread.sleep(3000);
					 
					
	}

}
