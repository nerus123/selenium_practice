package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryToolTip {

	public static void main(String[] args) {
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
					driver.get("http://jqueryui.com/tooltip/");

					//identify the iframe
					WebElement ifrm=driver.findElement(By.className("demo-frame"));
					
					//switch to iframe
					driver.switchTo().frame(ifrm);
					
					//fetch the tooltip
					//String tp1=driver.findElement(By.linkText("Tooltips")).getAttribute("title");
					//System.out.println(tp1);
					///idenity the eleemnt
					WebElement tp=driver.findElement(By.linkText("Tooltips"));
					//create an object for Actions class
					Actions act=new Actions(driver);
					
					act.moveToElement(tp).perform();
					
				System.out.println(tp.getAttribute("title"));
					
					
					
					
	}

}
