package rizwaana;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AazonOtherTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			
			//launch the browser
			//WebDriver driver=new FirefoxDriver();
		  
		  //System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			//launch the browser
			//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "C:\\NEERAJA\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
        
		//launch the browser
		WebDriver driver=new InternetExplorerDriver();
			 //maximise the window
			 driver.manage().window().maximize();
			
			
			  //open url
			driver.get("https://www.amazon.com/");
			
			//idenity the table
			WebElement table=driver.findElement(By.className("rhf-loading-middle"));
			//List<WebElement>rows=table.findElements(By.xpath("//table[@class='rhf-loading-middle']/tbody/tr"));
			
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			
			System.out.println(rows.size());
			
			table.findElement(By.xpath("//table[@class='rhf-loading-middle']/tbody/tr")).click();
			
	}
}
