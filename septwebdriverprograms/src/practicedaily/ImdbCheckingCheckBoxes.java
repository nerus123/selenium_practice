package practicedaily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbCheckingCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("http://www.imdb.com/list/ls000632473/");
		
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
		
		//fetch all check boxes into collection
		List<WebElement>ck_bxs=driver.findElements(By.name("genres"));
		System.out.println(ck_bxs.size());
		for(WebElement c:ck_bxs){
			System.out.println(c.getText());
			if(!c.isSelected()){
				c.click();
				//new WebDriverWait(driver,30).until(ExpectedConditions.invisibilityOfElementLocated(locator))
			}
		}
   
		//quit the browser
		//driver.quit();
	}

}
