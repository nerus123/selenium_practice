package rajesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				 
				 //maximise the window
				 driver.manage().window().maximize();
				 
				 //add implicit wait
				 
				
				//open the url
				driver.get("https://www.facebook.com/"); 
				
				List<WebElement>tables=driver.findElements(By.tagName("table"));
				System.out.println(tables.size());
				
				
				
				

	}

}
