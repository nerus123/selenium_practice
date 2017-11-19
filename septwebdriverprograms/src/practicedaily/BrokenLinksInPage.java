package practicedaily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksInPage {

	public static void main(String[] args) {
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
					driver.get("http://newtours.demoaut.com/");
					
					//fetch all links into collection
					List<WebElement>alllinks=driver.findElements(By.tagName("a"));
					
					//create static array to store in static array
					String[] linktexts=new String[alllinks.size()];
					
					int i=0;
					for(WebElement l:alllinks){
					linktexts[i]=l.getText();
					i++;
					}
					//click on each link and verify page title
					for(String t:linktexts){
						driver.findElement(By.linkText(t)).click();
						if(driver.getTitle().contains(expresult)){
							System.out.println("\""+t+"\"" ");
						}
					}
						
					
					

	}

}
