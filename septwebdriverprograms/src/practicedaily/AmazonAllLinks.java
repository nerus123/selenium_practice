package practicedaily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://www.amazon.com/");
		
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
		
		//fetch all links in the page
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		/*for(WebElement l:links){
			System.out.println("******************************8");
			System.out.println(l.getText());
			System.out.println(l.getAttribute("href"));
		}*/
		//*[@id='navFooter']/div[1]/div/div[1]/ul/li[1]/a
		//*[@id='navFooter']/div[1]/div/div[1]/ul/li[2]/a
		
		for(int i=1;i<=links.size();i++){
			///*[@id='nav-recently-viewed']
			//*[@id='nav-your-amazon']
			String txt1=driver.findElement(By.xpath("//*[@id='navFooter']/div[1]/div/div[1]/ul/li["+i+"]/a")).getText();
			System.out.println(txt1);
		}
		
		//quit the browser
		//driver.quit();
		

	}

}
