package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.navigate().to("http://newtours.demoaut.com/");
		
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
		
		String expTitle="Not Found";
		//fetch all the page linsks to collection
		List<WebElement>linkElements=driver.findElements(By.tagName("a"));
		
           //create a static array to store the link names
		//datatype[] arrayname=new datatype[size];
		String[] strLinks=new String[linkElements.size()];
		
		//extract the link name
		int i=0;
		for(WebElement e:linkElements){
		strLinks[i]=e.getText();
		i++;
		
		}
		//iterate all the linknames by for each loop
		for(String s:strLinks){
			//click on each link
			driver.findElement(By.linkText(s)).click();
			if(driver.getTitle().contains(expTitle)){
				System.out.println(s+"link is broken:"+driver.getTitle());
				
			}else{
				System.out.println(s+"link is working:"+driver.getTitle());
			}
			//navigate back
			driver.navigate().back();
		}
		Thread.sleep(3000);
		//quit the browser
		driver.quit();
	}

}
