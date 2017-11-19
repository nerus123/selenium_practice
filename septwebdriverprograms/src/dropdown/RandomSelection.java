package dropdown;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RandomSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//open the url
				driver.get("http://www.ebay.in");
				
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
				
				//identify all catagories dropdown
				
				WebElement cat_drp=driver.findElement(By.id("gh-cat"));
				
				//create an object for select class
				Select sel=new Select(cat_drp);
				
				//fetch all dropdown options
				List<WebElement>opts=sel.getOptions();
				int size=opts.size();
				
				//create an object for random class
				Random r=new Random();
				
				//generate random number
				int rnum=r.nextInt(size);
				
				//select an option by index
				sel.selectByIndex(rnum);
				Thread.sleep(3000);
				
				//close the browser
				driver.close();
				
				

	}

}
