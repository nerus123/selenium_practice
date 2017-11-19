package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set the chromedriver path
		//set the chromedriver path
		  System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32_2\\chromedriver.exe");
	      
					//launch the browser
				WebDriver driver=new ChromeDriver();
				
			 //maximise the window
			 driver.manage().window().maximize();
			 
			 driver.get("http://www.facebook.com");
			 
			 //fetch no of links in webpage
			 List<WebElement>alllinks=driver.findElements(By.tagName("a"));
			 System.out.println("total number of links:"+alllinks.size());
			 
			 for(WebElement l:alllinks){
				 System.out.println(l.getText());
			 }

	}

}
