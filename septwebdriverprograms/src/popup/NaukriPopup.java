package popup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			              
					//launch the browser
					WebDriver driver=new ChromeDriver();
			
			  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
					
					//launch the browser
					//WebDriver driver=new FirefoxDriver();
					
					//maximise the window
					driver.manage().window().maximize();
					
					//open the url
					driver.get("https://www.naukri.com/");
					
					//fetch window id
					String pid=driver.getWindowHandle();
					System.out.println(pid);
					
					//fetch the winow handles
					Set<String>handles=driver.getWindowHandles();
					System.out.println(handles.size());
					
					for(String h:handles){
						if(!pid.equals(h)){
							//switch to the child window
							driver.switchTo().window(h);
							//close the child window
							driver.close();
						}
					}
				//switch to the parent window
					driver.switchTo().window(pid);
					
				//identify the search edit box
					driver.findElement(By.className("searchJob")).sendKeys("selenumjobs");
					//driver.findElement(By.xpath("//*[@id='qsbClick']/span[1]")).sendKeys("seleniumjobs");
					Thread.sleep(3000);
					
					//click on search button
					driver.findElement(By.xpath("//*[@id='qsbClick']/span[2]")).click();
					
					//quit the browser
					//driver.quit();
					

	}

}
