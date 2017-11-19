package practicedaily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.navigate().to("http://www.linkedin.com/");
				
				//fetch the page title
				String txt=driver.getTitle();
				System.out.println("page title is:"+txt);

				//fetch the current page url
				String url=driver.getCurrentUrl();
				System.out.println("current page absolute url is:"+url);
				
				
				//fetch page source
				String src=driver.getPageSource();
				
				//get window handle
				String pid=driver.getWindowHandle();
				System.out.println("page id is:"+pid);
				
				//fetch all links 
				List<WebElement>alllinks=driver.findElements(By.tagName("a"));
				
				System.out.println(alllinks.size());
				for(WebElement l:alllinks){
					System.out.println("********************************************");
					System.out.println(l.getText());
					System.out.println(l.getAttribute("href"));
					
					
		}
				
				
				//quit the browser
				driver.quit();
				
				

	}

}
