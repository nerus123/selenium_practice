package practicedaily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionLInkBusinessSolutions {

	public static void main(String[] args) {
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
				
				//identify the business solution
				WebElement bs=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[2]/ul"));
				////*[@id='layout-main']/div/div[3]/div[2]/div[2]/ul/li[1]/a
				//*[@id='layout-main']/div/div[3]/div[2]/div[2]/ul/li[1]/a
				
				//fetch all links into collection
				List<WebElement>bs_links=bs.findElements(By.tagName("a"));
				
				
				/*for(WebElement b:bs_links){
					System.out.println("***************************************");
					
					System.out.println(b.getText());
					System.out.println(b.getAttribute("href"));
				}*/
				for(int i=1;i<=bs_links.size();i++){
					System.out.println("**************************************************************");
					//fetch the text
					String txt1=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[2]/ul/li["+i+"]/a")).getText();
					System.out.println(txt1);
					//fetch the url
					String url1=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[2]/ul/li["+i+"]/a")).getAttribute("href");
					System.out.println(url1);
					
					//click on link
					driver.findElement(By.xpath("//*[@id='layout-main']/div/div[3]/div[2]/div[2]/ul/li["+i+"]/a")).click();
					if(driver.getTitle().contains(txt1)){
						System.out.println("correct page is displayed:"+driver.getTitle());
					}else{
						System.out.println("correct page is not displayed");
					}
					//goback to previous page
					driver.navigate().back();
					
							
				}
				//quit the browser
				driver.quit();
	}

}
