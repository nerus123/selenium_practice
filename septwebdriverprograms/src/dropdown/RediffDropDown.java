package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("http://www.rediff.com");
		
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
		
		
		//click on create account rediffmail link
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		
		//verify the page title
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.titleContains("Rediffmail Free Unlimited Storage"));
		
		System.out.println("page title is verified");
		
		//identify the country dropdown
		WebElement cntry_drp=driver.findElement(By.id("country"));
		
		//fetch all dropdown elements
		
		List<WebElement>opts=cntry_drp.findElements(By.tagName("option"));
		System.out.println("size is:"+opts.size());
		for(WebElement o:opts){
			System.out.println(o.getText());
			if(o.getText().equals("Angola")){
				o.click();
				break;
			}
		}
        
		Thread.sleep(3000);
		//close th ebrowser
		driver.quit();
	}

}
