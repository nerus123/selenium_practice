package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImdbTop35InspirationMovies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set the system variable gecko driver
				System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				//launch the browser
				//interface refvar=new implementing class();\
			 WebDriver driver=new FirefoxDriver();
		///set the chromedriver path
				//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				//WebDriver driver=new ChromeDriver();
				
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
				//*[@id='main']/div/div[7]/div[6]/div[3]/b/a
				
				//fetch all elemnets into collectin
				List<WebElement>alllinks=driver.findElements(By.xpath("//*[@id='main']/div/div[7]/div"));
				System.out.println(alllinks.size());
				
				for(int i=1;i<=alllinks.size();i++){
					System.out.println("************************************************");
					//fetch the text
					String txt1=driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).getText();
					System.out.println(txt1);
					//fetch the url
					String url1=driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).getAttribute("href");
					System.out.println(url1);
					
					//clik on link
					driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div["+i+"]/div[3]/b/a")).click();
					if(driver.getTitle().contains(txt1)){
						System.out.println("correct page is dispalyed:"+driver.getTitle());
					}else{
						System.out.println("correct page is not dispalyed:"+driver.getTitle());
					}
					
					//goto previous page
					driver.navigate().back();
					
					
					
				}
				
				
Thread.sleep(3000);
	}

}
