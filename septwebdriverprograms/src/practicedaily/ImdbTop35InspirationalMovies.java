package practicedaily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImdbTop35InspirationalMovies {

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
		
		
		//*[@id='main']/div/div[7]/div[1]/div[3]/b/a
		//*[@id='main']/div/div[7]/div[2]/div[3]/b/a
		//fetch all links
		List<WebElement>links=driver.findElements(By.xpath("//*[@id='main']/div/div[7]/div"));
		System.out.println(links.size());
		for(int i=1;i<=links.size();i++){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			String txt1=driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).getText();
			System.out.println(txt1);
			//fetch the url
			String url1=driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).getAttribute("href");
			System.out.println(url1);
			
			//click on each link
			driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).click();
			if(driver.getTitle().contains(txt1)){
				System.out.println("correct page is dispalyed:"+driver.getTitle());
			}else{
				System.out.println("correct page is not displayed");
			}
			
			//go back to previous page
			driver.navigate().back();
			
		}
		
//quit the browser
		driver.quit();

	}

}
