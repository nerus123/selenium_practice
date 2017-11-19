package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJavaScriptExecutorClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		//launch the browser
	WebDriver driver=new ChromeDriver();

  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		//WebDriver driver=new FirefoxDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://www.linkedin.com/");
		
		//identify forgotten password likn
		WebElement frgt_link=driver.findElement(By.linkText("Forgot password?"));
		
		//click forgotten link by java script executor
		//assign javascriptexecutor vraiable to driver
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		
		jsx.executeScript("arguments[0].click()", frgt_link);
		
		//quit the browser
		driver.close();

	}

}
