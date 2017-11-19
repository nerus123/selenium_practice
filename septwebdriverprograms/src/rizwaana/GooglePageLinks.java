package rizwaana;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePageLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		WebDriver driver=new FirefoxDriver();
		//set the chrome driver path
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		
		//launch the browser
		 //WebDriver driver=new ChromeDriver();
		 
		 //maximise the window
		 driver.manage().window().maximize();
		 
		 //open the url
		 driver.get("https://www.google.com/");
		 
		 //verify the page title
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.titleContains("Google"));
		 
		 //fetch all links into collection
		 List<WebElement>tot_links=
				 driver.findElements(By.tagName("a"));
		 System.out.println("total number of links in google page:"+tot_links.size());
		 
		 for(WebElement t:tot_links){
			 System.out.println(t.getText());
			 
		 }
		

		 
		 //fetch the text
			WebElement ele = (WebElement) tot_links.toArray()[0];
			System.out.println("text of oth postion link text is:"+ele.getText());
			ele.click();
			
			Thread.sleep(3000);
			
			//close the browser
			driver.quit();
		 
			
		 

		 

	}

}
