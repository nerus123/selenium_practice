package rajesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ContactForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		//WebDriver driver=new FirefoxDriver();
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
	//System.setProperty("webdriver.ie.driver", "C:\\NEERAJA\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
    
	//launch the browser
	//WebDriver driver=new InternetExplorerDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		
		
		  //open url
		driver.get("http://www.mycontactform.com/how.php");
		 //driver.get("http://www.amazon.com/");
		
		//fetches tables
		List<WebElement>tables=driver.findElements(By.tagName("table"));
		System.out.println("number of tables:"+tables.size());

		

	}

}
