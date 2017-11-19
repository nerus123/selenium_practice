package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinSectionLinks {

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
				
				//identify the gemeral section
				WebElement gen_section=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[1]/ul"));
				
				//fetch all the links from general section using findelements api
				List<WebElement>alllinks=gen_section.findElements(By.tagName("a"));
				
				for(int i=1;i<=alllinks.size();i++){
					System.out.println("*********************************************************");
					//fetch the each link text
					String txt1=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[1]/ul/li["+i+"]/a")).getText();
					System.out.println("link text is:"+txt1);
					
					//fetch the url of the link
					String url1=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[1]/ul/li["+i+"]/a")).getAttribute("href");
					System.out.println("each link url is:"+url1);
					
					//click on link
					driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[1]/ul/li["+i+"]/a")).click();
					
					if(driver.getTitle().contains(txt1)){
						System.out.println("correct page is displayed:"+driver.getTitle());
					}else{
						System.out.println("correct page is not displayed:"+driver.getTitle());
					}
					
					//go to previous page
					driver.navigate().back();
				}
				Thread.sleep(3000);
				
				//quit the browser
				driver.quit();
				}
					
				
				
	

}
