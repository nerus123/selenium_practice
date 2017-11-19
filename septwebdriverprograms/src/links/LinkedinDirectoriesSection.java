package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinDirectoriesSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("http://www.linkedin.com/");
		
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
		
		//identiy the directories section link
	  WebElement dir_links=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[4]/ul"));
	  //fetch all links into collection
	  List<WebElement>alllinks=dir_links.findElements(By.tagName("a"));
	  System.out.println(alllinks.size());
	for(int i=1;i<=alllinks.size();i++){
		System.out.println("****************************************");
		//fetch the text
		
		//*[@id='layout-main']/div/div[3]/div[2]/div[4]/ul/li[1]/a
		//*[@id='layout-main']/div/div[3]/div[2]/div[4]/ul/li[2]/a
		
		String txt1=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[4]/ul/li["+i+"]/a")).getText();
		System.out.println(txt1);
		//fetch the url of the link
		String url1=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[4]/ul/li["+i+"]/a")).getAttribute("href");
		System.out.println(url1);
		//click on link
		driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[4]/ul/li["+i+"]/a")).click();
		
		if(driver.getTitle().contains(txt1)){
			System.out.println("correct page is displayed:"+driver.getTitle());
		}else{
			System.out.println("correct page is not dispalyed:"+driver.getTitle());
		}
		//go to previous page
		driver.navigate().back();
	}
		Thread.sleep(3000);
		///quit the browser
		driver.quit();

	}

}
