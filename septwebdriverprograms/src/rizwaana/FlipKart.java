package rizwaana;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set the chrome driver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
				
				//launch the browser
				 WebDriver driver=new ChromeDriver();
				 
				 //maximise the window
				 driver.manage().window().maximize();
				 
				 //open the url
				 driver.get("https://www.amazon.com/");
				 
				 
				//fetch all links into collection
				 List<WebElement>tot_tables=driver.findElements(By.tagName("table"));
				 System.out.println("total number of tables in flipkart page:"+tot_tables.size());
				
				 
				 
				 //close the broswer
				 driver.quit();

	}

}
