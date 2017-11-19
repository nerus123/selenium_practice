package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EdgeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set the edgebrowser exe path
		System.setProperty("webdriver.edge.driver", "C:\\NEERAJA\\MicrosoftWebDriver.exe");
		
       //launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximise the winow
		driver.manage().window().maximize();
		
		//open the url
				driver.get("http://www.google.com");
				
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
				

				//type the keyword selenium in search edit box
				driver.findElement(By.id("lst-ib")).sendKeys("selenium");
				
				//submit on editbox
				driver.findElement(By.id("lst-ib")).submit();
				
				//verify the page tutle
				WebDriverWait wait=new WebDriverWait(driver,30);
				
				wait.until(ExpectedConditions.titleContains("selenium - Google Search"));
				System.out.println("page title is verified");

				//verify whether the results text is displayed or not
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='resultStats']")));
				
				//fetch the text
				String txt1=driver.findElement(By.xpath("//*[@id='resultStats']")).getText();
				
				System.out.println("results txt is:"+txt1);
				
				//extract onlynumber
				String[] txt2=txt1.split(" ");
				System.out.println("result count is:"+txt2[1]);
				
				//click on Feedback
				//Selenium - Web Browser Automation
				driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
				
				//verify the page title
				wait.until(ExpectedConditions.titleContains("Selenium - Web Browser Automation"));
				
				
				//click on download tab
				driver.findElement(By.linkText("Download")).click();
				
				//verify the page title
				wait.until(ExpectedConditions.titleContains("Downloads"));
				
				Thread.sleep(3000);
				//go to previous [age
				driver.navigate().back();
			
				
				
				//go to next page
				driver.navigate().forward();
				
				//refresh
				driver.navigate().refresh();
				
						
				//quit the browser
				//driver.quit();
				
				

}
}
